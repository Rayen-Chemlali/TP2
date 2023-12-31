package Ex4.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist {
    private User user;
    private List<Song> songs;

    // Constructor
    public Playlist(User user) {
        this.user = user;
        this.songs = new ArrayList<>();
    }
    public void addSong(Song song) {
        songs.add(song);
        System.out.println(song.getTitle() + " added to  the playlist");
    }

    public void removeSong(Song song) {
        songs.remove(song);
        System.out.println(song.getTitle()+"removed from the playlist");
    }

    public void shuffleSongs() {
        Collections.shuffle(songs);
        System.out.println("Playlist shuffled");
    }
}
