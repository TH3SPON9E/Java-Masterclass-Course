package com.nmbrookes;

import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<Album>();
    private static List<Song> playlist = new LinkedList<Song>();

    public static void main(String[] args) {
        Album theLumineers = new Album("The Lumineers", "Lumineers");
        theLumineers.addSong("Cleopatra", 3.21);
        theLumineers.addSong("Ophelia", 2.40);
        theLumineers.addSong("Where the skies are blue", 2.20);
        theLumineers.addSong("Sleep On The Floor", 3.32);
        theLumineers.addSong("Angela", 3.22);
        albums.add(theLumineers);

        Album babel = new Album("Babel", "Mumford & Sons");
        babel.addSong("Babel", 3.28);
        babel.addSong("I Will Wait", 4.37);
        babel.addSong("Lover Of The Light", 5.15);
        babel.addSong("Hopeless Wanderer", 5.08);
        babel.addSong("Lovers' Eyes", 5.21);
        albums.add(babel);

        // Adding song via songName
        albums.get(0).addToPlaylist("Cleopatra", playlist);
        albums.get(0).addToPlaylist("Angela", playlist);
        albums.get(0).addToPlaylist("Cleo", playlist);
        // Adding song via track number
        albums.get(0).addToPlaylist(12, playlist);
        albums.get(1).addToPlaylist(2, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist("I Will Wait",  playlist);

        mediaPlayer(playlist);
    }

    private static void mediaPlayer(List<Song> playlist) {
        ListIterator<Song> playlistIterator = playlist.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        printMenu();

        if(playlist.isEmpty()) {
            System.out.println("No songs in playlist");
            return;
        }
        else {
            System.out.println("Now playing: " + playlistIterator.next().getSong());
        }

        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    System.out.println("Existing player.");
                    quit = true;
                    break;
                case 1:
                    if(goingForward) {
                        if(playlistIterator.hasPrevious()) {
                            playlistIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(playlistIterator.hasPrevious()) {
                        System.out.println("Now playing: " + playlistIterator.previous().getSong());
                    }
                    else {
                        System.out.println("Start of playlist reached");
                        goingForward = true;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(playlistIterator.hasPrevious()) {
                            System.out.println("Now playing: " + playlistIterator.previous().getSong());
                            goingForward = false;
                        }
                        else {
                            System.out.println("Star of playlist reached");
                        }
                    }
                    else {
                        if(playlistIterator.hasNext()) {
                            System.out.println("Now playing: " + playlistIterator.next().getSong());
                            goingForward = true;
                        }
                        else {
                            System.out.println("End of playlist reached");
                        }
                    }
                    break;
                case 3:
                    if(!goingForward) {
                        if(playlistIterator.hasNext()) {
                            playlistIterator.next();
                        }
                        goingForward = true;
                    }
                    if(playlistIterator.hasNext()) {
                        System.out.println("Now playing: " + playlistIterator.next().getSong());
                    }
                    else {
                        System.out.println("End of playlist reached");
                        goingForward = false;
                    }
                    break;
                case 4:
                    printSongInPlaylist(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size() > 0) {
                        playlistIterator.remove();
                        if(playlistIterator.hasNext()) {
                            System.out.println("Now playing: " + playlistIterator.next().getSong());
                        }
                        else if(playlistIterator.hasPrevious()) {
                            System.out.println("Now playing: " + playlistIterator.previous().getSong());
                        }
                    }
                    else {
                        System.out.println("No songs in playlist");
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Actions" +
                "\n0 - Quit" +
                "\n1 - Previous track" +
                "\n2 - Replay track" +
                "\n3 - Next Track" +
                "\n4 - Show song in playlist" +
                "\n5 - Show Menu"  +
                "\n6 - Remove Current Song");
    }

    private static void printSongInPlaylist(List<Song> playlist) {
        System.out.println("=============================");
        for(Song song : playlist) {
            System.out.println(song.getSong());
        }
        System.out.println("=============================");
    }
}