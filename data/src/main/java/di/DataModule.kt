package di

import com.androidplayground.data.repository.SessionRepositoryImpl
import com.androidplayground.domain.repository.SessionRepository
import org.koin.dsl.module

val dataModule = module {
    single<SessionRepository> { SessionRepositoryImpl() }
} 