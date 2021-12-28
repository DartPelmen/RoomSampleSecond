package com.example.roomsample.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "genres")
data class Genre (@PrimaryKey(autoGenerate = true)
                  val idGenre: Long,
                  @ColumnInfo(name = "name") val name: String)