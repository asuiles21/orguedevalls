package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button informaciohistorica = (Button) findViewById(R.id.informacio_historica);
        Button preguntes_i_respostes = (Button) findViewById(R.id.preguntes_i_respostes);
        Button preferencies = (Button) findViewById(R.id.preferencies);

        informaciohistorica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iniciarListView();
            }
        });

        preguntes_i_respostes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iniciarPreguntesRespostes();
            }
        });
        preferencies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iniciarPreferencies();
            }
        });
    }

    public void iniciarListView(){
        Intent intent = new Intent(this, listview.class);
        startActivity(intent);
        overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);

    }
    public void iniciarPreguntesRespostes(){
        Intent intent = new Intent(this, PreguntesIRespostes.class);
        startActivity(intent);
        overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);

    }
    public void iniciarPreferencies(){

        if( getIntent().getExtras() != null)
        {
            Bundle datos = getIntent().getExtras();
            String encerts = datos.getString("encerts");
            String errors = datos.getString("errors");
            Intent intent = new Intent(this, Preferencies.class);
            intent.putExtra("encerts",encerts);
            intent.putExtra("errors",errors);
            startActivity(intent);
            overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
        } else {
            Intent intent = new Intent(this, Preferencies.class);
            startActivity(intent);
            overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
        }



    }



}