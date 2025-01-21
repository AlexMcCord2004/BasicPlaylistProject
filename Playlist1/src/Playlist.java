import java.util.ArrayList;
import java.util.List;

/** Represents a song with title, artist, release year, and duration. */
class Song {
    private String title;
    private String artist;
    private int year;
    private final int duration; // Duration in seconds

    public Song(String title, String artist, int year, int duration) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void play() {
        System.out.println("Playing: " + title + " by " + artist);
    }
}

/** Plays a list of songs. */
public class Playlist {

    /** Calculates the total running time of a given list of songs. */
    public static int runningTime(List<Song> playlist) {
        int totalDuration = 0;
        for (Song song : playlist) {
            totalDuration += song.getDuration();
        }
        return totalDuration;
    }

    /** Drives execution. */
    public static void main(String[] args) {
        List<Song> playlist = new ArrayList<>();

        playlist.add(new Song("The Weight", "The Band", 1968, 274));
        playlist.add(new Song("Stairway to Heaven", "Led Zeppelin", 1971, 482));
        playlist.add(new Song("Hotel California", "The Eagles", 1977, 390));
        playlist.add(new Song("With or Without You", "U2", 1987, 296));

        for (Song song : playlist) {
            song.play();
        }

        System.out.print("Total running time: ");
        System.out.print(runningTime(playlist));
        System.out.println(" seconds.");
    }
}
