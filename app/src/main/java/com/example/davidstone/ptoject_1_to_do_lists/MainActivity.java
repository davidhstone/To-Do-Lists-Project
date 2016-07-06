package com.example.davidstone.ptoject_1_to_do_lists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
Requirements

Your app must:

View a collection of to-do lists
View items on a to-do list, including descriptions
Allow the user to create a new to-do list
Add items to each to-do list
Allow the user to remove items from a to-do list
Allow the user to remove an entire to-do list
Use two custom Java objects to contain your data for the To Do Lists, and the To Do Items in each ToDoList
Show an error message if invalid input is given
Persist data (your to-do-lists) while the app is open using a singleton
Bonus:

Allow the user to check off completed items
Allow the user to edit previously added items
Persist data when the app closes and is re-opened

 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
