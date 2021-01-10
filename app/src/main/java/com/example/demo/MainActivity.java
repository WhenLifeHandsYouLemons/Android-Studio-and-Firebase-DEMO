package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    EditText colourText;
    EditText lengthText;
    EditText thicknessText;

    FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Screen Created!");
        Log.d("MAIN", "Screen Created!");

        colourText = findViewById(R.id.colourText);
        lengthText = findViewById(R.id.lengthText);
        thicknessText = findViewById(R.id.thicknessText);

        db = FirebaseFirestore.getInstance();
    }

    public void clickOnTheButton(View v){
        Log.d("MAIN", "Button Clicked!");
        String colour = colourText.getText().toString();
        Log.d("MAIN", "Colour typed:" + colour);
        String length = lengthText.getText().toString();
        Log.d("MAIN", "Length typed:" + colour);
        String thickness = thicknessText.getText().toString();
        Log.d("MAIN", "Thickness typed:" + colour);

        Yarn y = new Yarn(colour, length, thickness);
        Yarn y2 = new Yarn(colour, length, thickness);

        db.collection("yarn-items/blue/").document(UUID.randomUUID().toString()).set(y);
        db.collection("yarn-items/yellow/").document(UUID.randomUUID().toString()).set(y);
        db.collection("yarn-items").document(UUID.randomUUID().toString()).set(y2);
    }
}