package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> students = new ArrayList<>();
    //s1,s2,s3
    //0,1,2
    int haneen = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText studentname = (EditText)findViewById(R.id.text1);
        EditText studentage = (EditText)findViewById(R.id.text2);
        EditText studentgrade = (EditText)findViewById(R.id.text3);
        ImageView studentimage = (ImageView)findViewById(R.id.imageView);
        Button next = (Button)findViewById(R.id.button);







        Student s1 = new Student("youssef", 16,R.drawable.boy1 , 40);
        Student s2 = new Student("salman", 15,R.drawable.boy2 , 60);
        Student s3 = new Student("majed", 14,R.drawable.download , 90 );

        students.add(s1);
        students.add(s2);
        students.add(s3);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                haneen++;
                studentname.setText(students.get(haneen).getStudentname());
                studentage.setText(String.valueOf(students.get(haneen).getStudentage()));
                studentimage.setImageResource(students.get(haneen).getStudentimage());
                studentgrade.setText(String.valueOf(students.get(haneen).getStudentgrade()));
            }
        });


        studentname.setText(s2.getStudentname());
        studentage.setText(String.valueOf(s2.getStudentage()));
        studentimage.setImageResource(s2.getStudentimage());
        studentgrade.setText(String.valueOf(s2.getStudentgrade()));


        studentname.setText(s1.getStudentname());
        studentage.setText(String.valueOf(s1.getStudentage()));
        studentimage.setImageResource(s1.getStudentimage());
        studentgrade.setText(String.valueOf(s1.getStudentgrade()));


        studentname.setText(s3.getStudentname());
        studentage.setText(String.valueOf(s3.getStudentage()));
        studentimage.setImageResource(s3.getStudentimage());
        studentgrade.setText(String.valueOf(s3.getStudentgrade()));

    }

}