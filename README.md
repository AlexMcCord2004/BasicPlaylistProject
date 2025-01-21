# BasicPlaylistProject
class Song {
    private String title;
    private String artist;
    private int year;
    private final int duration;

    public Song(String title, String artist, int year, int duration) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }

    public void play() {
        System.out.println("Playing: " + this.title + " by " + this.artist);
    }
}
public class Playlist {
    public Playlist() {
    }

    public static int runningTime(List<Song> playlist) {
        int totalDuration = 0;

        Song song;
        for(Iterator var2 = playlist.iterator(); var2.hasNext(); totalDuration += song.getDuration()) {
            song = (Song)var2.next();
        }

        return totalDuration;
    }

    public static void main(String[] args) {
        List<Song> playlist = new ArrayList();
        playlist.add(new Song("The Weight", "The Band", 1968, 274));
        playlist.add(new Song("Stairway to Heaven", "Led Zeppelin", 1971, 482));
        playlist.add(new Song("Hotel California", "The Eagles", 1977, 390));
        playlist.add(new Song("With or Without You", "U2", 1987, 296));
        Iterator var2 = playlist.iterator();

        while(var2.hasNext()) {
            Song song = (Song)var2.next();
            song.play();
        }

        System.out.print("Total running time: ");
        System.out.print(runningTime(playlist));
        System.out.println(" seconds.");
    }
}
