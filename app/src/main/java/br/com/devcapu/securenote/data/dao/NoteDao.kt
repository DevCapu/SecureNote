package br.com.devcapu.securenote.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import br.com.devcapu.securenote.data.entity.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Insert
    fun insert(note: Note)

    @Delete
    fun delete(note: Note)

    fun getAll(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE uid = :noteId LIMIT 1")
    fun findNote(noteId: Int): Flow<Note>
}