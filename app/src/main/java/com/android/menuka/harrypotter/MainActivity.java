package com.android.menuka.harrypotter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> categories;
    private ListView categoriesListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        categoriesListView = (ListView)findViewById(R.id.categoriesListView);

        categories = new ArrayList<>();

        categories.add("Students");
        categories.add("Professors");
        categories.add("Houses");
        categories.add("Magical Creatures");
        categories.add("Subjects");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, categories);
        categoriesListView.setAdapter(arrayAdapter);

        categoriesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println("Tapped: " + categories.get(position));

                if(position == categories.indexOf("Houses")){
                    Intent i = new Intent(getApplicationContext(), HousesActivity.class);
                    startActivity(i);
                }else if(position == categories.indexOf("Students")){
                    Intent i = new Intent(getApplicationContext(), StudentsActivity.class);
                    startActivity(i);
                }else if(position == categories.indexOf("Subjects")){
                    Intent i = new Intent(getApplicationContext(), SubjectsActivity.class);
                    startActivity(i);
                }else if(position == categories.indexOf("Magical Creatures")){
                    Intent i = new Intent(getApplicationContext(), MagicalCreaturesActivity.class);
                    startActivity(i);
                }else if(position == categories.indexOf("Professors")){
                    Intent i = new Intent(getApplicationContext(), ProfessorsActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}
