package idat.dami.chinestarapp.Inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import idat.dami.chinestarapp.AsesinoActivity;
import idat.dami.chinestarapp.AvatarActivity2;
import idat.dami.chinestarapp.BestiaActivity;
import idat.dami.chinestarapp.CAmigosActivity;
import idat.dami.chinestarapp.DinoActivity;
import idat.dami.chinestarapp.ElvisActivity;
import idat.dami.chinestarapp.Formatos.FormatosActivity;
import idat.dami.chinestarapp.JurasicWorl;
import idat.dami.chinestarapp.LoginActivity;
import idat.dami.chinestarapp.MinionsActivity;
import idat.dami.chinestarapp.NickjrActivity;
import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.ThorActivity;
import idat.dami.chinestarapp.ViewCine.CinesActivity;
import idat.dami.chinestarapp.ViewComentarios.ComentariosActivity;
import idat.dami.chinestarapp.ViewConfiteria.ConfiteriaActivity;
import idat.dami.chinestarapp.ViewPromociones.PromoActivity;

public class CarteleraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartelera);
        getSupportActionBar().hide();
    }

    //Intent para Activities

    //método para enlazar al login
    public void irALogin(View view) {
        Intent objInicio = new Intent(this, LoginActivity.class);
        startActivity(objInicio);
    }


    //método para enlazar a otros activity
    public void irACines(View view) {
        Intent objInicio = new Intent(this, CinesActivity.class);
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
        Intent objInicio = new Intent(this, PromoActivity.class);
        startActivity(objInicio);
    }

    public void irAComentarios(View view) {
        Intent objInicio = new Intent(this, ComentariosActivity.class);
        startActivity(objInicio);
    }

    //click para ver los trailers

    public void startAvatar2(View view) {
        Intent objInicio = new Intent(this, AvatarActivity2.class);
        startActivity(objInicio);
    }

    public void startJurasicWorl(View view) {
        Intent objInicio = new Intent(this, JurasicWorl.class);
        startActivity(objInicio);
    }

    public void startCosasAmigos(View view) {
        Intent objInicio = new Intent(this, CAmigosActivity.class);
        startActivity(objInicio);
    }

    public void startLaBestia(View view) {
        Intent objInicio = new Intent(this, BestiaActivity.class);
        startActivity(objInicio);
    }

    public void startDinoKing(View view) {
        Intent objInicio = new Intent(this, DinoActivity.class);
        startActivity(objInicio);
    }

    public void startElvis(View view) {
        Intent objInicio = new Intent(this, ElvisActivity.class);
        startActivity(objInicio);
    }

    public void startAsesinosSinMemoria(View view) {
        Intent objInicio = new Intent(this, AsesinoActivity.class);
        startActivity(objInicio);
    }

    public void startNickJr(View view) {
        Intent objInicio = new Intent(this, NickjrActivity.class);
        startActivity(objInicio);
    }

    public void startThorAmorYTrueno(View view) {
        Intent objInicio = new Intent(this, ThorActivity.class);
        startActivity(objInicio);
    }

    public void startMinions(View view) {
        Intent objInicio = new Intent(this, MinionsActivity.class);
        startActivity(objInicio);
    }
}