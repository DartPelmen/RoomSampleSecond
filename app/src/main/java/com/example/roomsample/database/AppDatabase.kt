package com.example.roomsample.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.roomsample.database.dao.AuthorDAO
import com.example.roomsample.database.dao.BookDAO
import com.example.roomsample.database.dao.GenreDAO
import com.example.roomsample.database.model.Author
import com.example.roomsample.database.model.AuthorBookRef
import com.example.roomsample.database.model.Book
import com.example.roomsample.database.model.Genre

@Database(entities = [Author::class, Book::class, Genre::class, AuthorBookRef::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun authorDao():AuthorDAO
    abstract fun bookDao(): BookDAO
    abstract fun genreDao(): GenreDAO

    companion object {
        @Volatile
        private var instance: AppDatabase? = null
        fun getInstance(context: Context): AppDatabase {
            if (instance==null)
                synchronized(AppDatabase::class.java) {
                    if (instance == null) {
                        instance = Room.databaseBuilder(
                            context,
                            AppDatabase::class.java, "sample-database"
                        ).build()

                    }
                }
            return instance!!
        }

    }
}

