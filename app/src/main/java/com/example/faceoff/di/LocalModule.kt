package com.example.faceoff.di

import android.app.Application
import androidx.room.Room
import com.example.faceoff.feature_note.data.data_source.local_source.DatabaseDoa
import com.example.faceoff.feature_note.data.data_source.local_source.RoomDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object LocalModule {

    @Provides
    @Singleton
    fun provideDatabase(app: Application): RoomDatabase {
        return Room.databaseBuilder(
            app, RoomDatabase::class.java, RoomDatabase.DATABASE_NAME
        ).fallbackToDestructiveMigration().build()
    }

    @Singleton
    @Provides
    fun provideDao(db: RoomDatabase): DatabaseDoa {
        return db.noteDao
    }

}