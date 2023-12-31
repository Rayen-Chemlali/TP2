package Ex4.p;

public class Song {
    private String title;
    private String artist;
    private int length; // in seconds

    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    public void playSong() {
        System.out.println( title + " is playing");
    }

    public int getSongLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
    public String toString()
    {
        String s="Title: "+this.getTitle()+", Artist: "+this.getArtist()+", "+this.length;
        return s;
    }
}
