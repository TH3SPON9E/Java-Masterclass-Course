package com.nmbrookes;

public class Song {
    private String songName;
    private double songDuration;

    public Song(String songName, double songDuration) {
        this.songName =songName;
        this.songDuration = songDuration;
    }

    public String getSongName() {
        return songName;
    }

    public String getSong() {
        return songName + ": " + songDuration;
    }

}
