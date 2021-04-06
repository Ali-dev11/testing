package com.teflon.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void imageAnime(View view) {
        imageView=findViewById(R.id.imageView);
        imageView.animate().rotationX(720).scaleX(0.5f).scaleY(0.5f).setDuration(4000);


    }

    public void SecAnime(View view) {
        imageView=findViewById(R.id.imageView2);
        imageView.animate().rotation(1440).alpha(0).scaleX(0.5f).scaleY(0.5f).setDuration(4000);

    }
}