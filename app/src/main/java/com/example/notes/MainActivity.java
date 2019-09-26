package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Notes> notes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RecyclerViewNotes);
        notes.add(new Notes("Title 1", "description1", "monday", 1));
        notes.add(new Notes("Title 2", "description2", "monday", 2));
        notes.add(new Notes("Title 3", "description3", "monday", 3));
        notes.add(new Notes("Title 4", "description4", "monday", 2));
        notes.add(new Notes("Title 5", "description5", "monday", 3));

        NotesAdapter adapter = new NotesAdapter(notes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }


}
