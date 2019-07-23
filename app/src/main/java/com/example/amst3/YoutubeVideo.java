package com.example.amst3;

//En crea la clase YoutubeVideo la cual tiene como atributo un String que es la
//dirección (URL) de nuestro video de youtube
//nos permitirá usar los metods get y set de este atributo, luego en la clase
//VideoAdapter.

public class YoutubeVideo {
    String videoUrl;

    public YoutubeVideo() {
    }

    public YoutubeVideo(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
