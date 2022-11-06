
public class Music {

    private String song;
    private String artist;
    private int streams;
    
    //Constructor
    public Music(String song, String artist, int streams)
    {
        this.song= song;
        this.artist= artist;
        this.streams= streams;
    }

    //print method
    public void print(){
        System.out.print("Song Name: " + this.song + "\t");
        System.out.print("Artist Name: " + this.artist + "\t");
        System.out.println("Number of Streams: " + this.streams + "\t");
    }

    public int getPlaycount() {
        return this.streams;
    }
   

    
}
