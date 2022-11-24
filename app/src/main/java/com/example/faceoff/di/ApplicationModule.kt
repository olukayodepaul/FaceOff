package com.example.faceoff.di

import android.content.Context
import com.example.faceoff.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {

    @Provides
    @Singleton
    fun provideApplication(@ApplicationContext app: Context) : Application {
        return app as Application
    }

}