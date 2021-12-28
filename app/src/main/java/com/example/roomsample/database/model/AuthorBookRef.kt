package com.example.roomsample.database.model

import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(primaryKeys = ["idAuthor", "idBook"])
data class AuthorBookRef(
    val idAuthor: Long,
    val idBook: Long)