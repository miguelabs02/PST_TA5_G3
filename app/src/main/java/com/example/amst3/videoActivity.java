package com.example.amst3;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.VideoView;

import java.util.Vector;

//Se define el videoActivity, el cual será activado luego de que en el MainActivity
//se de click sobre el boton de Video.

public class videoActivity extends AppCompatActivity {
    //Se RecyclerView es el widget que se presenta el el diseño de este activity y muestra el video
    //Y  el vector que tendrá los videos agregados para visualizar desde Youtube.
    private RecyclerView recyclerView;
    private Vector<YoutubeVideo> youtubeVideos = new Vector<YoutubeVideo>();

    //en el metodo onCreate de este Activity se definen los atributos del widget recyclerView y
    // se agrega un video a la lista de videos de youtube
    //luego con la clase VideoAdapter muestra este elemento agregado y lo establece el widget
    // principal que es el que presentará en el videoActivity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ag8i7Cw-ehE\" frameborder=\"0\" allowfullscreen></iframe>") );
        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);
        recyclerView.setAdapter(videoAdapter);
    }
    
}
