package com.android.menuka.harrypotter.students;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.android.menuka.harrypotter.R;
import com.android.menuka.harrypotter.db_operations.FirebaseHelper;
import com.android.menuka.harrypotter.models.Student;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

public class StudentsActivity extends AppCompatActivity {
    private ListView studentsListView;
    private StudentAdapter studentAdapter;
    private ArrayList<Student> studentsList;
    private DatabaseReference databaseReference;

    private void addStudent(String firstName, String lastName, Long houseId){
        Student student = new Student(firstName, lastName);
        student.setHouse_id(houseId);
        databaseReference.child("students").setValue(student);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        databaseReference = FirebaseHelper.getInstance().getDatabaseReference("students");

        studentsListView = (ListView) findViewById(R.id.studentsListView);
        studentsList = new ArrayList<>();
        studentAdapter = new StudentAdapter(this, android.R.layout.simple_list_item_1, studentsList);

        studentsListView.setAdapter(studentAdapter);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // ChildEventListeners
        ChildEventListener childEventListener = new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                System.out.println(dataSnapshot.getValue(Student.class).toString());
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };

        databaseReference.addChildEventListener(childEventListener);
    }

}
