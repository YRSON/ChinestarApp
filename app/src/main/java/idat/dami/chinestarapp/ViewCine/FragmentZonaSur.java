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


public class FragmentZonaSur extends Fragment {
    RecyclerView recyclerVCinesArequipa;
    ArrayList<Cine> listaCines;

    public FragmentZonaSur() {
        // Required empty public constructor
    }

    public static FragmentZonaSur newInstance(String param1, String param2) {
        FragmentZonaSur fragment = new FragmentZonaSur();
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
        View vista = inflater.inflate(R.layout.fragment_zona_sur, container, false);

        listaCines = new ArrayList<>();
        recyclerVCinesArequipa = vista.findViewById(R.id.recyclerVArequipa);
        recyclerVCinesArequipa.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarCines();

        CustomAdapter adapter = new CustomAdapter(listaCines);
        recyclerVCinesArequipa.setAdapter(adapter);

        return vista;
    }

    public void llenarCines(){
        listaCines.add(new Cine("Cine Plaza Blanca", "Av. Angamos 232 int 24, Kun Aguero", "(01) 763 8972", R.drawable.c_1));
        listaCines.add(new Cine("Cine Mall MistiPlaza", "Av Aviación 2293", "(01) 433 9874", R.drawable.c_2));
        listaCines.add(new Cine("Cine San Vicente Star", "Av. Guardia Civil 1123 CC. Real Plaza", "(01) 897 6633", R.drawable.c_3));
        listaCines.add(new Cine("Cine Cusco Star", "Jiron la Unión 3233-3308", "(01) 123 7884", R.drawable.cc_4));
        listaCines.add(new Cine("Cine San Vicente Star", "Av. Guardia Civil 1123 CC. Real Plaza", "(01) 897 6633", R.drawable.c_3));
        listaCines.add(new Cine("Cine Arequipa Star", "Jiron la Unión 3233-3308", "(01) 123 7884", R.drawable.cc_4));
        listaCines.add(new Cine("Cine Ica Star", "Av. Guardia Civil 1123 CC. Real Plaza", "(01) 897 6633", R.drawable.c_3));
        listaCines.add(new Cine("Cine Cañete Star", "Jiron la Unión 3233-3308", "(01) 123 7884", R.drawable.cc_4));

    }

}