package idat.dami.chinestarapp.ViewConfiteria;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.model.Confiteria;

public class CustomAdapter2 extends RecyclerView.Adapter<CustomAdapter2.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imagen;
        private TextView nombre;
        private TextView descripcion;
        private TextView precio;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagen = (ImageView) itemView.findViewById(R.id.imagenConfiteria);
            nombre = (TextView) itemView.findViewById(R.id.tvConfiteria);
            descripcion = (TextView) itemView.findViewById(R.id.tvDescripcionConfiteria);
            precio = (TextView) itemView.findViewById(R.id.tvPrecioConfiteria);
        }
    }

    private List<Confiteria> listaConfiteria;

    public CustomAdapter2(List<Confiteria> listaConfiteria) {
        this.listaConfiteria = listaConfiteria;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_cardconfiteria, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter2.ViewHolder holder, int position) {
        String nombreConfiteria = listaConfiteria.get(position).getNombre();

        holder.imagen.setImageResource(listaConfiteria.get(position).getImagen());
        holder.imagen.setContentDescription(nombreConfiteria);
        holder.nombre.setText(nombreConfiteria);
        holder.descripcion.setText(listaConfiteria.get(position).getDescripcion());
        holder.precio.setText(listaConfiteria.get(position).getPrecio());
    }

    @Override
    public int getItemCount() {
        return listaConfiteria.size();
    }


}