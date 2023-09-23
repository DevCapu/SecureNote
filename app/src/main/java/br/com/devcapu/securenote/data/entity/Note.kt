package br.com.devcapu.securenote.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    @PrimaryKey val uid: Int,
    @ColumnInfo("title") val title: String?,
    @ColumnInfo("content") val content: String?,
    @ColumnInfo("createdAt") val createdAt: String,
    @ColumnInfo("updatedAt") val updatedAt: String
)