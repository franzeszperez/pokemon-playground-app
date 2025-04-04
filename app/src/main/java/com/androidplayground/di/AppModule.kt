package com.androidplayground.di

import di.sessionsModule
import di.dataModule
import di.domainModule
import org.koin.dsl.module

val appModule = module {
    includes(dataModule, domainModule, sessionsModule)
} 