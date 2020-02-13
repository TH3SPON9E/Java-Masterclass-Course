package com.nmbrookes;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private String artist;
    private ArrayList<Song> songList;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songList = new ArrayList<Song>();
    }

    public boolean addSong(String songName, double songDuration) {
        if(findSong(songName) == null) {
            this.songList.add(new Song(songName, songDuration));
            return true;
        }
        System.out.println("Song " + songName + " already exists.");
        return false;
    }

    public boolean removeSong(String songName) {
        if(findSong(songName) != null) {
            Song song = findSong(songName);
            this.songList.remove(song);
            return true;
        }
        System.out.println("Song: " + songName + " does not exist.");
        return false;
    }

    private Song findSong(String songName) {
        for(Song song: this.songList) {
            if(song.getSongName().equals(songName)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlaylist(String songName, LinkedList<Song> playlist) {
        Song song = findSong(songName);
        if(song != null) {
            playlist.add(song);
            return true;
        }
        System.out.println("This song " + songName + " does not exist in this album");
        return false;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if((index >= 0) && (index <= this.songList.size())) {
            playlist.add(this.songList.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtist() {
        return artist;
    }
}
