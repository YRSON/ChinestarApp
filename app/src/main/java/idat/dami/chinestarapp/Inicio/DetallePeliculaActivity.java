package idat.dami.chinestarapp.Inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import idat.dami.chinestarapp.*;

public class DetallePeliculaActivity extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_pelicula);

        getSupportActionBar().hide();
        videoView = (VideoView) findViewById(R.id.VideoDetalle);

        //videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.she_hulk));
        videoView.setVideoURI(Uri.parse("https://youtu.be/R6mIrufS3vI"));


        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);

        videoView.start();
    }


}