package com.example.egzamin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button like;
    private TextView likes;
    private int clickCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        like = findViewById(R.id.button);
        likes = findViewById(R.id.textView2);
        like.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                clickCount++;
                String text = clickCount + " polubień";
                likes.setText(text);
            }
        });

    }
}