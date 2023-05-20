package idat.dami.chinestarapp.ViewCine;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.model.Cine;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imagen;
        private TextView nombre;
        private TextView direccion;
        private TextView telefono;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagen = (ImageView) itemView.findViewById(R.id.imagen);
            nombre = (TextView) itemView.findViewById(R.id.tvCine);
            direccion = (TextView) itemView.findViewById(R.id.tvDireccion);
            telefono = (TextView) itemView.findViewById(R.id.tvTelefono);
        }
    }

    private List<Cine> listaCines;

    public CustomAdapter(List<Cine> listaCines) {
        this.listaCines = listaCines;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_cardcine, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.ViewHolder holder, int position) {
        String nombreCine = listaCines.get(position).getNombre();

        holder.imagen.setImageResource(listaCines.get(position).getImagen());
        holder.imagen.setContentDescription(nombreCine);
        holder.nombre.setText(nombreCine);
        holder.direccion.setText(listaCines.get(position).getDireccion());
        holder.telefono.setText(listaCines.get(position).getTelefono());

    }

    @Override
    public int getItemCount() {
        return listaCines.size();
    }


}