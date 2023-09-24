package br.com.devcapu.securenote.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.devcapu.securenote.R
import br.com.devcapu.securenote.data.entity.Note
import br.com.devcapu.securenote.ui.note.EXTRA_NOTE_ID
import br.com.devcapu.securenote.ui.note.NoteDetailsActivity.Companion.getIntent

class HomeActivity : AppCompatActivity(R.layout.activity_home) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val recyclerView = findViewById<RecyclerView>(R.id.activity_home_notes_list)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val notes = mutableListOf(
            Note(1, "This is the content of Note 1.", "Content", "", ""),
        )

        val adapter = NoteListAdapter(notes) {
            goToDetails()
        }
        recyclerView.adapter = adapter
    }

    private fun goToDetails() = startActivity(getIntent(this).apply {
        putExtra(EXTRA_NOTE_ID, 1)
    })
}