package br.com.devcapu.securenote.ui.note

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import br.com.devcapu.securenote.R

const val EXTRA_NOTE_ID = "NOTE_ID"

class NoteDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_details)

        val noteId = intent.getIntExtra(EXTRA_NOTE_ID, 0)
        Log.d("MINHA TAG", noteId.toString())
        if (noteId == 0) return

        //TODO:Search in viewModel note with id:
        //TODO: Add observable
        setSupportActionBar(findViewById<Toolbar>(R.id.note_details_activity_toolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //TODO: Verify menu is for a new note or edit one
        Log.d("MINHA TAG", "onCreateOptionsMenu")
        menuInflater.inflate(R.menu.activity_note_details_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.edit -> {
            true
        }

        else -> super.onOptionsItemSelected(item)
    }

    companion object {
        fun getIntent(context: Context) = Intent(context, NoteDetailsActivity::class.java)
    }
}