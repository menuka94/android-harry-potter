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

        categories.add("StudentsActivity");
        categories.add("ProfessorsActivity");
        categories.add("HousesActivity");
        categories.add("Magical Creatures");
        categories.add("SubjectsActivity");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, categories);
        categoriesListView.setAdapter(arrayAdapter);

        categoriesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println("Tapped: " + categories.get(position));

                if(position == categories.indexOf("HousesActivity")){
                    Intent i = new Intent(getApplicationContext(), HousesActivity.class);
                    startActivity(i);
                }else if(position == categories.indexOf("StudentsActivity")){
                    Intent i = new Intent(getApplicationContext(), StudentsActivity.class);
                    startActivity(i);
                }else if(position == categories.indexOf("SubjectsActivity")){
                    Intent i = new Intent(getApplicationContext(), SubjectsActivity.class);
                    startActivity(i);
                }else if(position == categories.indexOf("Magical Creatures")){
                    Intent i = new Intent(getApplicationContext(), MagicalCreaturesActivity.class);
                    startActivity(i);
                }else if(position == categories.indexOf("ProfessorsActivity")){
                    Intent i = new Intent(getApplicationContext(), ProfessorsActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}
