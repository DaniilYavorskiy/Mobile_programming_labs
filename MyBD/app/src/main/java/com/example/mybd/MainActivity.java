package com.example.mybd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TableLayout tableLayout;
    DBHelper dbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tableLayout = findViewById(R.id.tableLayout);
        dbHelper = new DBHelper(this);

        // Добавляем студентов в базу данных
        dbHelper.addStudent(new Student("Иванов", 70, 180, 20));
        dbHelper.addStudent(new Student("Яворский", 64, 182, 24));
        dbHelper.addStudent(new Student("Сидоров", 75, 150, 19));
        dbHelper.addStudent(new Student("Амошенко", 60, 175, 21));
        dbHelper.addStudent(new Student("Алексеева", 53, 168, 25));
        dbHelper.addStudent(new Student("Петров", 65, 175, 22));

        // Получаем всех студентов из базы данных
        List<Student> students = dbHelper.getAllStudents();

        // Выводим студентов в TableLayout
        for (Student student : students) {
            TableRow row = new TableRow(this);
            TextView name = new TextView(this);
            TextView weight = new TextView(this);
            TextView height = new TextView(this);
            TextView age = new TextView(this);

            name.setText(student.getName());
            weight.setText(String.valueOf(student.getWeight()));
            height.setText(String.valueOf(student.getHeight()));
            age.setText(String.valueOf(student.getAge()));

            row.addView(name);
            row.addView(weight);
            row.addView(height);
            row.addView(age);

            tableLayout.addView(row);
        }
    }
}