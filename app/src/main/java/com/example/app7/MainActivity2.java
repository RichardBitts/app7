package com.example.app7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       /*
new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

}, 5000); //tiempo de carga
        */
        }
        public void act1(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        }
        public void act3(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(intent);
        }


}
//}