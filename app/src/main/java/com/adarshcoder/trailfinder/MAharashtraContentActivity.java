package com.adarshcoder.trailfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MAharashtraContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_aharashtra_content);
    }

    public void lonaVala(View view){
        Intent intent = new Intent(this, LonavalaPosterActivity.class);
        startActivity(intent);
    }

    public void ganpatipuleBeach(View view){
        Intent intent= new Intent(this, GanpatipuleBeachPosterActivity.class);
        startActivity(intent);
    }

    public void ratnagiriFort(View view){
        Intent intent= new Intent(this, RatnagiriFortPosterActivity.class);
        startActivity(intent);
    }
    public void mahaBaleshwar(View view){
        Intent intent= new Intent(this, MahabaleshwarPosterActivity.class);
        startActivity(intent);
    }
    public void matheRan(View view){
        Intent intent= new Intent(this, MatheranPosterActivity.class);
        startActivity(intent);
    }
}