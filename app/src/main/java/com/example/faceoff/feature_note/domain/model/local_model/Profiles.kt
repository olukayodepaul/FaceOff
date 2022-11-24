package com.example.faceoff.feature_note.domain.model.local_model


data class Profiles(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    val id: Int? = null
)


