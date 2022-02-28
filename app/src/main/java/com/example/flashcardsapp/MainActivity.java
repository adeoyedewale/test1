package com.example.flashcardsapp;

import static android.graphics.Color.YELLOW;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout parentId = findViewById(R.id.patentId);
        TextView flashcardQuestion = findViewById(R.id.flashcard_question);
        TextView flashcardAnswer = findViewById(R.id.flashcard_answer);
        TextView tvAnswer1 = findViewById(R.id.tvAnswer1);
        TextView tvAnswer2 = findViewById(R.id.tvAnswer2);
        TextView tvAnswer3 = findViewById(R.id.tvAnswer3);
        ImageView toggleChoiceVisibility = findViewById(R.id.toggle_choice_visibility);
        ImageView toggleChoiceInvisibility = findViewById(R.id.toggle_choice_invisibility);
        flashcardQuestion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                flashcardQuestion.setVisibility(View.INVISIBLE);
                flashcardAnswer.setVisibility(View.VISIBLE);
            }
        });
        flashcardAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flashcardAnswer.setVisibility(View.INVISIBLE);
                flashcardQuestion.setVisibility(View.VISIBLE);
            }
        });

        tvAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvAnswer1.setBackgroundColor(Color.parseColor("#f44336"));
            }
        });
        tvAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvAnswer2.setBackgroundColor(Color.parseColor("#f44336"));
            }
        });
        tvAnswer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvAnswer3.setBackgroundColor(Color.parseColor("#118f11"));

            }
        });
        parentId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvAnswer1.setBackgroundColor(Color.parseColor("#f6b26b"));
                tvAnswer2.setBackgroundColor(Color.parseColor("#f6b26b"));
                tvAnswer3.setBackgroundColor(Color.parseColor("#f6b26b"));
            }
        });

        toggleChoiceVisibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvAnswer1.setVisibility(View.INVISIBLE);
                tvAnswer2.setVisibility(View.INVISIBLE);
                tvAnswer3.setVisibility(View.INVISIBLE);
                toggleChoiceVisibility.setVisibility(View.INVISIBLE);
                toggleChoiceInvisibility.setVisibility(View.VISIBLE);
            }
        });

        toggleChoiceInvisibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvAnswer1.setVisibility(View.VISIBLE);
                tvAnswer2.setVisibility(View.VISIBLE);
                tvAnswer3.setVisibility(View.VISIBLE);
                toggleChoiceVisibility.setVisibility(View.VISIBLE);
                toggleChoiceInvisibility.setVisibility(View.INVISIBLE);
            }
        });
    }
}