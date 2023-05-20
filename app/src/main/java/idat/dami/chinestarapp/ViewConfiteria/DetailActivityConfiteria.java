package idat.dami.chinestarapp.ViewConfiteria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import idat.dami.chinestarapp.R;

public class DetailActivityConfiteria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_confiteria);

        Bundle bundle = getIntent().getExtras();
        String confiteria = bundle.getString("Confiteria");

        TextView txConfiteria = findViewById(R.id.txConfiteria);
        txConfiteria.setText(confiteria);


    }
}