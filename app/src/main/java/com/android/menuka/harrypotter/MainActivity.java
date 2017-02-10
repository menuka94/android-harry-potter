package com.android.menuka.harrypotter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.menuka.harrypotter.houses.HousesActivity;
import com.android.menuka.harrypotter.magical_creatures.MagicalCreaturesActivity;
import com.android.menuka.harrypotter.models.Student;
import com.android.menuka.harrypotter.professors.ProfessorsActivity;
import com.android.menuka.harrypotter.students.StudentsActivity;
import com.android.menuka.harrypotter.subjects.SubjectsActivity;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> categories;
    private ListView categoriesListView;
    private FirebaseApp app;
    private FirebaseStorage storage;
    private FirebaseAuth auth;
    private FirebaseDatabase database;

    private DatabaseReference databaseRef;
    private StorageReference storageRef;

    private void initFirebase(){
        app = FirebaseApp.getInstance();
        database = FirebaseDatabase.getInstance(app);
        auth = FirebaseAuth.getInstance(app);
        storage = FirebaseStorage.getInstance(app);
    }



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
