package com.test.david.homeworkone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playPressed (View view)
    {
        Intent intent = new Intent(this, PlayActivity.class);
        startActivity(intent);
    }
}
