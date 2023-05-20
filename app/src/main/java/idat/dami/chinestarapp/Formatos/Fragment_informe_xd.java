package idat.dami.chinestarapp.Formatos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import idat.dami.chinestarapp.R;

public class Fragment_informe_xd extends Fragment {

    public Fragment_informe_xd(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_informexd, container, false);
    }
}