package idat.dami.chinestarapp.ViewPromociones;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import idat.dami.chinestarapp.R;


public class FragmentPromoEntradas extends Fragment {

    public FragmentPromoEntradas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_promo_entradas, container, false);
    }
}