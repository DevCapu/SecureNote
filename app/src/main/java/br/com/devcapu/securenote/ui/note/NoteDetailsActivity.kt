package br.com.devcapu.securenote.ui.note

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.devcapu.securenote.R

class NoteDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_details)
    }

    companion object {
        fun getIntent(context: Context) = Intent(context, NoteDetailsActivity::class.java)
    }
}