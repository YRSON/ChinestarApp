package idat.dami.chinestarapp.ViewCine;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.model.Cine;

public class FragmentZonaCentro extends Fragment {

    RecyclerView recyclerVZonaCentro;
    ArrayList<Cine> listaCines;

    public FragmentZonaCentro() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static FragmentZonaCentro newInstance(String param1, String param2) {
        FragmentZonaCentro fragment = new FragmentZonaCentro();
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
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_zona_centro, container, false);

        listaCines = new ArrayList<>();
        recyclerVZonaCentro = vista.findViewById(R.id.recyclerVZonaCentro);
        recyclerVZonaCentro.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarCines();

        CustomAdapter adapter = new CustomAdapter(listaCines);
        recyclerVZonaCentro.setAdapter(adapter);

        return vista;
    }

    public void llenarCines(){
        listaCines.add(new Cine("Cine Ayacucho Star", "Av. Angamos 232 int 24, Kun Aguero", "(01) 763 8972", R.drawable.c_1));
        listaCines.add(new Cine("Cine Huanuco Star", "Av Aviación 2293", "(01) 433 9874", R.drawable.c_2));
        listaCines.add(new Cine("Cine Mall Huancayo", "Av. Guardia Civil 1123 CC. Real Plaza", "(01) 897 6633", R.drawable.c_3));
        listaCines.add(new Cine("Cine Open Maravilla", "Jiron la Unión 3233-3308", "(01) 123 7884", R.drawable.cc_4));
        listaCines.add(new Cine("Cine Mall Pucallpa ", "Av Aviación 2293", "(01) 433 9874", R.drawable.c_5));
        listaCines.add(new Cine("Cine Mall TingoMaria", "Av. Guardia Civil 1123 CC. Real Plaza", "(01) 897 6633", R.drawable.c_6));
        listaCines.add(new Cine("Cine Plaza Casma", "Jiron la Unión 3233-3308", "(01) 123 7884", R.drawable.c_7));
        listaCines.add(new Cine("Cine Mall Huaral", "Av Aviación 2293", "(01) 433 9874", R.drawable.c_8));
        listaCines.add(new Cine("Cine Mall Piura", "Av. Guardia Civil 1123 CC. Real Plaza", "(01) 897 6633", R.drawable.c_9));
        listaCines.add(new Cine("Cine Plaza Chiclayo", "Jiron la Unión 3233-3308", "(01) 123 7884", R.drawable.c_10));

    }
}