package Ex4.p;

import java.util.ArrayList;
import java.util.List;

public class Artist {
    private String name;
    private List<Album> albums;

    public Artist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public void deleteAlbum(Album album) {
        albums.remove(album);
    }

    public void listAllAlbums() {
        System.out.println("Albums by artist '" + name + "':");
        for (Album album : albums) {
            System.out.println(album.toString());
        }
    }
}

