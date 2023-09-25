package br.com.devcapu.securenote.ui.note

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import br.com.devcapu.securenote.R
import br.com.devcapu.securenote.data.AppDatabase
import br.com.devcapu.securenote.data.entity.Note

const val EXTRA_NOTE_ID = "NOTE_ID"

class NoteDetailsActivity : AppCompatActivity() {

    private var note: Note? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_details)

        val noteId = intent.getIntExtra(EXTRA_NOTE_ID, 0)
        if (noteId == 0) return

        note = Note(
            uid = noteId,
            title = "Title",
            content = "Not much to say",
            createdAt = "",
            updatedAt = ""
        )

        setSupportActionBar(findViewById(R.id.note_details_activity_toolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        if (note == null) {
            menuInflater.inflate(R.menu.activity_note_details_save_menu, menu)
        } else {
            menuInflater.inflate(R.menu.activity_note_details_edit_menu, menu)
        }
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.save -> {
            note?.let { AppDatabase.getDatabase(this).noteDao().insert(it) }
            true
        }

        else -> super.onOptionsItemSelected(item)
    }

    companion object {
        fun getIntent(context: Context) = Intent(context, NoteDetailsActivity::class.java)
    }
}