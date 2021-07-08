package com.example.sqllitewebinar

import android.content.ContentValues
import android.database.sqlite.SQLiteOpenHelper
import android.os.Build.ID
import android.support.v4.provider.FontsContractCompat
import android.database.Cursor;

//schema and contract defining table name and column name for single table
object TodoTable{
    val TABLE_NAME="todos"
    object Columns{
        val ID= "id"
        val TASK="task"
        val DONE="done"
    }
    //creating a table
    val CMD_CREATE_TABLE="""
        CREATE TABLE IF NOT EXISTS $TABLE_NAME
        
        ${Columns.ID}INTEGER PRIMARY KEY AUTOINCREMENT,
        ${Columns.TASK} TEXT,
        ${Columns.DONE} BOOLEAN);
        """.trimIndent()

    fun insertTodo(db:SQLiteOpenHelper,todo:Todo){
        val row=ContentValues()
        row.put(Columns.TASK,todo.task )
        row.put(Columns.DONE,todo.done)

        db.insert(TABLE_NAME,null,row)
    }

    fun getAllTodos(db:SQLiteOpenHelper):ArrayList<Todo> {
        val todos=ArrayList<Todo>();
        var c = db.query(
            TABLE_NAME,
            arrayOf(Columns.ID, Columns.TASK, Columns.DONE),
            null, null,
            null, null,
            null
        )
        while (c.moveToNext()) {
val todo=Todo(
    c.getString(1),
    c.getInt(2)==1)
       todos.add(todo);

)

        }
        return todos;
    }
}