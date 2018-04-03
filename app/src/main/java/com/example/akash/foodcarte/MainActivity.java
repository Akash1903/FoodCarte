package com.example.akash.foodcarte;

import android.content.Intent;
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

    public void signin(View view){
        Intent intent = new Intent(MainActivity.this, LogIN.class);
        startActivity(intent);
    }

    public void badi(View view){

        Toast.makeText(getApplicationContext(),"Badi Canteen is Clicked",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MainActivity.this,Display.class);
        intent.putExtra("ID",R.id.badicant);
        startActivity(intent);
    }

    public void rolls(View view){
        Toast.makeText(getApplicationContext(),"Rolls is Clicked",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MainActivity.this,Display.class);
        intent.putExtra("ID",R.id.rolls);
        startActivity(intent);
    }

    public void nes(View view){
        Toast.makeText(getApplicationContext(),"Nescafe is Clicked",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MainActivity.this,Display.class);
        intent.putExtra("ID",R.id.nescafe);
        startActivity(intent);
    }

    public void cola(View view){
        Toast.makeText(getApplicationContext(),"Coca cola is Clicked",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MainActivity.this,Display.class);
        intent.putExtra("ID",R.id.coke);
        startActivity(intent);
    }
}
