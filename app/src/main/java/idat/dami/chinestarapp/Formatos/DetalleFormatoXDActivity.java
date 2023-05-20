package idat.dami.chinestarapp.Formatos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import idat.dami.chinestarapp.Inicio.CarteleraActivity;
import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.ViewCine.CinesActivity;
import idat.dami.chinestarapp.ViewConfiteria.ConfiteriaActivity;
import idat.dami.chinestarapp.ViewPromociones.PromoActivity;

public class DetalleFormatoXDActivity extends AppCompatActivity {

    private TextView btn_informesXD;
    private TextView btn_horariosXD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_formato_xd);
        getSupportActionBar().hide();

        btn_informesXD = findViewById(R.id.btnFormatoDetalleInformeXD);
        btn_horariosXD = findViewById(R.id.btnFormatoDetalleHorarioXD);

        btn_informesXD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                Fragment_informe_xd frag_informeXD = new Fragment_informe_xd();
                //fragmentManager.clearBackStack(null);

                fragmentTransaction.add(R.id.fragmentContentXD, frag_informeXD);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        btn_horariosXD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                Fragmento_horarioXD frag_horarioXD = new Fragmento_horarioXD();
                //fragmentManager.clearBackStack(null);

                fragmentTransaction.add(R.id.fragmentContentXD, frag_horarioXD);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
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

    public void irACines(View view) {
        Intent objInicio = new Intent(this, CinesActivity.class);
        startActivity(objInicio);
    }

    public void irAFormatos(View view) {
        Intent objInicio = new Intent(this, FormatosActivity.class);
        startActivity(objInicio);
    }

    public void irAPromociones(View view) {
        Intent objInicio = new Intent(this, PromoActivity.class);
        startActivity(objInicio);
    }


}