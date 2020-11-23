package com.example.lifecycleactivity05102020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {


    Button mBtnNavigateScreen3,mBtnReloadScreen3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("BBB","onCreate3");
        mBtnReloadScreen3 = findViewById(R.id.buttonReloadScreen3);
        mBtnNavigateScreen3 = findViewById(R.id.buttonNavigateScreen3);

        mBtnReloadScreen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity3.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        mBtnNavigateScreen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","onStart3");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","onResume3");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","onPause3");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","onStop3");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","onRestart3");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","onDestroy3");
    }
}