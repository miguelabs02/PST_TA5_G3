package com.example.amst3;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import java.util.List;
//Esta Clase sirve de adaptador de vista, para poder presentar el video de Youtube
//Se añaden a los activitys como cualquier otro elemento
//En esta clase se definen objetos view, que serán los que presenten en el activity principal
//de esta sección.
public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {
    List<YoutubeVideo> youtubeVideoList;

    public VideoAdapter() {
    }

    public VideoAdapter(List<YoutubeVideo> youtubeVideoList) {
        this.youtubeVideoList = youtubeVideoList;
    }

    @Override
    public VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext()).inflate(R.layout.video_view, parent, false);
        return new VideoViewHolder(view);
    }

    @Override//Crea un  WebView para cada elemento de la lista de YoutubeVideoList
    public void onBindViewHolder(VideoViewHolder holder, int position) {
        holder.videoWeb.loadData( youtubeVideoList.get(position).getVideoUrl(), "text/html" , "utf-8" );
    }

    @Override//Obtiene el tamaño de la lista de videos de youtube
    public int getItemCount() {
        return youtubeVideoList.size();
    }

    //Se crea el widget de WebView el cual nos permite presentar una pagina de internet, a traves de la
    //URL, respetando y agregando los permisos del uso de internet ya antes descritos en el manifest,
    // en nuestro caso será de la plataforma de youtube.
    public class VideoViewHolder extends RecyclerView.ViewHolder{
        WebView videoWeb;
        public VideoViewHolder(View itemView) {
            super(itemView);

            videoWeb = (WebView) itemView.findViewById(R.id.videoWebView);

            videoWeb.getSettings().setJavaScriptEnabled(true);
            videoWeb.setWebChromeClient(new WebChromeClient() {

            } );
        }
    }
}
