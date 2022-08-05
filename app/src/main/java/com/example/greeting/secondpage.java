package com.example.greeting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);

        TextView textView = findViewById(R.id.textView2);

        Bundle extras = getIntent().getExtras();
        if(extras==null){
            return;
        }
        String msg = extras.getString("name");
        textView.setText(msg);

    }
}