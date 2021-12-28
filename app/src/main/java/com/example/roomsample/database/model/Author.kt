package com.example.roomsample.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation

@Entity(tableName = "authors")
data class Author(@PrimaryKey(autoGenerate = true)
                  @ColumnInfo(name = "idAuthor") val idAuthor:Long,
                  @ColumnInfo(name = "lName") val lastname: String,
                  @ColumnInfo(name = "fName") val firstname: String,
                  @ColumnInfo(name = "sName")  val surname: String)