package idat.dami.chinestarapp.ViewComentarios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import idat.dami.chinestarapp.R;


public class AgregarComentarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_comentario);
    }

    //se llama a su vista XML desde el AlertDialog en ComentariosActivity
}