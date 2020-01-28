package com.maisfundocfragment.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.maisfundocfragment.database.dao.NoticiaDAO
import com.maisfundocfragment.model.Noticia

@Database(entities = [Noticia::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract val noticiaDAO: NoticiaDAO

}