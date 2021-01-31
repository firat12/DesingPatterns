package com.firatcapin.desingpatterns.structural.bridge;

public class Bilgisayar {
    private Spotify spotify;
    private Hoparlor hoparlor;

    public Bilgisayar() {
        this.spotify = new Spotify();
        this.hoparlor = new Hoparlor();
    }

}
