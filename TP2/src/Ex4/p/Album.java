package Ex4.p;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String title;
    private List<Song> songs;

    public Album(String title) {
        this.title = title;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public void listAllSongs() {
        System.out.println("Album " + title + " :");
        for (Song song : songs) {
            System.out.println(song.toString());
        }
    }

    public String getTitle() {
        return title;
    }
    public String toString()
    {
        String a="Title: "+title+"\nContent: ";
        for (Song song : songs) {
            a+=song.toString()+"|| ";
        }
        return a;
    }
}
