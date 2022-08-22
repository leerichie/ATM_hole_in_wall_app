package sec_project;

public class Song {

    private int positionNumber;
    private String trackName;
    private String artistName;

    public Song(int positionNumber, String trackName, String artistName) {
        this.positionNumber = positionNumber;
        this.trackName = trackName;
        this.artistName = artistName;
    }

    public int getPositionNumber() {
        return positionNumber;
    }

    public void setPositionNumber(int positionNumber) {
        this.positionNumber = positionNumber;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @Override
    public String toString() {
        return "Song{" +
                "positionNumber=" + positionNumber +
                ", trackName='" + trackName + '\'' +
                ", artistName='" + artistName + '\'' +
                '}';
    }
}
