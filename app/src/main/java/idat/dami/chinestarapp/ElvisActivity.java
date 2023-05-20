package idat.dami.chinestarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import idat.dami.chinestarapp.Inicio.CarteleraActivity;

public class ElvisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elvis);
        getSupportActionBar().hide();
    }

    public void retrocederCartelera(View view) {
        Intent objInicio = new Intent(this, CarteleraActivity.class);
        startActivity(objInicio);
    }
}