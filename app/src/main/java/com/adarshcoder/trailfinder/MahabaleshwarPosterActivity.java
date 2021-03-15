package com.adarshcoder.trailfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MahabaleshwarPosterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahabaleshwar_poster);
    }

    public void visitMahabaleshwar(View view){
        Intent intent= new Intent(this, MahabaleshwarActivity.class);
        startActivity(intent);
    }
}