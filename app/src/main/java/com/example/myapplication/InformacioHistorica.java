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
                    titol2.setText("L???EDIFICI");
                    text2.setText("A la cantonada podem observar un carreu diferent dels altres.\n" +
                            "\n" +
                            "Dos lleons sostenen l???escut de la ciutat de Valls.\n" +
                            "\n" +
                            "Aix?? ens indica que l???edifici pertany a la ciutat i a tota la gent que hi viu. \n" +
                            "\n" +
                            "A l???interior tamb?? podem veure l???escut, ara s?? amb els colors de la ciutat, a cadascuna de les claus de volta.\n");
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
                            "Abans de construir-se l???actual esgl??sia de st Joan n???hi havia una de m??s petita, la de st Miquel. Se sap que aquesta ja tenia un orgue petit.\n" +
                            "\n" +
                            "Quan es va construir l???esgl??sia de st Joan va necessitar un orgue m??s gran que s???adeq????s a les noves mesures de la nau.\n" +
                            "\n" +
                            "La construcci?? del nou orgue es va fer entre els anys 1587 i 1590. \n");
                    fotoseguit.setImageResource(R.drawable.quartafoto);
                    break;
                case 3:
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    text2.setText("Estava situat a la meitat de la nau.\n" +
                            "\n" +
                            "Els teclats estaven situats en al??ada en una mena de balconada.\n" +
                            "\n" +
                            "L???organista hi accedia per una escala situada a l???interior del mur.\n" +
                            "\n" +
                            "L???any 1936 va ser destru??t i van fondre el metall dels tubs per fer munici?? per a la guerra civil espanyola. L?????ltim dia que es va fer sonar va ser el 21 de juliol.\n");
                    fotoseguit.setImageResource(R.drawable.quintafoto);
                    break;
                case 4:
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    text2.setText("Tenia unes portes que es tanc??ven quan l???orgue no s???utilitzava. Les portes tapaven els tubs de la fa??ana. \n" +
                            "\n" +
                            "Molts orgues catalans de l?????poca tenien portes amb pintures o cortines.\n" +
                            "\n" +
                            "Les pintures que es veien a la part de fora, quan les portes estaven tancades, mostr??ven l???Anunciaci?? de l?????ngel a Maria. \n" +
                            "Les de la part de dins, i que es veien quan les portes estaven obertes, ens mostraven en un cant?? el naixement de Jes??s i en l???altra la resurrecci??.\n");
                    fotoseguit.setImageResource(R.drawable.sisenafoto);
                    seguent.setVisibility(View.INVISIBLE);
                    tornarInici.setVisibility(View.VISIBLE);

                    break;
                case 5:
                    titol2.setVisibility(View.VISIBLE);
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    titol2.setText("EL NOU ORGUE");
                    text2.setText("Un grup de ciutadans i institucions de Valls vinculades amb la m??sica han volgut recuperar aquest instrument per a la ciutat.\n" +
                            "\n" +
                            "Est?? pensat per a que tingui diferents usos, concerts, aprenentatge de l???instrument, acompanyament als actes lit??rgics...\n");
                    fotoseguit.setImageResource(R.drawable.setenafoto);
                    break;
                case 6:
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    text2.setText("El disseny de la fa??ana t?? molta verticalitat i est?? inspirat en tres caracter??stics de la ciutat: els castells i el campanar tan alt.\n" +
                            "\n" +
                            "Tamb?? els tubs estan organitzats en corones que simulen la pinya dels castells.\n" +
                            "\n" +
                            "T?? una al??ada de 14,7 metres i tindr?? un registre amb el so de les gralles.\n");
                    fotoseguit.setImageResource(R.drawable.vuitenafoto);
                    seguent.setVisibility(View.INVISIBLE);
                    tornarInici.setVisibility(View.VISIBLE);
                    break;
                case 7:
                    titol2.setVisibility(View.VISIBLE);
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    titol2.setText("L???INSTRUMENT");
                    text2.setText("L???orgue ??s un instrument de vent o aer??fon. L???instrumentista acciona les tecles i uns mecanismes fan passar l???aire pels tubs.\n" +
                            "\n" +
                            "Degut a les seves dimensions considerables ha d???estar situat en espais grans com solen ser  auditoris, sales de concerts, palaus o esgl??sies.\n" +
                            "\n" +
                            "Els primers orgues, per??, eren molt petitis i es podien transportar. \n" +
                            "\n" +
                            "Cada tub est?? associat a una tecla segons la nota que volem que soni tal com es pot veure en aquest orgue port??tiu.\n");
                    fotoseguit.setImageResource(R.drawable.novenafoto);
                    break;
                case 8:
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    text2.setText("Amb el temps es van anar ampliant la quantitat de tubs i registres i va evolucionar cap a l???instrument que coneixem avui en dia.\n" +
                            "\n" +
                            "No tots els tubs de l???orgue es veuen. A l???interior de l???instrument n???hi ha molts m??s.\n" +
                            "\n" +
                            "Els orgues petits poden tenir uns 100 tubs.\n" +
                            "\n" +
                            "Un orgue mitj?? t?? entre 1000 i 2500 tubs.\n" +
                            "\n" +
                            "Els orgues m??s grans poden arribar a tenir 11ooo tubs tal com el que hi ha al Palau Nacional de Catalunya a Barcelona.\n");
                    fotoseguit.setImageResource(R.drawable.decnimafoto);
                    break;
                case 9:
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    imagen4.setVisibility(View.VISIBLE);
                    text2.setText("Les parts principals s??n:\n\n" +
                            "1- La consola\n" +
                            "??s la part on hi ha situats els teclats i els registres. Podr??em dir que ??s el centre de comandament per a l???organista.\n\n" +
                            "2- La caixa\n" +
                            "??s el moble o estructura que sost?? l???instrument. Cont?? els tubs i els mecanismes per a fer-lo funcionar. En aquesta imatge t?? forma de m??.\n" +
                            "L???orgue de Valls no t?? pr??piament un moble sin?? que una estructura interna ??s la que sost?? els tubs.\n");
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
                            "Estan formats per unes palanques horitzontals basculants que formen l???escala dels sons.\n" +
                            "\n" +
                            "El pedaler ??s el teclat que s???acciona amb els peus i fa sonar els tubs m??s grossos i m??s greus.\n" +
                            "\n" +
                            "Els orgues considerats petits tenen un teclat\n" +
                            "\n" +
                            "Els orgues mitjans 2 o 3 teclats, un dels quals pot ser pedaler.\n" +
                            "\n" +
                            "Els orgues grans poden tenir m??s de 4 teclats i 1 pedaler.\n" +
                            "\n" +
                            "De fet podr??em dir que cada teclat ??s un orgue diferent.\n");
                    fotoseguit.setImageResource(R.drawable.teclats1);
                    imagen4.setImageResource(R.drawable.teclats2);
                    break;
                case 11:
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    text2.setText("1.2 Els registres\n" +
                            "S??n uns botons de fusta o plaques basculants que en activar-los permeten el pas de l???aire cap el conjunt de tubs que l???organista vol que sonin en un moment determinat. \n" +
                            "\n" +
                            "Cada registre d??na un timbre i un color sonor diferent segons les caracter??stiques dels tubs: la forma, la mida, la manera de produir el so ???.. \n" +
                            "\n" +
                            "Acostumen a portar un nom indicatiu del timbre (flauta, trompeta???) i un n??mero que indica l???altura del tub que fan sonar. (16???, 8???, 4???, ???.)\n" +
                            "\n" +
                            "Estan agrupats de manera que cada teclat t?? el seu grup de registres.\n" +
                            "\n" +
                            "Els orgues petits tenen uns 12 registres.\n" +
                            "Els orgues mitjans tenen fins a 30 registres\n" +
                            "Els orgues grans tenen m??s de 30 registres.\n");
                    fotoseguit.setImageResource(R.drawable.teclatorgue);
                    break;
                case 12:
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    text2.setText("1.3 El pedal de l???Expressiu\n" +
                            "\n" +
                            "Aquest pedal permet graduar la intensitat del so del teclat que es diu EXpressiu.\n" +
                            "\n" +
                            "Els tubs associats a aquest teclat estan tancats dins d???una caixa amb persianes. Si s???acciona el pedal es van obrint m??s o menys segons la intensitat que li vulguem donar a la melodia.\n");
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
                    text2.setText("S??n el conjunt de tubs. Els principals estan situats a la fa??ana i els altres a la part interior.\n" +
                            "\n" +
                            "Els tubs de la fa??ana poden estar decorats.\n" +
                            "\n" +
                            "Els materials utilitzats s??n una aleaci?? d???estany i plom o fusta per als que s??n prism??tics.\n" +
                            "\n" +
                            "A l???orgue de Valls el tub m??s llarg fa 5 metres i el m??s curt ??s de la mida de l???ungla del dit gros.\n");
                    fotoseguit.setImageResource(R.drawable.tubs);
                    imagen4.setImageResource(R.drawable.tubs2);

                    break;
                case 14:
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    text2.setText("Els tubs estan agrupats per registres.  Poden ser oberts, semitapats o tapats\n" +
                            "\n" +
                            "Poden tenir forma cil??ndrica, c??nica o de prisma quadrangular.\n" +
                            "\n" +
                            "El so es pot produir per la vibraci?? de l???aire en una boca amb bisell o en una lleng??eta al tub.\n" +
                            "\n" +
                            "El timbre caracter??stic de cada tub estar?? en funci?? de tots aquests par??metres.\n");
                    fotoseguit.setImageResource(R.drawable.canonada);
                    break;
                case 15:
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    text2.setText("Quan es construeix un orgue hi ha un grup de tubs que hi han de ser si o si. S??n els que es diuen ???Principals???.\n" +
                            "\n" +
                            "Els altres poden anar variant segons els gustos musicals de la zona.\n" +
                            "\n" +
                            "En l???orgue de Valls s???hi ha posat un grup de tubs associats al registre de gralla ja que som una zona castellera.\n" +
                            "Estan situats just damunt de la consola. \n" +
                            "\n" +
                            "Tenen forma c??nica, s??n de fusta i el so es produeix fent vibrar una lleng??eta.\n");
                    fotoseguit.setImageResource(R.drawable.canonada2);
                    seguent.setVisibility(View.INVISIBLE);
                    tornarInici.setVisibility(View.VISIBLE);
                    break;
                case 16:
                    titol2.setVisibility(View.VISIBLE);
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    titol2.setText("3 SALMER O SECRET (COS SONOR)");
                    text2.setText("??s la caixa de fusta que distribueix el vent entre els tubs.\n" +
                            "\n" +
                            "??s rectangular i al damunt hi ha els tubs ordenats de cada registre.\n" +
                            "\n" +
                            "Cada canal t?? un v??lvula, ventallola,  que permet el pas de l???aire quan es polsa una tecla.\n" +
                            "\n" +
                            "Cada teclat t?? el seu salmer amb els tubs disposats en fileres paral??leles.\n");
                    fotoseguit.setImageResource(R.drawable.salmer);
                    seguent.setVisibility(View.INVISIBLE);
                    tornarInici.setVisibility(View.VISIBLE);
                    break;
                case 17:
                    titol2.setVisibility(View.VISIBLE);
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    titol2.setText("4 MANXES");
                    text2.setText("??s el mecanisme que d??na aire a l???orgue per al seu funcionament.\n" +
                            "\n" +
                            "Antigament estaven accionats manualment per uns manxaires per?? avui en dia ??s un un motor el??ctric qui produeix l???aire. Tamb?? hi ha uns pesos que controlen que la pressi?? sigui constant.\n");
                    fotoseguit.setImageResource(R.drawable.manxes);
                    seguent.setVisibility(View.INVISIBLE);
                    tornarInici.setVisibility(View.VISIBLE);
                    break;
                case 18:
                    titol2.setVisibility(View.VISIBLE);
                    text2.setVisibility(View.VISIBLE);
                    fotoseguit.setVisibility(View.VISIBLE);
                    titol2.setText("5 MECANISME");
                    text2.setText("Quan l???organista prem cadascuna de les tecles tiba una vareta que obre el pas de l???aire dels tubs que sonen amb aquella nota.\n" +
                            "L???aire entra a pressi?? a trav??s de les v??lvules cap al secret segons els registres que tenim activats.");
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

