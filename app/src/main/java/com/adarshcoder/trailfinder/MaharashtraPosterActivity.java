package com.adarshcoder.trailfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MaharashtraPosterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maharashtra_poster);
    }
    public void visitMaharashtra(View view) {
        Intent intent = new Intent(this, MAharashtraContentActivity.class);

        startActivity(intent);
    }
}