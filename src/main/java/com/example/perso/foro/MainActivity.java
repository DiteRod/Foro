package com.example.perso.foro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    private TextView T1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T1 = (TextView) findViewById(R.id.textView1);

    }
    public void Search(View view){
        Intent  Buscar = new Intent(this,ForoRespuestas.class);
        startActivity(Buscar);
    }




}
