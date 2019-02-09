package com.thgcode.room.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.thgcode.room.entities.Word
import com.thgcode.room.repository.WordRepository

class WordViewModel(application: Application) : AndroidViewModel(application) {

    private val wordRepository = WordRepository(application)

    val allWords = wordRepository.allWords

    fun insert(word: Word) = wordRepository.insert(word)
}