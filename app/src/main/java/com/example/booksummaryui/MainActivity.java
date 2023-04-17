package com.example.booksummaryui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView myTextView = findViewById(R.id.button17);

        myTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change the background color of the TextView
                myTextView.setBackgroundResource(R.color.button_color1);
            }
        });
    }
}