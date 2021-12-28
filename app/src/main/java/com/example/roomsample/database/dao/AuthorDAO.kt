package com.example.roomsample.database.dao

import androidx.room.*
import com.example.roomsample.database.model.Author
import com.example.roomsample.database.model.AuthorBookRef
import com.example.roomsample.database.model.AuthorWithBooks

@Dao
interface AuthorDAO {
    @Insert
    fun insertAuthors(vararg author: Author)
    @Delete
    fun deleteAuthors(author: Author)

    @Transaction
    @Query("SELECT * FROM AUTHORS")
    fun getAllAuthorsWithBooks():List<AuthorWithBooks>

    @Query("SELECT * FROM AUTHORS")
    fun getAllAuthors():List<Author>

    @Insert
    fun addBooks(vararg bookRef: AuthorBookRef)

    @Delete
    fun deleteBooks(bookRef: AuthorBookRef)
}