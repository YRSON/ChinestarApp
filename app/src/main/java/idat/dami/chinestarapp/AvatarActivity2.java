package idat.dami.chinestarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import idat.dami.chinestarapp.Inicio.CarteleraActivity;
import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.ViewCine.CinesActivity;

public class AvatarActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar2);
        getSupportActionBar().hide();
    }

    public void retrocederCartelera(View view) {
        Intent objInicio = new Intent(this, CarteleraActivity.class);
        startActivity(objInicio);
    }
}