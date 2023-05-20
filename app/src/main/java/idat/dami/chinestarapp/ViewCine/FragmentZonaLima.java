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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentZonaLima#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentZonaLima extends Fragment {

    RecyclerView recyclerVCinesLima;
    ArrayList<Cine> listaCines;

    public FragmentZonaLima() {
        // Required empty public constructor
    }

    public static FragmentZonaLima newInstance(String param1, String param2) {
        FragmentZonaLima fragment = new FragmentZonaLima();
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
        View vista = inflater.inflate(R.layout.fragment_zona_lima, container, false);

        listaCines = new ArrayList<>();
        recyclerVCinesLima = vista.findViewById(R.id.recyclerVLima);
        recyclerVCinesLima.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarCines();

        CustomAdapter adapter = new CustomAdapter(listaCines);
        recyclerVCinesLima.setAdapter(adapter);

        return vista;
    }

    public void llenarCines(){
        listaCines.add(new Cine("Cine Angamos", "Av. Angamos 232 int 24, Kun Aguero", "(01) 763 8972", R.drawable.c_1));
        listaCines.add(new Cine("Cine Aviación", "Av Aviación 2293", "(01) 433 9874", R.drawable.c_2));
        listaCines.add(new Cine("Cine Guardia Civil", "Av. Guardia Civil 1123 CC. Real Plaza", "(01) 897 6633", R.drawable.c_3));
        listaCines.add(new Cine("Cine Jirón de la Unión", "Jiron la Unión 3233-3308", "(01) 123 7884", R.drawable.cc_4));
        listaCines.add(new Cine("Cine Brasil", "Av. Brasil 1938 CC. La Rambla", "(01) 893 7347", R.drawable.c_5));
        listaCines.add(new Cine("Cine San Juan", "Av. Los Heroes 232-244", "(01) 893 6112", R.drawable.c_6));
        listaCines.add(new Cine("Cine Lurin", "Av. 200 Millas Extens. Antigua PanSur", "(01) 234 8999", R.drawable.c_7));
        listaCines.add(new Cine("Cine Magdalena", "Av. La Paz 1234 Esq. Las Heraldos", "(01) 897 6664", R.drawable.c_8));
        listaCines.add(new Cine("Cine San Miguel", "Av. La Marina 2312 CC.San Miguel", "(01) 787 9921", R.drawable.c_9));
        listaCines.add(new Cine("Cine Mall del Sur", "PanSur km 12 - Av.Lisos 123", "(01) 111 0948", R.drawable.c_10));

    }



}