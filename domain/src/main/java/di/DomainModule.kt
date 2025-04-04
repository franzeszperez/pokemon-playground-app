package di

import com.androidplayground.domain.usecase.GetSessionsUseCase
import org.koin.dsl.module

val domainModule = module {
    factory { GetSessionsUseCase(get()) }
} 