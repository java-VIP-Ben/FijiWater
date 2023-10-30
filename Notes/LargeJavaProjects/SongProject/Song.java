
public class Song {
    String songTitle = "";
    String songArtist = "";
    double rating;


    public Song() {

    }

    //things that characters need. Aside from a tragic backstory, that idea was denied. 
    //constructor signature.
    public Song(String newSongTitle) {
        //this.globalvariable = localvariable <- within the signature
        this.songTitle = newSongTitle;
    }

    public Song(String newSongTitle, String newArtistName) {
        //this.globalvariable = localvariable
        this.songTitle = newSongTitle;
        this.songArtist = newArtistName;
    }

     public Song(String newSongTitle, String newArtistName, double rate) {
        //this.globalvariable = localvariable
        this.songTitle = newSongTitle;
        this.songArtist = newArtistName;
        this.rating = rate;
    }

    //getters and setters
    //making more accessors and mutators for the 
    //will have a getter and setter for each field variable

    public void reArtist(String newArtistName) {
        this.songArtist = newArtistName;
    }
    public String getArtist() {
        return this.songArtist;
    }
    public void reRecord(String newSongTitle) {
        this.songTitle = newSongTitle;
    }
    public String getRecord() {
        return this.songTitle;
    }
    public void setRating(double newRating) {
        this.rating = newRating;
    }
    public double getRating() {
        return this.rating;
    }

    @Override
    public String toString() {
        String out = "";
        out += "Song: " + this.songTitle;
        if(this.songArtist==null){
            out += "\nArtist : " + "no artist? not possible.";
        } else {
            out += "\nArtist: " + this.songArtist;
        }
        out += "\nRating: "+this.rating;
        out += "\n";

        return out;
    }
}
