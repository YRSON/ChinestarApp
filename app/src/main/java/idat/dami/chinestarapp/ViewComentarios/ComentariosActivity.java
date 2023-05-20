package idat.dami.chinestarapp.ViewComentarios;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.DrawableContainer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.model.Comentario;

public class ComentariosActivity extends AppCompatActivity {

    private RecyclerView recyclerViewComentario;
    private CustomAdapterComentarios adaptadorComentarios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comentarios);
        getSupportActionBar().hide();

        recyclerViewComentario = findViewById(R.id.recyclerVComentarios);
        recyclerViewComentario.setLayoutManager(new LinearLayoutManager(this));

        adaptadorComentarios = new CustomAdapterComentarios(obtenerComentarios());
        recyclerViewComentario.setAdapter(adaptadorComentarios);

        //implementacion video clase
        TextView btnAgregarComentario = findViewById(R.id.btnAgregarComentario);
        btnAgregarComentario.setOnClickListener(new OnClickListenerCrearComentario());

        //readRecords();
        obtenerComentarios();
        countRecords();
    }

    public List<Comentario> obtenerComentarios() {
        ArrayList<Comentario> coments = new ArrayList<>();
        /*
        coments.add(new Comentario(1, "Raúl Cuenca", "No me gusta la solución que fuerza el número de líneas en la vista de texto. Le sugiero que lo solucione a través de la solución propuesta aquí . Como veo el OP también está luchando con hacer que la vista de texto se vea como adecuada en la tabla y shrinkColumns es la directiva correcta para pasar a lograr lo que se desea.", "2022 - 08 - 12"));
        coments.add(new Comentario(2, "Sandra Carpio", "Traté de comentar una de las respuestas anteriores, pero no tengo suficiente reputación.\n" +
                "Sólo pensé en añadir que si utiliza:\n" +
                "\n" +
                "android:inputType=\"textMultiLine\"\n" +
                "\n" +
                "A continuación, la vista deja de ser clicable. Yo estaba tratando de obtener múltiples líneas de texto en mi menú de diapositivas de cajón que obviamente tiene que responder a los clics.\n" +
                "\n" +
                "El android:singleLine=\"false\" funcionó bien aunque.", "2022-08-12"));
        coments.add(new Comentario(3, "Yerson Sifuentes", "No me gustan las respuestas. Simplemente establezca el tipo de entrada y TextView se adaptará a su contenido", "2022-08-12"));

         */
        List<Comentario> listComentarios = new ComentarioTableController(this).read();

        if (listComentarios.size() > 0) {
            for (Comentario obj : listComentarios) {
                int id = obj.getId();
                String user = obj.getUsuario();
                String coment = obj.getComentario();
                String fecha = obj.getFecha();
                coments.add(new Comentario(id, user, coment, fecha));
            }
        }

        return coments;
    }

    public void readRecords() {
        /*
        LinearLayout linearLayoutRecords = findViewById(R.id.linearLayoutRecords);
        linearLayoutRecords.removeAllViews();


         */
        List<Comentario> listComentarios = new ComentarioTableController(this).read();

        if (listComentarios.size() > 0) {
            for (Comentario obj : listComentarios) {
                int id = obj.getId();
                String user = obj.getUsuario();
                String coment = obj.getComentario();
                String fecha = obj.getFecha();

                /*
                String textViewContentAutoryComent = "\t" + user + "\n\n\t\t" + coment;
                String textViewContentFecha = "fecha comentario: " + fecha;

                LinearLayout contenedorInternoComentarios = new LinearLayout(this);


                TextView tvComentarioItem = new TextView(this);
                tvComentarioItem.setPadding(15, 10, 15, 10);

                tvComentarioItem.setText(textViewContentAutoryComent);

                TextView tvFechaComentario = new TextView(this);
                tvFechaComentario.setPadding(15, 10, 15, 10);

                tvFechaComentario.setText(textViewContentFecha);

                tvComentarioItem.setTag(Integer.toString(id));

                tvComentarioItem.setOnLongClickListener(new OnLongClickListenerComentario());

                contenedorInternoComentarios.addView(tvComentarioItem);
                contenedorInternoComentarios.addView(tvFechaComentario);
                contenedorInternoComentarios.setBackgroundResource(R.drawable.bordes_cardview);

                linearLayoutRecords.addView(contenedorInternoComentarios);
                //linearLayoutRecords.addView(tvComentarioItem);


                 */
            }
        } else {
            TextView locationItem = new TextView(this);
            locationItem.setPadding(8, 8, 8, 8);
            locationItem.setText("No hay registros");

            //linearLayoutRecords.addView(locationItem);
        }

    }

    public void countRecords() {
        int recordCount = new ComentarioTableController(this).count();
        TextView textViewRecordCount = (TextView) findViewById(R.id.tvCantidadComentarios);
        textViewRecordCount.setText(recordCount + "registros");
    }


}