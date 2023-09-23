package br.com.devcapu.securenote.ui.home

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.devcapu.securenote.R

class NoteCardViewHolder(
    itemView: View,
    private val onItemClick: (Int) -> Unit
) : RecyclerView.ViewHolder(itemView) {
    val noteTitle: TextView = itemView.findViewById(R.id.note_title)

    fun bind() {
        itemView.setOnClickListener {
            onItemClick(adapterPosition)
        }
    }
}