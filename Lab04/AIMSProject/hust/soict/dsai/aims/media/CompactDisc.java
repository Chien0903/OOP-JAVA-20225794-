package hust.soict.dsai.aims.aims.media;
import java.util.ArrayList;
import java.util.List;
public class CompactDisc extends Disc implements Playable{
    private String artist;

    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc(int id, String title, String category, float cost, String director
            , int length, String artist) {
        super(id, title, category, cost, director, length);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void addTrack(Track track) {
        int indexOfTrack = tracks.indexOf(track);
        if (indexOfTrack == -1) {
            System.out.println("Track already exists!");
            return;
        }
        tracks.add(track);
        System.out.println("Track added!");
    }

    public void removeTrack(Track track) {
        int indexOfTrack = tracks.indexOf(track);
        if (indexOfTrack == -1) {
            System.out.println("Track does not exist!");
            return;
        }
        tracks.remove(indexOfTrack);
        System.out.println("Track removed!");
    }

//    @Override
//    public int getLength() {
//        int totalLength = 0;
//        for (Track track : tracks) {
//            totalLength += track.getLength();
//        }
//        setLength(totalLength);
//        return totalLength;
//    }

    // Phuong thuc de display thong tin cua CompactDisc
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD artist: " + artist);
        System.out.println("CD length: " + this.getLength());
        for (Track track : tracks) {
            track.play();
        }
    }

    @Override
    public void print() {
        System.out.println(getId() + ". CD - "
                + getTitle() + " - " + getCategory() + " - "
                + getDirector() + " - " + artist + " - "
                + getCost() + "$");
    }
}
