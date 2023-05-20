package idat.dami.chinestarapp.ViewCine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;


import idat.dami.chinestarapp.Formatos.FormatosActivity;
import idat.dami.chinestarapp.Inicio.CarteleraActivity;
import idat.dami.chinestarapp.ViewComentarios.ComentariosActivity;
import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.ViewConfiteria.ConfiteriaActivity;

public class CinesActivity extends AppCompatActivity {
    private TextView zonaLima;
    private TextView zonaSur;
    private TextView zonaCentro;
    private TextView zonaNorte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cines);
        getSupportActionBar().hide();

        zonaLima = (TextView) findViewById(R.id.btnZonaLima);
        zonaSur = (TextView) findViewById(R.id.btnZonaSur);
        zonaNorte = (TextView) findViewById(R.id.btnZonaNorte);
        zonaCentro = (TextView) findViewById(R.id.btnZonaCentro);

        zonaLima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentZonaLima fragmentZonaLima = new FragmentZonaLima();

                fragmentTransaction.add(R.id.fragmentCines, fragmentZonaLima);
                //fragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                fragmentTransaction.addToBackStack(null).commit();
                //fragmentTransaction.commit();
            }

        });

        zonaSur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentZonaSur fragmentZonaSur = new FragmentZonaSur();

                fragmentTransaction.add(R.id.fragmentCines, fragmentZonaSur);
                //fragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                fragmentTransaction.addToBackStack(null).commit();
                //fragmentTransaction.commit();
            }
        });

        zonaNorte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentZonaNorte fragmentZonaNorte = new FragmentZonaNorte();


                fragmentTransaction.add(R.id.fragmentCines, fragmentZonaNorte);
                //fragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                fragmentTransaction.addToBackStack(null).commit();
                //fragmentTransaction.commit();
            }
        });

        zonaCentro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentZonaCentro fragmentZonaCentro = new FragmentZonaCentro();

                fragmentTransaction.add(R.id.fragmentCines, fragmentZonaCentro);
                //fragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                fragmentTransaction.addToBackStack(null).commit();
                //fragmentTransaction.commit();
            }
        });


    }

    //método para enlazar a otros activity
    public void irAInicio(View view) {
        Intent objInicio = new Intent(this, CarteleraActivity.class);
        startActivity(objInicio);
    }

    public void irAConfiteria(View view) {
        Intent objInicio = new Intent(this, ConfiteriaActivity.class);
        startActivity(objInicio);
    }

    public void irFormatos(View view) {
        Intent objInicio = new Intent(this, FormatosActivity.class);
        startActivity(objInicio);
    }

    public void irAPromociones(View view) {
        Intent objInicio = new Intent(this, ComentariosActivity.class);
        startActivity(objInicio);
    }


}