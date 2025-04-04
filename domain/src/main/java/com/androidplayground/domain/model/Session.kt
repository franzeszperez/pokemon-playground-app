package com.androidplayground.domain.model

data class Session(
    val id: String,
    val title: String,
    val description: String,
    val speaker: String,
    val date: String,
    val duration: Int, // in minutes
    val imageUrl: String
) 