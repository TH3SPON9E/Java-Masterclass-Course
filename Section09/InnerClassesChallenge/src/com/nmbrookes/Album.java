package com.nmbrookes;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private String artist;
    private SongList songs;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String songName, double songDuration) {
        return this.songs.addSong(new Song(songName, songDuration));
    }

    public boolean removeSong(String songName) {
        return this.songs.removeSong(songName);
    }

    public boolean addToPlaylist(String songName, LinkedList<Song> playlist) {
        Song song = this.songs.findSong(songName);
        if(song != null) {
            playlist.add(song);
            return true;
        }
        System.out.println("This song " + songName + " does not exist in this album");
        return false;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        Song song = this.songs.findSong(trackNumber);
        if(songs != null) {
            playlist.add(song);
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

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            songs = new ArrayList<Song>();
        }

        public boolean addSong(Song song) {
            if(songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        public boolean removeSong(String songName) {
            if(findSong(songName) != null) {
                Song song = findSong(songName);
                this.songs.remove(song);
                return true;
            }
            System.out.println("Song: " + songName + " does not exist.");
            return false;
        }

        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if(index >= 0 && index < songs.size()) {
                return songs.get(index);
            }
            return null;
        }

        private Song findSong(String songName) {
            for(Song song: this.songs) {
                if(song.getSongName().equals(songName)) {
                    return song;
                }
            }
            return null;
        }
    }
}
