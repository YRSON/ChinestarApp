package idat.dami.chinestarapp.Formatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import idat.dami.chinestarapp.Inicio.CarteleraActivity;
import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.ViewPromociones.PromoActivity;
import idat.dami.chinestarapp.ViewCine.CinesActivity;
import idat.dami.chinestarapp.ViewConfiteria.ConfiteriaActivity;

public class FormatosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formatos);
        //ocultar el ActionBar
        getSupportActionBar().hide();
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

    //saltar al Activiti Formatos
    public void irAFormatoXD(View view) {
        Intent objInicio = new Intent(this, DetalleFormatoXDActivity.class);
        startActivity(objInicio);
    }

    public void irAFormatoDBOX(View view) {
        Intent objInicio = new Intent(this, DetalleFormatoDBoxActivity.class);
        startActivity(objInicio);
    }

}