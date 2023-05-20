package idat.dami.chinestarapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

import idat.dami.chinestarapp.Inicio.CarteleraActivity;
import idat.dami.chinestarapp.ViewCine.CinesActivity;


public class LoginActivity extends AppCompatActivity {
    TextInputLayout usuario;
    TextInputLayout password;
    Button btnIngresar;
    ImageView btnInstagram;
    ImageView btnTwitter;
    ImageView btnFacebook;
    String urlInstagram;
    String urlTwitter;
    String urlFacebook;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        usuario = findViewById(R.id.edUsuario);
        password = findViewById(R.id.edPassword);
        btnIngresar = findViewById(R.id.btnIngresar);
        btnInstagram = findViewById(R.id.btnInstagram);
        btnTwitter = findViewById(R.id.btnTwitter);
        btnFacebook = findViewById(R.id.btnFacebook);

        urlInstagram = "https://www.instagram.com/cinemarkperu/?hl=en";
        urlTwitter = "https://twitter.com/cinemark_peru?lang=en";
        urlFacebook = "https://www.facebook.com/cinemarkperu/";

        btnInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(urlInstagram);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(urlTwitter);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(urlFacebook);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }

    //método para enlazar a otros activity
    public void irAInicio(View view) {
        Intent objInicio = new Intent(this, CinesActivity.class);
        startActivity(objInicio);
    }

    public void validarAcceso(View view) {
        String vUsuario = usuario.getEditText().getText().toString();
        String vPassword = password.getEditText().getText().toString();

        if (vUsuario.isEmpty() && vPassword.isEmpty()) {
            Toast.makeText(this, "Ingrese usuario y password", Toast.LENGTH_LONG).show();
        } else if (vUsuario.isEmpty()) {
            Toast.makeText(this, "Ingrese usuario", Toast.LENGTH_LONG).show();
        } else if (vPassword.isEmpty()) {
            Toast.makeText(this, "Ingrese password", Toast.LENGTH_LONG).show();
        } else if (vUsuario.equals("admin") && vPassword.equals("admin")) {
            Toast.makeText(this, "Credenciales válidas", Toast.LENGTH_LONG).show();
            Intent objInicio = new Intent(this, CarteleraActivity.class);
            startActivity(objInicio);

        } else {
            Toast.makeText(this, "Acceso denegado", Toast.LENGTH_LONG).show();
        }
    }


}