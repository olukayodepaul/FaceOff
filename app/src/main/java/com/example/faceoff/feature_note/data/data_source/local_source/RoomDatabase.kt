package com.example.faceoff.feature_note.data.data_source.local_source

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Entity::class], version = 1, exportSchema = false)
abstract class RoomDatabase: RoomDatabase() {

    abstract val noteDao : DatabaseDoa

    companion object {
        const val DATABASE_NAME = "notes_db"
    }

}