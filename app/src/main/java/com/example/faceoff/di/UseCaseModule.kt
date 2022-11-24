package com.example.faceoff.di

import com.example.faceoff.feature_note.domain.repository.local.LocalRepository
import com.example.faceoff.feature_note.domain.repository.remote.RemoteRepository
import com.example.faceoff.feature_note.domain.use_case.DeleteNoteUseCase
import com.example.faceoff.feature_note.domain.use_case.GetNoteUseCase
import com.example.faceoff.feature_note.domain.use_case.UseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun provideUseCase(
        localRepo: LocalRepository,
        remoteRepository: RemoteRepository
    ) : UseCase {
        return UseCase(
            deleteNoteUseCase = DeleteNoteUseCase(localRepo, remoteRepository),
            getNoteUseCase = GetNoteUseCase(localRepo, remoteRepository)
        )
    }

}