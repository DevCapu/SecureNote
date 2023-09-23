package br.com.devcapu.securenote.domain.useCase

import br.com.devcapu.securenote.data.dao.NoteDao
import br.com.devcapu.securenote.data.entity.Note
import kotlinx.coroutines.flow.Flow

class GetAllNotes(private val dao: NoteDao) {
    operator fun invoke(): Flow<List<Note>> = dao.getAll()
}