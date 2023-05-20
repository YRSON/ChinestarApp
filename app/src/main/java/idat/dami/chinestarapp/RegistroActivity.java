/*
package idat.dami.chinestarapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import BD.BaseDatos;
import idat.dami.chinestarapp.Inicio.CarteleraActivity;
import io.realm.gradle.Realm;
import modelo.Usuario;


public class RegistroActivity extends AppCompatActivity {

    private TextView correo;
    private TextView password;
    private TextView mensaje;

    private Realm con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_registro);

        correo = findViewById(R.id.edEmailRegistro);
        password = findViewById(R.id.edPasswordRegistro);
//        mensaje = findViewById(R.id.);

        con = BaseDatos.getInstance().conectar(getBaseContext());
        */
/*long cuantos = con.where(Usuario.class).count();
        if (cuantos == 0) { }*//*


        Button registro = findViewById(R.id.btnRegistro);
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarRegistro();
            }
        });

    }

//    @Override
    public void mostrarRegistro() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Registro");
        builder.setMessage("Crear una cuenta");

        View v = LayoutInflater.from(this).inflate(R.layout.activity_registro, null);
        builder.setView(v);

        builder.setPositiveButton("Registrar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    Usuario u = new Usuario();
                    u.setId("1");
                    TextView correo = v.findViewById(R.id.edEmailRegistro);
                    u.setCorreo(correo.getText() + "");
                    TextView password = v.findViewById((R.id.edPasswordRegistro));
                    u.setPassword(password.getText() + "");

                    con.beginTransaction();
                    con.copyToRealmOrUpdate(u);
                    con.commitTransaction();

                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getBaseContext(), "No se pudo registrar" + e.getMessage(), Toast.LENGTH_LONG).show();
                    mensaje.setText("Error:" + e.getMessage());
                }
            }
        });

        builder.create().show();
    }

    //método para enlazar a otros activity
    public void irAInicio(View view) {
        Intent objInicio = new Intent(this, CarteleraActivity.class);
        startActivity(objInicio);
    }


}*/
