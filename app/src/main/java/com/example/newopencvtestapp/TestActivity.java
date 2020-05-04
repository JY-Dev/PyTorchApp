package com.example.newopencvtestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Intent intent = getIntent();
        Bitmap bitmap = (Bitmap)intent.getParcelableExtra("image");
        ImageView img = findViewById(R.id.test_img);
        img.setImageBitmap(bitmap);
    }
}
