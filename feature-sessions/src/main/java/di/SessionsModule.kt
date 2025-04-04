package di

import com.androidplayground.feature.sessions.presentation.SessionsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val sessionsModule = module {
    viewModel { SessionsViewModel(get()) }
} 