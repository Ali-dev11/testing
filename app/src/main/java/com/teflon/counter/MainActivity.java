package com.teflon.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int count=0;
TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void count(View view) {
        count++;
        textView = findViewById(R.id.textView2);
        textView.setText(Integer.toString(count));
    }
    public void decrement(View view) {
        count--;
        textView = findViewById(R.id.textView2);
        textView.setText(Integer.toString(count));
    }

    public void activity2(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }
}