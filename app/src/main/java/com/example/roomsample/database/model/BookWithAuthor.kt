package com.example.roomsample.database.model

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class BookWithAuthor (
    @Embedded
    val book: Book,
    @Relation(
        parentColumn = "idBook",
        entityColumn = "idAuthor",
        associateBy = Junction(AuthorBookRef::class)
    )
    val authors: List<Author>
)
