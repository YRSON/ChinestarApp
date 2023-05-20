package idat.dami.chinestarapp.ViewComentarios;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.model.Comentario;

public class CustomAdapterComentarios extends RecyclerView.Adapter<CustomAdapterComentarios.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvAutorComents;
        private TextView tvComents;
        private TextView tvFechaComents;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvAutorComents = (TextView) itemView.findViewById(R.id.tvAutorComentario);
            tvComents = (TextView) itemView.findViewById(R.id.tvComentario);
            tvFechaComents = (TextView) itemView.findViewById(R.id.tvFechaComentario);
        }
    }

    private List<Comentario> listaComentarios;

    public CustomAdapterComentarios(List<Comentario> listaComentarios) {
        this.listaComentarios=listaComentarios;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_comentarios_cardview, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapterComentarios.ViewHolder holder, int position) {
        String comentarios = listaComentarios.get(position).getComentario();

        holder.tvComents.setText(comentarios);
        holder.tvAutorComents.setText(listaComentarios.get(position).getUsuario());
        holder.tvFechaComents.setText(listaComentarios.get(position).getFecha());
    }

    @Override
    public int getItemCount() {
        return listaComentarios.size();
    }


}
