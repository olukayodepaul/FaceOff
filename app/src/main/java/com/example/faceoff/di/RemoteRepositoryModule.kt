package com.example.faceoff.di

import com.example.faceoff.feature_note.data.data_source.remote_source.Api
import com.example.faceoff.feature_note.data.repository.remote_repository.RemoteRepositoryImpl
import com.example.faceoff.feature_note.domain.repository.remote.RemoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RemoteRepositoryModule {

    @Provides
    @Singleton
    fun remoteRepository(api: Api): RemoteRepository {
        return RemoteRepositoryImpl(api)
    }

}