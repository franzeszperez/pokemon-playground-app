package com.androidplayground.feature.sessions.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.androidplayground.domain.usecase.GetSessionsUseCase
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class SessionsViewModel(
    private val getSessionsUseCase: GetSessionsUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(SessionsState())
    val state: StateFlow<SessionsState> = _state.asStateFlow()

    private val _effect = MutableSharedFlow<SessionsEffect>()
    val effect: SharedFlow<SessionsEffect> = _effect.asSharedFlow()

    fun onEvent(event: SessionsEvent) {
        when (event) {
            is SessionsEvent.LoadSessions -> loadSessions()
            is SessionsEvent.SessionClicked -> onSessionClicked(event.sessionId)
        }
    }

    private fun loadSessions() {
        viewModelScope.launch {
            _state.update { it.copy(isLoading = true) }
            try {
                getSessionsUseCase().collect { sessions ->
                    _state.update { it.copy(sessions = sessions, isLoading = false) }
                }
            } catch (e: Exception) {
                _state.update { it.copy(isLoading = false, error = e.message) }
                _effect.emit(SessionsEffect.ShowError(e.message ?: "Unknown error"))
            }
        }
    }

    private fun onSessionClicked(sessionId: String) {
        viewModelScope.launch {
            _effect.emit(SessionsEffect.NavigateToSessionDetails(sessionId))
        }
    }
} 