package Ex4.p;

public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Song 1", "Artist A", 180);
        Song song2 = new Song("Song 2", "Artist A", 200);

        Album album1 = new Album("Album 1");
        album1.addSong(song1);
        album1.addSong(song2);

        Artist artistA = new Artist("Artist A");
        artistA.addAlbum(album1);

        FreeUser user1 = new FreeUser("User1");
        user1.listen(song1);

        PremiumUser user2 = new PremiumUser("User2");
        user2.addToPlaylist(song1);

        FreeUser user3 = new FreeUser("User3");

        Playlist playlist = new Playlist(user3);
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.shuffleSongs();
    }
}

