package com.thgcode.room.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.thgcode.room.dao.WordDao
import com.thgcode.room.db.WordRoomDatabase
import com.thgcode.room.entities.Word
import org.jetbrains.anko.doAsync

class WordRepository(application: Application) {
    private val wordDao: WordDao
    val allWords: LiveData<List<Word>>

    init {
        val db = WordRoomDatabase.getDatabase(application)
        wordDao = db.wordDao()
        allWords = wordDao.getAllWords()
    }

    fun insert(word: Word) {
        doAsync {
            wordDao.insert(word)
        }
    }
}