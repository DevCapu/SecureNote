package br.com.devcapu.securenote.domain.useCase

import br.com.devcapu.securenote.data.dao.NoteDao
import br.com.devcapu.securenote.data.entity.Note

class WriteNote(private val dao: NoteDao) {

    operator fun invoke(note: Note) = dao.insert(note)
}