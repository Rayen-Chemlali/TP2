package Ex4.p;

public class PremiumUser implements User {
    private String username;
    private Playlist playlist;

    public PremiumUser(String username) {
        this.username = username;
        playlist=new Playlist(this);
    }

    public void listen(Song song) {
        System.out.println(song.toString());
        song.playSong();
    }

    public void addToPlaylist(Song song) {
        playlist.addSong(song);
        System.out.println("You can add songs as much as you want");
    }
}
