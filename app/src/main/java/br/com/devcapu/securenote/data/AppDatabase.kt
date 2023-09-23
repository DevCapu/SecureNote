package br.com.devcapu.securenote.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.devcapu.securenote.data.dao.NoteDao
import br.com.devcapu.securenote.data.entity.Note

@Database(entities = [Note::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "secureNote"
                )
                    .createFromAsset("database/secure_note.db")
                    .build()
                INSTANCE = instance

                instance
            }
        }
    }
}