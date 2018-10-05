package com.example.perso.foro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ForoRespuestas extends AppCompatActivity {

    private TextView t2;
    private TextView t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foro_respuestas);
    t2 = (TextView)findViewById(R.id.textView2);
    t3= (TextView)findViewById(R.id.textView3);


    }
}
