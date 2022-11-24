package com.example.faceoff.feature_note.data.data_source.local_source

import androidx.room.*
import kotlinx.coroutines.flow.Flow


@Dao
interface DatabaseDoa {

    @Query("SELECT * FROM profile")
    fun getNotes(): Flow<List<Entity>>

}