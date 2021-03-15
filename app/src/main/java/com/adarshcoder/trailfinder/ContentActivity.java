package com.adarshcoder.trailfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

    }

    public void mahaRashtra(View view){
        Intent intent = new Intent(this, MaharashtraPosterActivity.class);

        startActivity(intent);
    }

    public void odiSha(View view){
        Intent intent = new Intent(this, OdishaPosterActivity.class);

        startActivity(intent);
    }
}