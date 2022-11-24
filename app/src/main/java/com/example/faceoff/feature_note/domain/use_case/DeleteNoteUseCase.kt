package com.example.faceoff.feature_note.domain.use_case

import com.example.faceoff.feature_note.domain.repository.local.LocalRepository
import com.example.faceoff.feature_note.domain.repository.remote.RemoteRepository
import javax.inject.Inject

class DeleteNoteUseCase @Inject constructor(
    private val localRepo: LocalRepository,
    private val remoteRepository: RemoteRepository
) {

}