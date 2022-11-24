package com.example.faceoff.feature_note.domain.repository.local

import com.example.faceoff.feature_note.domain.model.local_model.Profiles
import kotlinx.coroutines.flow.Flow


interface LocalRepository {
    fun getNotes(): Flow<List<Profiles>>
}