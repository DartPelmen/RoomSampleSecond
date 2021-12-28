package com.example.roomsample.database.dao

import androidx.room.*
import com.example.roomsample.database.model.AuthorBookRef
import com.example.roomsample.database.model.Book
import com.example.roomsample.database.model.BookWithAuthor

@Dao
interface BookDAO {
        @Insert
        fun insertBooks(vararg books: Book)
        @Delete
        fun deleteAuthors(book: Book)

        @Transaction
        @Query("SELECT * FROM BOOKS")
        fun getAllBooksWithAuthor():List<BookWithAuthor>

        @Query("SELECT * FROM BOOKS")
        fun getAllAuthors():List<Book>

        @Insert
        fun addAuthors(vararg authorRef: AuthorBookRef)

        @Delete
        fun deleteAuthor(authorRef: AuthorBookRef)

}