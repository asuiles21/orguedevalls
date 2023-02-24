package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class listview extends AppCompatActivity {
    ListView listView;
    String[] temes = {"1. L'EDIFICI","2. HISTORIA","3. EL NOU ORGUE","4. L'INSTRUMENT",
            "5. CONSOLA","6. CANONADA","7. SALMER O SECRET (COS SONOR)","8. MANXES", "9. MECANSIME", "Sortir"};


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);


        listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.prueba, R.id.textviewww, temes);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedFromList = (String) (listView.getItemAtPosition(i));
                String numero = selectedFromList.substring(0, 1);

                if (numero.equals("1")) {
                    numero = "1";
                    iniciarInformacioHistorica(numero);
                } else if (numero.equals("2")){
                    numero = "2";
                    iniciarInformacioHistorica(numero);

                }
                else if (numero.equals("3")){
                    numero = "5";
                    iniciarInformacioHistorica(numero);
                } else if (numero.equals("4")){
                    numero = "7";
                    iniciarInformacioHistorica(numero);
                } else if (numero.equals("5")){
                    numero = "10";
                    iniciarInformacioHistorica(numero);
                } else if (numero.equals("6")){
                    numero="14";
                    iniciarInformacioHistorica(numero);
                }else if (numero.equals("7")){
                    numero="16";
                    iniciarInformacioHistorica(numero);
                }else if (numero.equals("8")){
                    numero="17";
                    iniciarInformacioHistorica(numero);
                }else if (numero.equals("9")){
                    numero="18";
                    iniciarInformacioHistorica(numero);
                } else if (numero.equals("S")){
                    tornarInici();
                }

            }

        });
    }

    public void iniciarInformacioHistorica(String numero){
        Intent intent = new Intent(this, InformacioHistorica.class);
        intent.putExtra("key", numero);
        startActivity(intent);
        overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);

    }



    public void tornarInici(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);

    }


}
