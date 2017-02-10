package com.android.menuka.harrypotter.students;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.android.menuka.harrypotter.models.Student;

import java.util.ArrayList;

/**
 * Created by menuka on 2/10/17.
 */

public class StudentAdapter extends ArrayAdapter<Student> {
    private int layoutResourceId;
    private Context context;
    private ArrayList<Student> studentsList;

    public StudentAdapter(Context context, int resource, ArrayList<Student> studentsList) {
        super(context, resource);
        layoutResourceId = resource;
        this.studentsList = studentsList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        Student student = null;

        if(row == null){
            LayoutInflater inflater = ((Activity)getContext()).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            student = studentsList.get(position);

            row.setTag(student);
        }else{
            student = (Student) row.getTag();
        }

        return row;
    }
}
