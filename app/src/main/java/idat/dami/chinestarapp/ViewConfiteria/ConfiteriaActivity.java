package idat.dami.chinestarapp.ViewConfiteria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;
import idat.dami.chinestarapp.Formatos.FormatosActivity;
import idat.dami.chinestarapp.Inicio.CarteleraActivity;
import idat.dami.chinestarapp.ViewPromociones.PromoActivity;
import idat.dami.chinestarapp.R;
import idat.dami.chinestarapp.ViewCine.CinesActivity;
import idat.dami.chinestarapp.model.Confiteria;

public class ConfiteriaActivity extends AppCompatActivity {

    FragmentBebidas bebidasFragment = new FragmentBebidas();
    FragmentDulces dulcesFragment = new FragmentDulces();
    FragmentCanchitas canchitasFragment = new FragmentCanchitas();

    private RecyclerView recyclerViewConfiteria;
    private CustomAdapter2 adaptadorConfiteria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confiteria);
        getSupportActionBar().hide();

        BottomNavigationView navigation = findViewById(R.id.bnvMenu);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        loadFragment(dulcesFragment);
    }

    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            int idMenu = item.getItemId();
            switch (idMenu){
                case R.id.bebidasId:
                    loadFragment(bebidasFragment);
                    return true;

                case R.id.canchitaId:
                    loadFragment(canchitasFragment);
                    return true;

                case R.id.dulcesId:
                    loadFragment(dulcesFragment);
                    return true;

            }
            return false;
        }
    };
    public void loadFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentConfiteria,fragment);
        transaction.commit();
    }

    //método para enlazar a otros activity
    public void irAInicio(View view) {
        Intent objInicio = new Intent(this, CarteleraActivity.class);
        startActivity(objInicio);
    }

    public void irFormatos(View view) {
        Intent objInicio = new Intent(this, FormatosActivity.class);
        startActivity(objInicio);
    }

    public void irAPromociones(View view) {
        Intent objInicio = new Intent(this, PromoActivity.class);
        startActivity(objInicio);
    }
    public void irACines(View view) {
        Intent objInicio = new Intent(this, CinesActivity.class);
        startActivity(objInicio);
    }


}