package com.example.faceoff.di

import com.example.faceoff.feature_note.data.data_source.local_source.DatabaseDoa
import com.example.faceoff.feature_note.data.repository.local_repository.LocalRepositoryImpl
import com.example.faceoff.feature_note.domain.repository.local.LocalRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalRepositoryModule {

    @Provides
    @Singleton
    fun provideRepository(
        localRepo : DatabaseDoa
    ): LocalRepository {
        return LocalRepositoryImpl(localRepo)
    }

}