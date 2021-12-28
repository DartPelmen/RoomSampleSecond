package com.example.roomsample.database.model

import androidx.room.*
import androidx.room.ForeignKey.CASCADE
import androidx.room.ForeignKey.RESTRICT

@Entity(tableName = "books", foreignKeys = [ForeignKey(entity = Genre::class, onDelete = RESTRICT, onUpdate = CASCADE, parentColumns = ["idGenre"], childColumns = ["genreId"])])
data class Book(@PrimaryKey(autoGenerate = true)
                val idBook: Long,
                @ColumnInfo(name = "title") val title: String,
                @ColumnInfo(name = "genreId") val genreId: Long)

