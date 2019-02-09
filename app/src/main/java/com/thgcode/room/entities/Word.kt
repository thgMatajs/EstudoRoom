package com.thgcode.room.entities

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word_table")
data class Word(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word") //altera o nome ca coluna
    val word: String)