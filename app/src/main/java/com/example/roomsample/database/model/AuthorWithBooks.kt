package com.example.roomsample.database.model

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class AuthorWithBooks (
    @Embedded
    val author: Author,
    @Relation(
        parentColumn = "idAuthor",
        entityColumn = "idBook",
        associateBy = Junction(AuthorBookRef::class))
    val books: List<Book>
)