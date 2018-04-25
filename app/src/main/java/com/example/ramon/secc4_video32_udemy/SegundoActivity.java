package com.example.ramon.secc4_video32_udemy;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SegundoActivity extends AppCompatActivity {


    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();





            }
        });

        textView=(TextView) findViewById(R.id.textviewSA);

        //Captura de intent. para eso lo traigo en forma de bandel

        Bundle bundle=getIntent().getExtras();

        if(!bundle.equals(null) && !bundle.getString("texto").isEmpty()){
            Toast.makeText(SegundoActivity.this, bundle.getString("texto"), Toast.LENGTH_LONG).show();
            textView.setText(bundle.getString("texto"));
        }else{
            Toast.makeText(SegundoActivity.this, "Es vacio", Toast.LENGTH_LONG).show();
        }

    }

}
