package com.example.firebase_crud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText rollNumber,name,course;
    Button insertBtn;
    FloatingActionButton floatBtn;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollNumber = findViewById(R.id.rollNumber);
        name = findViewById(R.id.studentName);
        course = findViewById(R.id.courseName);

        insertBtn = findViewById(R.id.insertBtn);
        floatBtn = findViewById(R.id.fBtn);

        FirebaseDatabase db  = FirebaseDatabase.getInstance();

        DatabaseReference myRef =  db.getReference("Student");

        insertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rNumber =  rollNumber.getText().toString();
                String sName = name.getText().toString();
                String cName = course.getText().toString();

                DataModel studentObj = new DataModel(sName,cName);

                myRef.child(rNumber).setValue(studentObj);

            }
        });

        floatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,ShowContent.class);

                startActivity(intent);
            }
        });


    }
}