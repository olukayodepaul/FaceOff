package com.example.faceoff.feature_note.domain.use_case

import com.example.faceoff.feature_note.domain.model.local_model.Profiles
import com.example.faceoff.feature_note.domain.repository.local.LocalRepository
import com.example.faceoff.feature_note.domain.repository.remote.RemoteRepository
import com.example.faceoff.feature_note.domain.util.NoteOrder
import com.example.faceoff.feature_note.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

//this is get reference to use case
//injecting it
class GetNoteUseCase(
    private val localRepo: LocalRepository,
    private val remoteRepo: RemoteRepository
) {

    operator fun invoke(
        noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending)
    ): Flow<List<Profiles>> {
        return localRepo.getNotes().map { notes ->
            when(noteOrder.orderType) {
                is OrderType.Ascending -> {
                    when(noteOrder) {
                        is NoteOrder.Title -> notes.sortedBy { it.title.lowercase() }
                        is NoteOrder.Date -> notes.sortedBy { it.timestamp }
                        is NoteOrder.Color -> notes.sortedBy { it.color }
                    }
                }
                is OrderType.Descending -> {
                    when(noteOrder) {
                        is NoteOrder.Title -> notes.sortedByDescending { it.title.lowercase() }
                        is NoteOrder.Date -> notes.sortedByDescending { it.timestamp }
                        is NoteOrder.Color -> notes.sortedByDescending { it.color }
                    }
                }
            }
        }
    }

}




