package com.example.roomsample.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import com.example.roomsample.database.model.Genre

@Dao
interface GenreDAO{
    @Insert
    fun insertGenre(vararg genres: Genre)
    @Delete
    fun deleteGenre(genre: Genre)
}