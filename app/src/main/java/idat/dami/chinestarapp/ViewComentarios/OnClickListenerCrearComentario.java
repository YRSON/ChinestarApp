package idat.dami.chinestarapp.ViewComentarios;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.model.Comentario;

public class OnClickListenerCrearComentario implements View.OnClickListener {
    Context context;


    @Override
    public void onClick(View view) {
        context = view.getContext();

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View formElementsView = inflater.inflate(R.layout.activity_agregar_comentario, null, false);

        final EditText edUser = formElementsView.findViewById(R.id.edUser);
        final EditText edComent = formElementsView.findViewById(R.id.edComent);
        final EditText edDate = formElementsView.findViewById(R.id.edDate);

        new AlertDialog.Builder(context)
                .setView(formElementsView)
                .setTitle("Crear Comentario")
                .setPositiveButton("Agregar",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                String user = edUser.getText().toString();
                                String coment = edComent.getText().toString();
                                //grabar la fecha actual en el comentario
                                String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

                                Comentario comentario = new Comentario();
                                comentario.setUsuario(user);
                                comentario.setComentario(coment);
                                comentario.setFecha(date);

                                boolean createSuccessful = new ComentarioTableController(context).create(comentario);

                                if (createSuccessful) {
                                    Toast.makeText(context, "Comentario agregado", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(context, "No se pudo agregar el comentario", Toast.LENGTH_SHORT).show();
                                }

                                ((ComentariosActivity) context).obtenerComentarios();
                                ((ComentariosActivity) context).countRecords();

                                dialog.cancel();
                            }
                        }).show();
    }


}
