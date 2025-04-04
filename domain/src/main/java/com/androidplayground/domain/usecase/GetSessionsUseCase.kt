package com.androidplayground.domain.usecase

import com.androidplayground.domain.model.Session
import com.androidplayground.domain.repository.SessionRepository
import kotlinx.coroutines.flow.Flow

class GetSessionsUseCase constructor(
    private val repository: SessionRepository
) {
    operator fun invoke(): Flow<List<Session>> = repository.getSessions()
} 