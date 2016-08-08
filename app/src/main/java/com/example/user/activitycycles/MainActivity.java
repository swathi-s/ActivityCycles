package com.example.user.activitycycles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("steps","onCreate called");
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("steps","OnResume Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("steps","OnRestart called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("steps","onStart called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("steps","onDestroy called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("steps","onStop called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("steps","onPause called");
    }
}

