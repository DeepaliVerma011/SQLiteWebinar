package com.example.sqllitewebinar

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

//defining database name,and version

class MyDbHelper(context: Context) : SQLiteOpenHelper(
    context,
    "todos.db",
    null,
    1
) {
    override fun onCreate(db: SQLiteDatabase?) {
        //creating table in Database
        //when the user opens app for first time it is called
        if (db != null) {
            db.execSQL(TodoTable.CMD_CREATE_TABLE)
        }
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        //called when version change

    }

}