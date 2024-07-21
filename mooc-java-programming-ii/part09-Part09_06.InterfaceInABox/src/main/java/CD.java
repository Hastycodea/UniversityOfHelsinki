
public class CD implements Packable {

    private String artist;
    private String cdName;
    private int pubYear;

    public CD(String artist, String cdName, int pubYear) {
        this.artist = artist;
        this.cdName = cdName;
        this.pubYear = pubYear;
    }

    public String getArtist() {
        return artist;
    }

    public String getCdName() {
        return cdName;
    }

    public int getPubYear() {
        return pubYear;
    }

    @Override
    public double weight() {
        return 0.1;
    }
    
    @Override
    public String toString() {
        return this.getArtist() + ": " + this.getCdName() + " (" + this.getPubYear() + ")";
    }

}
