package Ex4.p;

public class FreeUser implements User {
    private String username;
    //private List<Song> playlist;
    private Playlist playlist;

    private final int max=3;
    private int numberOfSongs=0;

    public FreeUser(String username) {
        this.username = username;
        playlist=new Playlist(this);
    }

    public void listen(Song song) {
        song.playSong();
    }


    public void addToPlaylist(Song song) {
        if (numberOfSongs <= max)
        {
            playlist.addSong(song);
            numberOfSongs++;
        }
        else
        {
            System.out.println("You have reached the max of songs ");
        }
    }
}

