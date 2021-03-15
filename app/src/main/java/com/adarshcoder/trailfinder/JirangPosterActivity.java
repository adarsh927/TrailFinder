package com.adarshcoder.trailfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JirangPosterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jirang_poster);
    }

    public void visitJirang(View view){
        Intent intent= new Intent(this, JirangActivity.class);
        startActivity(intent);
    }
}