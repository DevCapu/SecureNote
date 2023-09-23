package br.com.devcapu.securenote

import android.app.Application
import br.com.devcapu.securenote.data.AppDatabase

class SecureNoteApplication: Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}