package com.example.faceoff.feature_note.data.data_source.local_source

import androidx.room.Entity
import androidx.room.PrimaryKey

//This is a data
@Entity(tableName = "profile")
data class Entity(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey(autoGenerate = false)
    val id: Int? = null
)


