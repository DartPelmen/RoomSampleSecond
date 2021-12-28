package com.example.roomsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.roomsample.database.AppDatabase
import com.example.roomsample.database.model.*
import java.util.concurrent.Executors
import java.util.concurrent.FutureTask


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Executors.newSingleThreadExecutor().execute {
            val t = AppDatabase
                .getInstance(applicationContext)
//            val genre = Genre(1,"classic")
//            val authors = arrayOf(Author(1,"Pushkin","Alexander","Sergeevich"),
//                Author(2,"Fet","Aphanasiy","Aphanasievich"))
//            val books = arrayOf(
//                Book(1,"Pushkins book",1),
//                Book(2,"Fets book",1))
//            t.genreDao().insertGenre(genre)
//            t.authorDao().insertAuthors(authors[0],authors[1])
//            t.bookDao().insertBooks(books[0],books[1])
//            val a1 = AuthorBookRef(1, 1)
//            val a2 = AuthorBookRef(2, 2)
//            t.authorDao().addBooks(a1,a2)
            t.authorDao().getAllAuthorsWithBooks().forEach {
                Log.d("AUTHOR", it.author.firstname+" "+it.books.size)
            }
        }


    }
}