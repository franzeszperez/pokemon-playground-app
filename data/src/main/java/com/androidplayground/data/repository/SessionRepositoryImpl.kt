package com.androidplayground.data.repository

import com.androidplayground.domain.model.Session
import com.androidplayground.domain.repository.SessionRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList

class SessionRepositoryImpl : SessionRepository {
    override fun getSessions(): Flow<List<Session>> = flow {
        emit(
            listOf(
                Session(
                    id = "1",
                    title = "Introduction to Jetpack Compose",
                    description = "Learn the basics of Jetpack Compose and how to build modern UIs",
                    speaker = "Pikachu",
                    date = "2024-04-01",
                    duration = 60,
                    imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png"
                ),
                Session(
                    id = "2",
                    title = "Android Architecture Components",
                    description = "Deep dive into ViewModel, LiveData, and Room",
                    speaker = "Charizard",
                    date = "2024-04-15",
                    duration = 90,
                    imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/6.png"
                ),
                Session(
                    id = "3",
                    title = "Kotlin Coroutines in Practice",
                    description = "Master asynchronous programming with Kotlin Coroutines",
                    speaker = "Mewtwo",
                    date = "2024-04-22",
                    duration = 75,
                    imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/150.png"
                ),
                Session(
                    id = "4",
                    title = "Testing in Android",
                    description = "Best practices for unit and integration testing",
                    speaker = "Bulbasaur",
                    date = "2024-04-29",
                    duration = 60,
                    imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png"
                ),
                Session(
                    id = "5",
                    title = "Material Design 3",
                    description = "Creating beautiful UIs with Material Design 3",
                    speaker = "Eevee",
                    date = "2024-05-06",
                    duration = 45,
                    imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/133.png"
                ),
                Session(
                    id = "6",
                    title = "Dependency Injection with Koin",
                    description = "Learn how to implement DI in your Android app",
                    speaker = "Squirtle",
                    date = "2024-05-13",
                    duration = 60,
                    imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png"
                ),
                Session(
                    id = "7",
                    title = "Android Performance Optimization",
                    description = "Tips and tricks for optimizing your app's performance",
                    speaker = "Dragonite",
                    date = "2024-05-20",
                    duration = 90,
                    imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/149.png"
                )
            )
        )
    }

    override suspend fun getSessionById(id: String): Session? {
        return TODO()
    }
} 