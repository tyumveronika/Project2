package com.example.project2;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {

    TextView tvComment;
    EditText etGuess;
    Button btnSubmit;

    int guess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvComment = findViewById(R.id.tvComment);
        etGuess = findViewById(R.id.etGuess);
        btnSubmit = findViewById(R.id.btnSubmit);

        guess = (int)(Math.random()*100);


    }
    public void onClick(View view) {
        int user_guess = Integer.parseInt(etGuess.getText().toString());

        if (user_guess == guess) {
            tvComment.setText("В точку!");
            btnSubmit.setText("Сыграть еще");
            guess = (int)(Math.random()*100);
        }
        if (user_guess < guess)
            tvComment.setText("Перелет!");
            tvComment.setText("" + guess + "," + user_guess);
        if (user_guess < guess)
            tvComment.setText("Недолет!");


        tvComment.setText("");
    }

}