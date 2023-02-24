package com.example.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class PreguntesIRespostes extends AppCompatActivity {
    private int encerts = 0;
    private int errors = 0;
    private int contador2=0;

    private AlertDialog dialog;
    boolean ayuda = false;
    boolean ayuda2 = false;
    boolean ayuda3 = false;
    boolean ayuda4 = false;
    public ArrayList<ImageView> llista = new ArrayList<ImageView>();


    String[] respuestasSpinner = {"Seleccione","a- té només un teclat però ja té  dimensions considerables","b- es porta a sobre mentre e toca","c- es pot posar a diferents llocs","d- té milers de tubs i necessita un espai gran per a posar-lo"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preguntes_i_respostes);
        Button b = (Button) findViewById(R.id.seguent);
        Button bValidar = (Button) findViewById(R.id.validar);
        ImageView i = (ImageView) findViewById(R.id.primeraPregunta);
        TextView t = (TextView) findViewById(R.id.Benvingudaa);
        ImageView abajoIzq = (ImageView) findViewById(R.id.foto3);
        RadioButton opcio1 = (RadioButton) findViewById(R.id.opcio1);
        RadioButton opcio2 = (RadioButton) findViewById(R.id.opcio2);
        RadioButton opcio3 = (RadioButton) findViewById(R.id.opcio3);
        RadioButton opcio4 = (RadioButton) findViewById(R.id.opcio4);
        TextView textantipenultima = (TextView) findViewById(R.id.antepenultima);
        MediaPlayer cancion1 = MediaPlayer.create(this, R.raw.sonido_boton);

        checksInvisible();
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);

        bValidar.setVisibility(View.INVISIBLE);
        opcio1.setVisibility(View.INVISIBLE);
        opcio2.setVisibility(View.INVISIBLE);
        opcio3.setVisibility(View.INVISIBLE);
        opcio4.setVisibility(View.INVISIBLE);
        textantipenultima.setVisibility(View.INVISIBLE);
        spinner.setVisibility(View.INVISIBLE);
        spinner2.setVisibility(View.INVISIBLE);
        spinner3.setVisibility(View.INVISIBLE);
        spinner4.setVisibility(View.INVISIBLE);
        b.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if(contador2==0){
                    contador2++;
                    omplirOrgue(llista);

                }
                cancion1.start();
                b.setEnabled(false);
                switchCase(t, i, b, bValidar);
            }
        });
    }
    public void opcioCorrecte(ImageView imtageCorrecte, TextView t, ImageView i, Button b, Button bValidar){
        TextView encertsText = (TextView) findViewById(R.id.encerts2);
        TextView errorsText = (TextView) findViewById(R.id.errors2);
        for (ImageView imagen: llista){
            if(imtageCorrecte==imagen){
                imagen.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view)
                    {
                        contador2++;
                        encerts++;
                        String enceerts = String.valueOf(encerts);
                        encertsText.setText(enceerts);
                        Snackbar popup = Snackbar.make(view, "¡¡¡CORRECTE!!!", 2500);
                        popup.getView().setBackgroundColor(Color.parseColor("#7ED321"));
                        popup.show();
                        switchCase(t, i, b, bValidar);
                        i.setVisibility(View.INVISIBLE);
                        for (ImageView imagen: llista){
                            imagen.setVisibility(View.INVISIBLE);}
                    }
                });
            }else{
                imagen.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        errors ++;
                        String erroors = String.valueOf(errors);
                        errorsText.setText(erroors);
                        Snackbar popup = Snackbar.make(view, "¡¡¡INCORRECTE!!!", 2500);
                        popup.getView().setBackgroundColor(Color.parseColor("#F12B2B"));
                        popup.show();
                    }
                });
            }
        }
    }
    public  void switchCase(TextView t, ImageView i, Button button, Button bValidar){
        CheckBox check1 = (CheckBox) findViewById(R.id.checkbox1);
        CheckBox check2 = (CheckBox) findViewById(R.id.checkbox2);
        CheckBox check3 = (CheckBox) findViewById(R.id.checkbox3);
        CheckBox check4 = (CheckBox) findViewById(R.id.checkbox4);
        CheckBox check5 = (CheckBox) findViewById(R.id.checkbox5);
        CheckBox check6 = (CheckBox) findViewById(R.id.checkbox6);
        CheckBox check7 = (CheckBox) findViewById(R.id.checkbox7);
        CheckBox check8 = (CheckBox) findViewById(R.id.checkbox8);
        CheckBox check9 = (CheckBox) findViewById(R.id.checkbox9);
        RadioButton opcio1 = (RadioButton) findViewById(R.id.opcio1);
        RadioButton opcio2 = (RadioButton) findViewById(R.id.opcio2);
        RadioButton opcio3 = (RadioButton) findViewById(R.id.opcio3);
        RadioButton opcio4 = (RadioButton) findViewById(R.id.opcio4);
        ImageView arribaIzq = (ImageView) findViewById(R.id.foto1);
        ImageView mediIzq = (ImageView) findViewById(R.id.foto2);
        ImageView abajoizq = (ImageView) findViewById(R.id.foto3);
        ImageView arribaDer = (ImageView) findViewById(R.id.foto4);
        ImageView medioDer = (ImageView) findViewById(R.id.foto5);
        ImageView abajoDer = (ImageView) findViewById(R.id.foto6);
        TextView textantipenultima = (TextView) findViewById(R.id.antepenultima);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);
        RadioButton act11_radio = (RadioButton) findViewById(R.id.radiobutton1);
        RadioButton act11_radio2 = (RadioButton) findViewById(R.id.radiobutton2);
        RadioButton act11_radio3 = (RadioButton) findViewById(R.id.radiobutton3);
        RadioButton act11_radio4 = (RadioButton) findViewById(R.id.radiobutton4);


        act11_radio.setVisibility(View.INVISIBLE);
        act11_radio2.setVisibility(View.INVISIBLE);
        act11_radio3.setVisibility(View.INVISIBLE);
        act11_radio4.setVisibility(View.INVISIBLE);

        TextView encertsText = (TextView) findViewById(R.id.encerts2);
        TextView errorsText = (TextView) findViewById(R.id.errors2);

        switch (contador2){
            case 1:
                t.setText("Busqueu aquest carreu i situeu-lo al plànol.");
                i.setImageResource(R.drawable.primerapregunta);
                arribaIzq.setVisibility(View.VISIBLE);
                mediIzq.setVisibility(View.VISIBLE);
                abajoizq.setVisibility(View.VISIBLE);
                arribaDer.setVisibility(View.VISIBLE);
                medioDer.setVisibility(View.VISIBLE);
                abajoDer.setVisibility(View.VISIBLE);
                opcioCorrecte(abajoizq, t, i, button, bValidar);

                break;
            case 2:
                button.setEnabled(true);
                t.setText("Durant la visita haureu d’anar-vos fixant si hi ha recordatoris referents a la ciutat");
                contador2++;
                break;
            case 3:
                button.setEnabled(false);
                t.setText("Quantifiqueu-los i al final del recorregut trieu la resposta correcta.");
                arribaIzq.setVisibility(View.INVISIBLE);
                arribaDer.setVisibility(View.INVISIBLE);
                mediIzq.setVisibility(View.INVISIBLE);
                medioDer.setVisibility(View.INVISIBLE);
                abajoizq.setVisibility(View.INVISIBLE);
                abajoDer.setVisibility(View.INVISIBLE);
                i.setImageResource(R.drawable.segonapregunta);
                i.setVisibility(View.VISIBLE);
                opcio1.setVisibility(View.VISIBLE);
                opcio2.setVisibility(View.VISIBLE);
                opcio3.setVisibility(View.VISIBLE);
                button.setEnabled(false);
                opcio1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        errors++;
                        String erroors = String.valueOf(errors);
                        errorsText.setText(erroors);
                        Snackbar popup = Snackbar.make(view, "¡¡¡INCORRECTE!!!", 2500);
                        popup.getView().setBackgroundColor(Color.parseColor("#F12B2B"));
                        popup.show();
                    }
                });
                opcio2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        errors++;
                        String erroors = String.valueOf(errors);
                        errorsText.setText(erroors);
                        Snackbar popup = Snackbar.make(view, "¡¡¡INCORRECTE!!!", 2500);
                        popup.getView().setBackgroundColor(Color.parseColor("#F12B2B"));
                        popup.show();
                    }
                });
                opcio3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        encerts++;
                        String enceerts = String.valueOf(encerts);
                        encertsText.setText(enceerts);
                        Snackbar popup = Snackbar.make(view, "¡¡¡CORRECTE!!!", 2500);
                        popup.getView().setBackgroundColor(Color.parseColor("#7ED321"));
                        popup.show();
                        opcio1.setVisibility(View.INVISIBLE);
                        opcio2.setVisibility(View.INVISIBLE);
                        popup.show();
                        button.setEnabled(true);
                        contador2++;
                    }
                });
                break;
            case 4:
                opcio3.setVisibility(View.INVISIBLE);
                i.setImageResource(R.drawable.pregunta3);
                t.setText("Mireu la imatge.");
                button.setEnabled(true);
                contador2++;
                break;
            case 5:
                i.setVisibility(View.INVISIBLE);
                t.setText("Segons la imatge, on creieu que estava situat l’orgue anterior? Situeu-lo al plànol");
                arribaIzq.setVisibility(View.VISIBLE);
                mediIzq.setVisibility(View.VISIBLE);
                abajoizq.setVisibility(View.VISIBLE);
                arribaDer.setVisibility(View.VISIBLE);
                medioDer.setVisibility(View.VISIBLE);
                abajoDer.setVisibility(View.VISIBLE);
                opcioCorrecte(medioDer, t , i, button, bValidar);
                break;
            case 6:
                t.setText("Responeu.");
                opcio1.setText("Està arran de terra");
                opcio2.setText("Està suspès en una balconada");
                opcio1.setVisibility(View.VISIBLE);
                opcio2.setVisibility(View.VISIBLE);
                opcio1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        errors++;
                        String erroors = String.valueOf(errors);
                        errorsText.setText(erroors);
                        Snackbar popup = Snackbar.make(view, "¡¡¡INCORRECTE!!!", 2500);
                        popup.getView().setBackgroundColor(Color.parseColor("#F12B2B"));
                        popup.show();
                    }
                });
                opcio2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        encerts++;
                        String enceerts = String.valueOf(encerts);
                        encertsText.setText(enceerts);
                        Snackbar popup = Snackbar.make(view, "¡¡¡CORRECTE!!!", 2500);
                        popup.getView().setBackgroundColor(Color.parseColor("#7ED321"));
                        opcio1.setVisibility(View.INVISIBLE);
                        popup.show();
                        button.setEnabled(true);
                        contador2++;
                    }
                });
                break;
            case 7:
                button.setEnabled(false);
                opcio2.setVisibility(View.INVISIBLE);

                t.setText("Es visualitza la imatge del nou orgue");
                arribaIzq.setVisibility(View.VISIBLE);
                mediIzq.setVisibility(View.VISIBLE);
                abajoizq.setVisibility(View.VISIBLE);
                arribaDer.setVisibility(View.VISIBLE);
                medioDer.setVisibility(View.VISIBLE);
                abajoDer.setVisibility(View.VISIBLE);
                opcioCorrecte(arribaDer, t, i, button, bValidar);
                i.setImageResource(R.drawable.pregunta5);
                i.setVisibility(View.VISIBLE);
                break;
            case 8:
                t.setText("Quina és la relació entre el disseny de la façana del nou orgue i la ciutat de Valls?");
                opcio1.setVisibility(View.VISIBLE);
                opcio2.setVisibility(View.VISIBLE);
                opcio3.setVisibility(View.VISIBLE);
                opcio2.setChecked(false);
                opcio1.setText("Els calçots i els castells");
                opcio2.setText("Els castells i el campanar");
                opcio3.setText("El campanar i els gegants");
                opcio1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        errors++;
                        String erroors = String.valueOf(errors);
                        errorsText.setText(erroors);
                        Snackbar popup = Snackbar.make(view, "¡¡¡INCORRECTE!!!", 2500);
                        popup.getView().setBackgroundColor(Color.parseColor("#F12B2B"));
                        popup.show();
                    }
                });
                opcio2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        encerts++;
                        String enceerts = String.valueOf(encerts);
                        encertsText.setText(enceerts);
                        Snackbar popup = Snackbar.make(view, "¡¡¡CORRECTE!!!", 2500);
                        popup.getView().setBackgroundColor(Color.parseColor("#7ED321"));
                        opcio1.setVisibility(View.INVISIBLE);
                        opcio3.setVisibility(View.INVISIBLE);
                        popup.show();
                        button.setEnabled(true);
                        contador2++;
                    }
                });
                opcio3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        errors++;
                        String erroors = String.valueOf(errors);
                        errorsText.setText(erroors);
                        Snackbar popup = Snackbar.make(view, "¡¡¡INCORRECTE!!!", 2500);
                        popup.getView().setBackgroundColor(Color.parseColor("#F12B2B"));
                        popup.show();
                    }
                });
                break;
            case 9:
                opcio2.setVisibility(View.INVISIBLE);
                button.setEnabled(true);
                t.setText("Aneu a la ubicació que mostra el plànol");
                i.setImageResource(R.drawable.planolabajoizq);
                i.setVisibility(View.VISIBLE);
                contador2++;
                break;
            case 10:
                i.setVisibility(View.INVISIBLE);
                t.setText("Llegiu i relacioneu cada tipus d’orgue amb la definició que creieu que li correspon.");
                textantipenultima.setVisibility(View.VISIBLE);
                spinner.setVisibility(View.VISIBLE);
                spinner2.setVisibility(View.VISIBLE);
                spinner3.setVisibility(View.VISIBLE);
                spinner4.setVisibility(View.VISIBLE);
                spinner.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,respuestasSpinner));
                spinner2.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,respuestasSpinner));
                spinner3.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,respuestasSpinner));
                spinner4.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,respuestasSpinner));

                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            String resultat = spinner.getSelectedItem().toString();
                            System.out.println(resultat);
                            if (resultat.equals(respuestasSpinner[0].toString())){

                            }
                            else if (resultat.equals(respuestasSpinner[2].toString())){
                                Snackbar popup = Snackbar.make(view, "¡¡¡CORRECTE!!!", 2500);
                                popup.getView().setBackgroundColor(Color.parseColor("#7ED321"));
                                popup.show();
                                button.setVisibility(View.VISIBLE);
                                String enceerts = String.valueOf(encerts);
                                encertsText.setText(enceerts);
                                ayuda = true;
                                encerts++;
                            }

                            else{
                                errors++;
                                String errorrs = String.valueOf(errors);
                                errorsText.setText(errorrs);
                                Snackbar popup = Snackbar.make(view, "¡¡¡INCORRECTE!!!", 2500);
                                popup.getView().setBackgroundColor(Color.parseColor("#F12B2B"));
                                popup.show();
                                ayuda = false;
                            }if (ayuda && ayuda2 && ayuda3 && ayuda4){
                            button.setEnabled(true);
                            contador2=11;
                            encerts++;
                        }

                    }
                    public void onNothingSelected(AdapterView<?> adapterView) {
                    }
                });

                spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        String resultat = spinner2.getSelectedItem().toString();
                        if (resultat.equals(respuestasSpinner[0].toString())){

                        }
                        else if (resultat.equals(respuestasSpinner[3])){
                            Snackbar popup = Snackbar.make(view, "¡¡¡CORRECTE!!!", 2500);
                            popup.getView().setBackgroundColor(Color.parseColor("#7ED321"));
                            popup.show();
                            String enceerts = String.valueOf(encerts);
                            encertsText.setText(enceerts);
                            ayuda2 = true;
                            encerts++;
                        } else{
                            errors++;
                            String errorrs = String.valueOf(errors);
                            errorsText.setText(errorrs);
                            Snackbar popup = Snackbar.make(view, "¡¡¡INCORRECTE!!!", 2500);
                            popup.getView().setBackgroundColor(Color.parseColor("#F12B2B"));
                            popup.show();
                            ayuda2 = false;
                        }if (ayuda && ayuda2 && ayuda3 && ayuda4){
                            button.setEnabled(true);
                            contador2=11;
                            encerts++;
                        }
                    }
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });

                spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        String resultat = spinner3.getSelectedItem().toString();
                        if (resultat.equals(respuestasSpinner[0].toString())){

                        }
                        else if (resultat.equals(respuestasSpinner[1])){
                            String enceerts = String.valueOf(encerts);
                            encertsText.setText(enceerts);
                            Snackbar popup = Snackbar.make(view, "¡¡¡CORRECTE!!!", 2500);
                            popup.getView().setBackgroundColor(Color.parseColor("#7ED321"));
                            popup.show();
                            ayuda3 = true;
                            encerts++;
                        }else{
                            errors++;
                            String errorrs = String.valueOf(errors);
                            errorsText.setText(errorrs);
                            Snackbar popup = Snackbar.make(view, "¡¡¡INCORRECTE!!!", 2500);
                            popup.getView().setBackgroundColor(Color.parseColor("#F12B2B"));
                            popup.show();
                            ayuda3 = false;
                        }if (ayuda && ayuda2 && ayuda3 && ayuda4){
                            button.setEnabled(true);
                            contador2=11;
                            encerts++;
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });
                spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        String resultat = spinner4.getSelectedItem().toString();
                        if (resultat.equals(respuestasSpinner[0].toString())){

                        }
                        else if (resultat.equals(respuestasSpinner[4])) {

                            String enceerts = String.valueOf(encerts);
                            encertsText.setText(enceerts);
                            Snackbar popup = Snackbar.make(view, "¡¡¡CORRECTE!!!", 2500);
                            popup.getView().setBackgroundColor(Color.parseColor("#7ED321"));
                            popup.show();
                            ayuda4 = true;
                            encerts++;
                        }else{
                            errors++;
                            String errorrs = String.valueOf(errors);
                            errorsText.setText(errorrs);
                            Snackbar popup = Snackbar.make(view, "¡¡¡INCORRECTE!!!", 2500);
                            popup.getView().setBackgroundColor(Color.parseColor("#F12B2B"));
                            popup.show();
                            ayuda4 = false;
                        }
                        if (ayuda && ayuda2 && ayuda3 && ayuda4){
                            button.setEnabled(true);
                            contador2=11;
                        }}
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });
                break;
            case 11:
                textantipenultima.setText("");
                spinner.setVisibility(View.INVISIBLE);
                spinner2.setVisibility(View.INVISIBLE);
                spinner3.setVisibility(View.INVISIBLE);
                spinner4.setVisibility(View.INVISIBLE);
                t.setText("Mireu bé la façana de l’orgue i trieu de totes aquestes parts les que són visibles.");
                i.setImageResource(R.drawable.preguntaa7);
                check1.setVisibility(View.VISIBLE);
                check2.setVisibility(View.VISIBLE);
                check3.setVisibility(View.VISIBLE);
                check4.setVisibility(View.VISIBLE);
                check5.setVisibility(View.VISIBLE);
                check6.setVisibility(View.VISIBLE);
                check7.setVisibility(View.VISIBLE);
                check8.setVisibility(View.VISIBLE);
                check9.setVisibility(View.VISIBLE);

                bValidar.setVisibility(View.VISIBLE);
                bValidar.setEnabled(true);
                bValidar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(check1.isChecked()==false && check3.isChecked()==false && check5.isChecked()==false && check8.isChecked()==false && check2.isChecked()==true && check9.isChecked()==true && check6.isChecked()==true && check4.isChecked()==true && check7.isChecked()==true){
                            button.setEnabled(true);
                            contador2++;
                            Snackbar popup = Snackbar.make(view, "¡¡¡CORRECTE!!!", 2500);
                            popup.getView().setBackgroundColor(Color.parseColor("#7ED321"));
                            popup.show();
                            button.setVisibility(View.VISIBLE);
                            String enceerts = String.valueOf(encerts);
                            encertsText.setText(enceerts);
                            bValidar.setVisibility(View.INVISIBLE);

                        }else{
                            errors++;
                            String erroors = String.valueOf(errors);
                            errorsText.setText(erroors);
                            Snackbar popup = Snackbar.make(view, "¡¡¡INCORRECTE!!!", 2500);
                            popup.getView().setBackgroundColor(Color.parseColor("#F12B2B"));
                            popup.show();
                        }
                    }
                });
                break;
            case 12:
                checksInvisible();
                spinner.setVisibility(View.INVISIBLE);
                spinner2.setVisibility(View.INVISIBLE);
                spinner3.setVisibility(View.INVISIBLE);
                spinner4.setVisibility(View.INVISIBLE);
                act11_radio.setVisibility(View.VISIBLE);
                act11_radio2.setVisibility(View.VISIBLE);
                act11_radio3.setVisibility(View.VISIBLE);
                act11_radio4.setVisibility(View.VISIBLE);
                i.setVisibility(View.INVISIBLE);
                t.setText("Quina és la dif erència entre orguener i organista?");
                textantipenultima.setText("1- No hi ha cap diferència, és el mateix.\n\n 2- L’orguener construeix i l’organista toca.\n\n3- L’organista construeix i l’orguener toca.\n\n4- L’orguener toca molt i l’organista no toca gaire.");
                act11_radio.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        errors++;
                        String erroors = String.valueOf(errors);
                        errorsText.setText(erroors);
                        Snackbar popup = Snackbar.make(view, "¡¡¡INCORRECTE!!!", 2500);
                        popup.getView().setBackgroundColor(Color.parseColor("#F12B2B"));
                        popup.show();
                    }
                });
                act11_radio2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        encerts++;
                        String enceerts = String.valueOf(encerts);
                        encertsText.setText(enceerts);
                        Snackbar popup = Snackbar.make(view, "¡¡¡CORRECTE!!!", 2500);
                        popup.getView().setBackgroundColor(Color.parseColor("#7ED321"));
                        act11_radio.setVisibility(View.INVISIBLE);
                        act11_radio3.setVisibility(View.INVISIBLE);
                        act11_radio4.setVisibility(View.INVISIBLE);
                        popup.show();
                        button.setEnabled(true);
                        contador2++;
                    }
                });
                act11_radio3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        errors++;
                        String erroors = String.valueOf(errors);
                        errorsText.setText(erroors);
                        Snackbar popup = Snackbar.make(view, "¡¡¡INCORRECTE!!!", 2500);
                        popup.getView().setBackgroundColor(Color.parseColor("#F12B2B"));
                        popup.show();
                    }
                });
                act11_radio4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        errors++;
                        String erroors = String.valueOf(errors);
                        errorsText.setText(erroors);
                        Snackbar popup = Snackbar.make(view, "¡¡¡INCORRECTE!!!", 2500);
                        popup.getView().setBackgroundColor(Color.parseColor("#F12B2B"));
                        popup.show();
                    }
                });

                break;
            case 13:
                opcio4.setVisibility(View.INVISIBLE);
                opcio3.setVisibility(View.INVISIBLE);
                opcio2.setVisibility(View.INVISIBLE);
                opcio1.setVisibility(View.INVISIBLE);
                textantipenultima.setVisibility(View.INVISIBLE);
                t.setText("FELICITATS!!! HAS CONSEGUIT PASAR LES PREGUNTES AMB UN TOTAL DE " + encerts + " ENCERTS I UN TOTAL DE " + errors + " ERRORS!!");
                button.setText("Tornar al inici");
                button.setEnabled(true);
                contador2++;
                break;
            case 14:
                String erroors = String.valueOf(errors);
                String enccerts = String.valueOf(encerts);
                tornarInici(enccerts,erroors);
                break;

        }


    }


    public void omplirOrgue(ArrayList llista){
        ImageView arribaIzq = (ImageView) findViewById(R.id.foto1);
        ImageView mediIzq = (ImageView) findViewById(R.id.foto2);
        ImageView abajoizq = (ImageView) findViewById(R.id.foto3);
        ImageView arribaDer = (ImageView) findViewById(R.id.foto4);
        ImageView medioDer = (ImageView) findViewById(R.id.foto5);
        ImageView abajoDer = (ImageView) findViewById(R.id.foto6);
        arribaIzq.setImageResource(R.drawable.arribaizq);
        mediIzq.setImageResource(R.drawable.mediaizq);
        abajoizq.setImageResource(R.drawable.abajoizq);
        arribaDer.setImageResource(R.drawable.arribader);
        medioDer.setImageResource(R.drawable.medioder);
        abajoDer.setImageResource(R.drawable.abajoder);
        llista.add(arribaIzq);
        llista.add(mediIzq);
        llista.add(abajoizq);
        llista.add(arribaDer);
        llista.add(medioDer);
        llista.add(abajoDer);
    }

    public void tornarInici(String encerts, String errors){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("encerts",encerts );
        intent.putExtra("errors",errors );
        startActivity(intent);
        overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);

    }

    public void checksInvisible(){
        CheckBox check1 = (CheckBox) findViewById(R.id.checkbox1);
        CheckBox check2 = (CheckBox) findViewById(R.id.checkbox2);
        CheckBox check3 = (CheckBox) findViewById(R.id.checkbox3);
        CheckBox check4 = (CheckBox) findViewById(R.id.checkbox4);
        CheckBox check5 = (CheckBox) findViewById(R.id.checkbox5);
        CheckBox check6 = (CheckBox) findViewById(R.id.checkbox6);
        CheckBox check7 = (CheckBox) findViewById(R.id.checkbox7);
        CheckBox check8 = (CheckBox) findViewById(R.id.checkbox8);
        CheckBox check9 = (CheckBox) findViewById(R.id.checkbox9);
        check1.setVisibility(View.INVISIBLE);
        check2.setVisibility(View.INVISIBLE);
        check3.setVisibility(View.INVISIBLE);
        check4.setVisibility(View.INVISIBLE);
        check5.setVisibility(View.INVISIBLE);
        check6.setVisibility(View.INVISIBLE);
        check7.setVisibility(View.INVISIBLE);
        check8.setVisibility(View.INVISIBLE);
        check9.setVisibility(View.INVISIBLE);
    }


}
