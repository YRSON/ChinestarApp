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

public class DetalleFormatoDBoxActivity extends AppCompatActivity {

    private TextView btn_informesDBOX;
    private TextView btn_horariosDBOX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_formato_dbox);
        getSupportActionBar().hide();

        btn_informesDBOX = findViewById(R.id.btnFormatoDetalleInformeDBOX);
        btn_horariosDBOX = findViewById(R.id.btnFormatoDetalleHorarioDBOX);

        btn_informesDBOX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                Fragment_informes_dbox frag_informesDBOX = new Fragment_informes_dbox();
                //fragmentManager.clearBackStack(null);

                fragmentTransaction.add(R.id.fragmentContentDBOX, frag_informesDBOX);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        btn_horariosDBOX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                Fragment_horarioDBOX frag_horarioDBOX = new Fragment_horarioDBOX();
                //fragmentManager.clearBackStack(null);

                fragmentTransaction.add(R.id.fragmentContentDBOX, frag_horarioDBOX);
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