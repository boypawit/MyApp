package com.example.boyvi.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showtext(View view){
        String msg = "Hello, I am Pawit Termjirakul";
        Toast toast = Toast.makeText(this,msg,Toast.LENGTH_SHORT);
        toast.show();

    }
}
