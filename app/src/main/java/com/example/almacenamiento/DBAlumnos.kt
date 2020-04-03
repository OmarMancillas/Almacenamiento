package com.example.almacenamiento

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBAlumnos(context:Context?):SQLiteOpenHelper(context,"DBAlumnos.db",null,1) {

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE Alumnos(control varchar(8) NOT NULL,nombre varchar(50))")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }


}