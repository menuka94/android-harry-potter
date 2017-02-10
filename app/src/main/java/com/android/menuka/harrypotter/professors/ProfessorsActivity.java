package com.android.menuka.harrypotter.professors;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.menuka.harrypotter.R;
import com.android.menuka.harrypotter.models.Professor;

import java.util.ArrayList;

public class ProfessorsActivity extends AppCompatActivity {
    private ListView professorsListView;
    private ArrayList<Professor> professors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professors);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        professorsListView = (ListView)findViewById(R.id.professorsListView);
        professors = new ArrayList<>();

        professors.add(new Professor("Albus", "Dumbledore"));
        professors.add(new Professor("Minerva", "McGonagall"));
        professors.add(new Professor("Severus", "Snape"));
        professors.add(new Professor("Remus", "Lupin"));


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
