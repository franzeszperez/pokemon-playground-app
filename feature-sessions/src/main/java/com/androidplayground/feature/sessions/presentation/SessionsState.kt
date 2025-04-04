package com.androidplayground.feature.sessions.presentation

import com.androidplayground.domain.model.Session

data class SessionsState(
    val sessions: List<Session> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)

sealed interface SessionsEvent {
    data object LoadSessions : SessionsEvent
    data class SessionClicked(val sessionId: String) : SessionsEvent
}

sealed interface SessionsEffect {
    data class NavigateToSessionDetails(val sessionId: String) : SessionsEffect
    data class ShowError(val message: String) : SessionsEffect
} 