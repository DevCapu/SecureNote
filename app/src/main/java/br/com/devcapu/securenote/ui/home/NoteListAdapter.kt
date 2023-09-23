package br.com.devcapu.securenote.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.devcapu.securenote.R
import br.com.devcapu.securenote.data.entity.Note

class NoteListAdapter(private val notes: List<Note>) : RecyclerView.Adapter<NoteCardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteCardViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_note, parent, false)
        return NoteCardViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NoteCardViewHolder, position: Int) {
        val note = notes[position]
        holder.noteTitle.text = note.title
    }

    override fun getItemCount() =notes.size
}