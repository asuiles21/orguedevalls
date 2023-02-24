package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class InformacioHistorica extends AppCompatActivity{

    Bundle datos;
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.informacio_historica);

            TextView text1 = (TextView) findViewById(R.id.textView4);
            TextView text2 = (TextView) findViewById(R.id.textView6);
            TextView text3 = (TextView) findViewById(R.id.textView5);
            TextView text4 = (TextView) findViewById(R.id.textView3);
            ImageView imatge1 = (ImageView) findViewById(R.id.imageView4);
            ImageView imatge2 = (ImageView) findViewById(R.id.imageView2);
            ImageView imatge3 = (ImageView) findViewById(R.id.imageView3);
            ImageView imatge4 = (ImageView) findViewById(R.id.imageView6);
            ImageView imatge5 = (ImageView) findViewById(R.id.imageView);

            text1.setVisibility(View.INVISIBLE);
            text2.setVisibility(View.INVISIBLE);
            text3.setVisibility(View.INVISIBLE);
            text4.setVisibility(View.INVISIBLE);

            imatge1.setVisibility(View.INVISIBLE);
            imatge2.setVisibility(View.INVISIBLE);
            imatge3.setVisibility(View.INVISIBLE);
            imatge4.setVisibility(View.INVISIBLE);
            imatge5.setVisibility(View.INVISIBLE);

            Button seguent = (Button) findViewById(R.id.seguent);
            Button tornarInici = (Button) findViewById(R.id.tornarIndex);

            tornarInici.setVisibility(View.INVISIBLE);

            datos = getIntent().getExtras();
            int numeroContador = Integer.parseInt(datos.getString("key"));


            switchCase(numeroContador,seguent,tornarInici);


            seguent.setOnClickListener(new View.OnClickListener() {
                int numeroContador = Integer.parseInt(datos.getString("key"));
                @Override
                public void onClick(View view) {
                    numeroContador= numeroContador +1;
                    switchCase(numeroContador,seguent,tornarInici);
                }
            });

            tornarInici.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tornarInici();
                }
            });




        }
        public  void switchCase(int numeroContador,Button seguent,Button tornarInici){
            TextView text = (TextView) findViewById(R.id.textView4);
            TextView titol = (TextView) findViewById(R.id.textView3);
            TextView titol2 = (TextView) findViewById(R.id.textView5);
            TextView text2 = (TextView) findViewById(R.id.textView6);
            ImageView imagen1 = (ImageView) findViewById(R.id.imageView);
            ImageView imagen2 = (ImageView) findViewById(R.id.imageView2);
            ImageView imagen3 = (ImageView) findViewById(R.id.imageView3);
            ImageView imagen4 = (ImageView) findViewById(R.id.imageView4);
            ImageView fotoseguit = (ImageView) findViewById(R.id.imageView6);
            imagen4.setVisibility(View.INVISIBLE);


            switch (numeroContador){
                case 1:
                    titol.setVisibility(View.VISIBLE);
                    text.setVisibility(View.VISIBLE);
                    imagen1.setVisibility(View.VISIBLE);
                    imagen2.setVisibility(View.VISIBLE);
                    imagen3.setVisibility(View.VISIBLE);
                    titol2.setText("L’EDIFICI");
                    text2.setText("A la cantonada podem observar un carreu diferent dels altres.\n" +
                            "\n" +
                            "Dos lleons sostenen l’escut de la ciutat de Valls.\n" +
                            "\n" +
                            "Això ens indica que l’edifici pertany a la ciutat i a tota la gent que hi viu. \n" +
                            "\n" +
                            "A l’interior també podem veure l’escut, ara sí amb els colors de la ciutat, a cadascuna de les claus de volta.\n");
                    fotoseguit.setImageResource(R.drawable.quartafoto);
                    seguent.setVisibility(View.INVISIBLE);
                    tornarInici.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    titol2.setVisibility(View.VISIBLE);
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    titol2.setText("HISTORIA");
                    text2.setText("Valls havia tingut sempre un orgue.\n" +
                            "\n" +
                            "Abans de construir-se l’actual església de st Joan n’hi havia una de més petita, la de st Miquel. Se sap que aquesta ja tenia un orgue petit.\n" +
                            "\n" +
                            "Quan es va construir l’església de st Joan va necessitar un orgue més gran que s’adeqüés a les noves mesures de la nau.\n" +
                            "\n" +
                            "La construcció del nou orgue es va fer entre els anys 1587 i 1590. \n");
                    fotoseguit.setImageResource(R.drawable.quartafoto);
                    break;
                case 3:
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    text2.setText("Estava situat a la meitat de la nau.\n" +
                            "\n" +
                            "Els teclats estaven situats en alçada en una mena de balconada.\n" +
                            "\n" +
                            "L’organista hi accedia per una escala situada a l’interior del mur.\n" +
                            "\n" +
                            "L’any 1936 va ser destruït i van fondre el metall dels tubs per fer munició per a la guerra civil espanyola. L’últim dia que es va fer sonar va ser el 21 de juliol.\n");
                    fotoseguit.setImageResource(R.drawable.quintafoto);
                    break;
                case 4:
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    text2.setText("Tenia unes portes que es tancàven quan l’orgue no s’utilitzava. Les portes tapaven els tubs de la façana. \n" +
                            "\n" +
                            "Molts orgues catalans de l’època tenien portes amb pintures o cortines.\n" +
                            "\n" +
                            "Les pintures que es veien a la part de fora, quan les portes estaven tancades, mostràven l’Anunciació de l’àngel a Maria. \n" +
                            "Les de la part de dins, i que es veien quan les portes estaven obertes, ens mostraven en un cantó el naixement de Jesús i en l’altra la resurrecció.\n");
                    fotoseguit.setImageResource(R.drawable.sisenafoto);
                    seguent.setVisibility(View.INVISIBLE);
                    tornarInici.setVisibility(View.VISIBLE);

                    break;
                case 5:
                    titol2.setVisibility(View.VISIBLE);
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    titol2.setText("EL NOU ORGUE");
                    text2.setText("Un grup de ciutadans i institucions de Valls vinculades amb la música han volgut recuperar aquest instrument per a la ciutat.\n" +
                            "\n" +
                            "Està pensat per a que tingui diferents usos, concerts, aprenentatge de l’instrument, acompanyament als actes litúrgics...\n");
                    fotoseguit.setImageResource(R.drawable.setenafoto);
                    break;
                case 6:
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    text2.setText("El disseny de la façana té molta verticalitat i està inspirat en tres característics de la ciutat: els castells i el campanar tan alt.\n" +
                            "\n" +
                            "També els tubs estan organitzats en corones que simulen la pinya dels castells.\n" +
                            "\n" +
                            "Té una alçada de 14,7 metres i tindrà un registre amb el so de les gralles.\n");
                    fotoseguit.setImageResource(R.drawable.vuitenafoto);
                    seguent.setVisibility(View.INVISIBLE);
                    tornarInici.setVisibility(View.VISIBLE);
                    break;
                case 7:
                    titol2.setVisibility(View.VISIBLE);
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    titol2.setText("L’INSTRUMENT");
                    text2.setText("L’orgue és un instrument de vent o aeròfon. L’instrumentista acciona les tecles i uns mecanismes fan passar l’aire pels tubs.\n" +
                            "\n" +
                            "Degut a les seves dimensions considerables ha d’estar situat en espais grans com solen ser  auditoris, sales de concerts, palaus o esglésies.\n" +
                            "\n" +
                            "Els primers orgues, però, eren molt petitis i es podien transportar. \n" +
                            "\n" +
                            "Cada tub està associat a una tecla segons la nota que volem que soni tal com es pot veure en aquest orgue portàtiu.\n");
                    fotoseguit.setImageResource(R.drawable.novenafoto);
                    break;
                case 8:
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    text2.setText("Amb el temps es van anar ampliant la quantitat de tubs i registres i va evolucionar cap a l’instrument que coneixem avui en dia.\n" +
                            "\n" +
                            "No tots els tubs de l’orgue es veuen. A l’interior de l’instrument n’hi ha molts més.\n" +
                            "\n" +
                            "Els orgues petits poden tenir uns 100 tubs.\n" +
                            "\n" +
                            "Un orgue mitjà té entre 1000 i 2500 tubs.\n" +
                            "\n" +
                            "Els orgues més grans poden arribar a tenir 11ooo tubs tal com el que hi ha al Palau Nacional de Catalunya a Barcelona.\n");
                    fotoseguit.setImageResource(R.drawable.decnimafoto);
                    break;
                case 9:
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    imagen4.setVisibility(View.VISIBLE);
                    text2.setText("Les parts principals són:\n\n" +
                            "1- La consola\n" +
                            "És la part on hi ha situats els teclats i els registres. Podríem dir que és el centre de comandament per a l’organista.\n\n" +
                            "2- La caixa\n" +
                            "És el moble o estructura que sosté l’instrument. Conté els tubs i els mecanismes per a fer-lo funcionar. En aquesta imatge té forma de mà.\n" +
                            "L’orgue de Valls no té pròpiament un moble sinó que una estructura interna és la que sosté els tubs.\n");
                    fotoseguit.setImageResource(R.drawable.laconsola);
                    imagen4.setImageResource(R.drawable.lacaixa);
                    seguent.setVisibility(View.INVISIBLE);
                    tornarInici.setVisibility(View.VISIBLE);
                    break;
                case 10:
                    titol2.setVisibility(View.VISIBLE);
                    text2.setVisibility(View.VISIBLE);
                    imagen4.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    titol2.setText("1 CONSOLA");
                    text2.setText("1.1 Els teclats\n" +
                            "\n" +
                            "Estan formats per unes palanques horitzontals basculants que formen l’escala dels sons.\n" +
                            "\n" +
                            "El pedaler és el teclat que s’acciona amb els peus i fa sonar els tubs més grossos i més greus.\n" +
                            "\n" +
                            "Els orgues considerats petits tenen un teclat\n" +
                            "\n" +
                            "Els orgues mitjans 2 o 3 teclats, un dels quals pot ser pedaler.\n" +
                            "\n" +
                            "Els orgues grans poden tenir més de 4 teclats i 1 pedaler.\n" +
                            "\n" +
                            "De fet podríem dir que cada teclat és un orgue diferent.\n");
                    fotoseguit.setImageResource(R.drawable.teclats1);
                    imagen4.setImageResource(R.drawable.teclats2);
                    break;
                case 11:
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    text2.setText("1.2 Els registres\n" +
                            "Són uns botons de fusta o plaques basculants que en activar-los permeten el pas de l’aire cap el conjunt de tubs que l’organista vol que sonin en un moment determinat. \n" +
                            "\n" +
                            "Cada registre dóna un timbre i un color sonor diferent segons les característiques dels tubs: la forma, la mida, la manera de produir el so ….. \n" +
                            "\n" +
                            "Acostumen a portar un nom indicatiu del timbre (flauta, trompeta…) i un número que indica l’altura del tub que fan sonar. (16’, 8’, 4’, ….)\n" +
                            "\n" +
                            "Estan agrupats de manera que cada teclat té el seu grup de registres.\n" +
                            "\n" +
                            "Els orgues petits tenen uns 12 registres.\n" +
                            "Els orgues mitjans tenen fins a 30 registres\n" +
                            "Els orgues grans tenen més de 30 registres.\n");
                    fotoseguit.setImageResource(R.drawable.teclatorgue);
                    break;
                case 12:
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    text2.setText("1.3 El pedal de l’Expressiu\n" +
                            "\n" +
                            "Aquest pedal permet graduar la intensitat del so del teclat que es diu EXpressiu.\n" +
                            "\n" +
                            "Els tubs associats a aquest teclat estan tancats dins d’una caixa amb persianes. Si s’acciona el pedal es van obrint més o menys segons la intensitat que li vulguem donar a la melodia.\n");
                    fotoseguit.setImageResource(R.drawable.pedalorgue);
                    seguent.setVisibility(View.INVISIBLE);
                    tornarInici.setVisibility(View.VISIBLE);
                    break;
                case 13:
                    titol2.setVisibility(View.VISIBLE);
                    text2.setVisibility(View.VISIBLE);
                    imagen4.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    titol2.setText("2 CANONADA");
                    text2.setText("Són el conjunt de tubs. Els principals estan situats a la façana i els altres a la part interior.\n" +
                            "\n" +
                            "Els tubs de la façana poden estar decorats.\n" +
                            "\n" +
                            "Els materials utilitzats són una aleació d’estany i plom o fusta per als que són prismàtics.\n" +
                            "\n" +
                            "A l’orgue de Valls el tub més llarg fa 5 metres i el més curt és de la mida de l’ungla del dit gros.\n");
                    fotoseguit.setImageResource(R.drawable.tubs);
                    imagen4.setImageResource(R.drawable.tubs2);

                    break;
                case 14:
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    text2.setText("Els tubs estan agrupats per registres.  Poden ser oberts, semitapats o tapats\n" +
                            "\n" +
                            "Poden tenir forma cilíndrica, cònica o de prisma quadrangular.\n" +
                            "\n" +
                            "El so es pot produir per la vibració de l’aire en una boca amb bisell o en una llengüeta al tub.\n" +
                            "\n" +
                            "El timbre característic de cada tub estarà en funció de tots aquests paràmetres.\n");
                    fotoseguit.setImageResource(R.drawable.canonada);
                    break;
                case 15:
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    text2.setText("Quan es construeix un orgue hi ha un grup de tubs que hi han de ser si o si. Són els que es diuen “Principals”.\n" +
                            "\n" +
                            "Els altres poden anar variant segons els gustos musicals de la zona.\n" +
                            "\n" +
                            "En l’orgue de Valls s’hi ha posat un grup de tubs associats al registre de gralla ja que som una zona castellera.\n" +
                            "Estan situats just damunt de la consola. \n" +
                            "\n" +
                            "Tenen forma cònica, són de fusta i el so es produeix fent vibrar una llengüeta.\n");
                    fotoseguit.setImageResource(R.drawable.canonada2);
                    seguent.setVisibility(View.INVISIBLE);
                    tornarInici.setVisibility(View.VISIBLE);
                    break;
                case 16:
                    titol2.setVisibility(View.VISIBLE);
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    titol2.setText("3 SALMER O SECRET (COS SONOR)");
                    text2.setText("És la caixa de fusta que distribueix el vent entre els tubs.\n" +
                            "\n" +
                            "És rectangular i al damunt hi ha els tubs ordenats de cada registre.\n" +
                            "\n" +
                            "Cada canal té un vàlvula, ventallola,  que permet el pas de l’aire quan es polsa una tecla.\n" +
                            "\n" +
                            "Cada teclat té el seu salmer amb els tubs disposats en fileres paral·leles.\n");
                    fotoseguit.setImageResource(R.drawable.salmer);
                    seguent.setVisibility(View.INVISIBLE);
                    tornarInici.setVisibility(View.VISIBLE);
                    break;
                case 17:
                    titol2.setVisibility(View.VISIBLE);
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    titol2.setText("4 MANXES");
                    text2.setText("És el mecanisme que dóna aire a l’orgue per al seu funcionament.\n" +
                            "\n" +
                            "Antigament estaven accionats manualment per uns manxaires però avui en dia és un un motor elèctric qui produeix l’aire. També hi ha uns pesos que controlen que la pressió sigui constant.\n");
                    fotoseguit.setImageResource(R.drawable.manxes);
                    seguent.setVisibility(View.INVISIBLE);
                    tornarInici.setVisibility(View.VISIBLE);
                    break;
                case 18:
                    titol2.setVisibility(View.VISIBLE);
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    titol2.setText("5 MECANISME");
                    text2.setText("Quan l’organista prem cadascuna de les tecles tiba una vareta que obre el pas de l’aire dels tubs que sonen amb aquella nota.\n" +
                            "L’aire entra a pressió a través de les vàlvules cap al secret segons els registres que tenim activats.");
                    fotoseguit.setImageResource(R.drawable.imatgefinal);
                    seguent.setVisibility(View.INVISIBLE);
                    tornarInici.setVisibility(View.VISIBLE);
            }



    }
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
    }

    public void tornarInici(){
        Intent intent = new Intent(this, listview.class);
        startActivity(intent);
        overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);

    }



}

