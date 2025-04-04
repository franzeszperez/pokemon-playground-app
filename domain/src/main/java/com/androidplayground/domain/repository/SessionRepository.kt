package com.androidplayground.domain.repository

import com.androidplayground.domain.model.Session
import kotlinx.coroutines.flow.Flow

interface SessionRepository {
    fun getSessions(): Flow<List<Session>>
    suspend fun getSessionById(id: String): Session?
} 