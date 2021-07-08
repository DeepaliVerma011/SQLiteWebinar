package com.example.sqllitewebinar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import android.database.sqlite.SQLiteOpenHelper

import android.util.Log;


class MainActivity : AppCompatActivity() {
    val todos=ArrayList<String>();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //search developers.com save database in android

        val todoAdapter=ArrayAdapter<Todo>(
            this,
            android.R.layout.simple_list_item_1,
        android.R.id.text1,
        todos

        )
        lvtodo.adapter=todoAdapter
        val db=MyDbHelper(this.getWritableDatabase)
        fun refreshTodoList() {
            val todoList=TodoTable.getAllTodos(db);
Log.d("TODOS",todoList.toString());
            todos.clear();
            todos.addAll(todoList);
            todoAdapter.notifyDataSetChanged();
        }

        buttonTodo.setOnClickListener{
            val newTodo= Todo(newTodo.text.toString(),false)

            TodoTable.insertTodo(db,newTodo);
refreshTodoList();
        }

    }


}