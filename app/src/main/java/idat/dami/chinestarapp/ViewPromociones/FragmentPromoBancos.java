package idat.dami.chinestarapp.ViewPromociones;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import idat.dami.chinestarapp.R;


public class FragmentPromoBancos extends Fragment {

    public FragmentPromoBancos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_promo_bancos, container, false);
    }
}