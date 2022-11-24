package com.example.faceoff.feature_note.data.repository.local_repository

import com.example.faceoff.feature_note.data.data_source.local_source.DatabaseDoa
import com.example.faceoff.feature_note.data.data_source.local_source.toConvert
import com.example.faceoff.feature_note.domain.model.local_model.Profiles
import com.example.faceoff.feature_note.domain.repository.local.LocalRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


class LocalRepositoryImpl (private val doa : DatabaseDoa): LocalRepository {

    override  fun getNotes(): Flow<List<Profiles>> {
        return doa.getNotes().map { it.map { result->result.toConvert() } }
    }

}

//what do i need to learn quickly is a coroutines flow
