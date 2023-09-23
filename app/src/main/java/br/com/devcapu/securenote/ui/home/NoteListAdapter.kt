package br.com.devcapu.securenote.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import br.com.devcapu.securenote.R
import br.com.devcapu.securenote.data.entity.Note

class NoteListAdapter(
    private val notes: List<Note>,
    private val onItemClick: (Int) -> Unit
) : Adapter<NoteCardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteCardViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_note, parent, false)
        return NoteCardViewHolder(itemView, onItemClick)
    }

    override fun onBindViewHolder(holder: NoteCardViewHolder, position: Int) {
        val note = notes[position]
        holder.noteTitle.text = note.title
        holder.bind()
    }

    override fun getItemCount() =notes.size
}