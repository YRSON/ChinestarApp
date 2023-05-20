package idat.dami.chinestarapp.ViewConfiteria;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.model.Confiteria;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentDulces#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentDulces extends Fragment {
    
    RecyclerView recyclerVConfiteria;
    ArrayList<Confiteria> listaConfiteria;

    public FragmentDulces() {
        // Required empty public constructor
    }


    public static FragmentDulces newInstance(String param1, String param2) {
        FragmentDulces fragment = new FragmentDulces();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_bebidas, container, false);

        listaConfiteria = new ArrayList<>();
        recyclerVConfiteria = vista.findViewById(R.id.ConfiteriaRecycler);
        recyclerVConfiteria.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarConfiteria();

        CustomAdapter2 adapter = new CustomAdapter2(listaConfiteria);
        recyclerVConfiteria.setAdapter(adapter);
        // Inflate the layout for this fragment
        return vista;
    }

    public void llenarConfiteria() {
        listaConfiteria.add(new Confiteria("Pack Caramelos", "Caramelos de colores ", "2.90", R.drawable.dulces1));
        listaConfiteria.add(new Confiteria("Pack Caramelos 1", "Bolsa de Dulces de Diferentes Sabores", "3.90", R.drawable.dulces2));
        listaConfiteria.add(new Confiteria("Pack Caramelos 2", "Descripcion combo --------", "2.90", R.drawable.dulces3));
        listaConfiteria.add(new Confiteria("Pack Caramelos 3", "Descripcion combo --------", "3.90", R.drawable.dulces4));
        listaConfiteria.add(new Confiteria("Pack Caramelos 4", "Descripcion combo --------", "2.90", R.drawable.dulces5));
        listaConfiteria.add(new Confiteria("Pack Caramelos 5", "Descripcion combo --------", "2.90", R.drawable.dulces6));
        listaConfiteria.add(new Confiteria("Pack Caramelos 6", "Descripcion combo --------", "4.90", R.drawable.dulces7));
        listaConfiteria.add(new Confiteria("Pack Caramelos 7", "Descripcion combo --------", "4.90", R.drawable.dulces8));
        listaConfiteria.add(new Confiteria("Pack Caramelos 8", "Descripcion combo --------", "3.90", R.drawable.dulces9));
        listaConfiteria.add(new Confiteria("Pack Caramelos 9", "Descripcion combo --------", "3.90", R.drawable.dulces10));

    }
}