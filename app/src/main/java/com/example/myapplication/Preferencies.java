package com.example.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

    public class Preferencies extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.preferencies);
            RadioButton cancion1 = (RadioButton) findViewById(R.id.cancion1);
            RadioButton cancion2 = (RadioButton) findViewById(R.id.cancion2);
            RadioButton cancion3 = (RadioButton) findViewById(R.id.cancion3);
            Button pararcancion = (Button) findViewById(R.id.pararCancion);
            MediaPlayer musica1 = MediaPlayer.create(this, R.raw.coches_choque);
            MediaPlayer musica2 = MediaPlayer.create(this, R.raw.cancion_burro);
            MediaPlayer musica3 = MediaPlayer.create(this, R.raw.minecraft);
            TextView jugador = (TextView) findViewById(R.id.Jugador);
            Button limpiarPuntuacion = (Button) findViewById(R.id.reiniciarPuntuacio);
            Button tornarEnrrera = (Button) findViewById(R.id.tornarInici);


            if (getIntent().getExtras() != null){

                Bundle datos = getIntent().getExtras();
                String encerts = datos.getString("encerts");
                String errors = datos.getString("errors");

                jugador.setText("LA PUNTUACIO DEL JUGADOR ES DE : " + encerts + "Encerts " + errors + "Errades ");
            } else{
                jugador.setText("NO HI HA CAP PUNTUACIO REGISTRADA!");
            }
            tornarEnrrera.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    tornarInici();
                }
            });
            limpiarPuntuacion.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    tornarInici();
                }
            });

            cancion1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    musica1.start();
                    pararcancion.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            musica1.stop();
                        }
                    });
                }
            });
            cancion2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    musica2.start();
                    pararcancion.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            musica2.stop();
                        }
                    });
                }
            });
            cancion3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    musica3.start();
                    pararcancion.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            musica3.stop();
                        }
                    });
                }
            });


        }
        public void onBackPressed() {
            super.onBackPressed();
            overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
        }
        public void tornarInici(){
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("a", "a");
            startActivity(intent);
            overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
        }

    }

