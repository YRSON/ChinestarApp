package idat.dami.chinestarapp.ViewComentarios;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.model.Comentario;

public class OnLongClickListenerComentario implements View.OnLongClickListener {
    Context context;
    String id;


    @Override
    public boolean onLongClick(View view) {
        context = view.getContext();
        id = view.getTag().toString();

        final CharSequence[] items = {"Editar", "Eliminar"};

        new AlertDialog.Builder(context)
                .setTitle("Comentarios")
                .setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int item) {
                        if (item == 0) {
                            editRecord(Integer.parseInt(id));
                        } else if (item == 1) {
                            boolean deleteSuccessful = new ComentarioTableController(context).delete(Integer.parseInt(id));

                            if (deleteSuccessful) {
                                Toast.makeText(context, "Comentario eliminado", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(context, "No se pudo eliminar el comentario", Toast.LENGTH_SHORT).show();
                            }

                            ((ComentariosActivity) context).obtenerComentarios();
                            ((ComentariosActivity) context).countRecords();

                        }

                        dialog.dismiss();
                    }
                }).show();

        return false;
    }

    public void editRecord(final int comentarioId) {

        final ComentarioTableController comentarioTableController = new ComentarioTableController(context);
        Comentario comentario = comentarioTableController.readSingleRecord(comentarioId);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View formElementsView = inflater.inflate(R.layout.activity_agregar_comentario, null, false);

        final EditText edUser = formElementsView.findViewById(R.id.edUser);
        final EditText edComent = formElementsView.findViewById(R.id.edComent);
        final EditText edDate = formElementsView.findViewById(R.id.edDate);

        edUser.setText(comentario.getUsuario());
        edComent.setText(comentario.getComentario());
        edDate.setText(comentario.getFecha());

        new AlertDialog.Builder(context)
                .setView(formElementsView)
                .setTitle("Editar Comentario")
                .setPositiveButton("Guardar comentario",
                        new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int id) {
                                Comentario comentario = new Comentario();
                                comentario.setId(comentarioId);
                                comentario.setUsuario(edUser.getText().toString());
                                comentario.setComentario(edComent.getText().toString());
                                comentario.setFecha(edDate.getText().toString());

                                boolean updateSuccessful = comentarioTableController.update(comentario);

                                if (updateSuccessful) {
                                    Toast.makeText(context, "Comentario actualizado", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(context, "No se puede actualizar el comentario", Toast.LENGTH_SHORT).show();
                                }

                                ((ComentariosActivity) context).obtenerComentarios();
                                ((ComentariosActivity) context).countRecords();

                                dialog.cancel();

                            }
                        }).show();


    }
}
