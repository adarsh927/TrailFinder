package com.adarshcoder.trailfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LonavalaPosterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lonavala_poster);
    }
    public void visitLonavala(View view){
        Intent intent = new Intent(this, LonavalaActivity.class);
        startActivity(intent);
    }
}