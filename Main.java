
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println();
        System.out.println("==================================");
        System.out.println("Music Database 1.0");
        System.out.println("==================================");
        System.out.println();
        System.out.println("by Crown - 22038807");
        System.out.println();
        System.out.println();
        

    
    
    System.out.println();
    System.out.println("Welcome to Music Database 1.0!");
    System.out.println("...");
    System.out.println();
    System.out.println("List of Songs Saved: ");
    System.out.println();
    

    Music giveon = new Music("Lost me        ", "Giveon                 ", 43885522);
    Music drake = new Music("one dance        ", "Drake                 ", 244177096); 
    Music burna = new Music("Last Last        ", "Burna Boy             ", 142363807); 
    Music oxlade = new Music("Ku Lo Sa        ", "Oxlade                ", 82648368);
    Music miguel = new Music("Sure thing      ", "Miguel                ", 505497735); 
    Music kizzdaniel = new Music("Buga(Lo Lo Lo)", "Kizz Daniel        ", 29592050);
    Music skimask = new Music("Unbothered        ", "Ski Mask The Slump God", 183061846); 
    Music xxx = new Music("Revenge        ", "XXXTENTACION         ", 731660230); 
    Music sleepy = new Music("2055                ", "Sleepy Hallow         ", 477336167); 
    Music asake = new Music("Bandana        ", "Asake                 ", 19644186);
    
    ArrayList<Music> musics = new ArrayList<Music>();
    musics.add(giveon);
    musics.add(drake);
    musics.add(burna);
    musics.add(oxlade);
    musics.add(miguel);
    musics.add(kizzdaniel);
    musics.add(skimask);
    musics.add(xxx);
    musics.add(sleepy);
    musics.add(asake);
    int songnumber = 0;
    for (Music song : musics)
    {
        System.out.println("No "+ songnumber+ "\t");
        song.print();
        songnumber++;
        
    }
    
    
    System.out.println();
    System.out.println();

    String seesongs = InputReader.getString("Do you want to List the songs saved? ");
    seesongs.toLowerCase();
    System.out.println();
    System.out.println();
    if (seesongs.equals("yes"))
    { 
        for(Music music : musics)
            music.print();
    }
    
    System.out.println();
    System.out.println();

    String playcount = InputReader.getString("Do you want to List the songs by the Number Streams? ");
    playcount.toLowerCase();
    System.out.println();
    System.out.println();
    if (playcount.equals("yes"))
    {
        System.out.print("Here are the songs listed by the number of Streams");
        System.out.println();
        System.out.println();
        xxx.print();
        miguel.print();
        sleepy.print();
        drake.print();
        skimask.print();
        burna.print();
        oxlade.print();
        giveon.print();
        kizzdaniel.print();
        asake.print();
    }

    System.out.println();
    System.out.println();

    String c2 = InputReader.getString("Do you want to add a song to the list? ");
    System.out.println();
    if (c2.equalsIgnoreCase("yes")) 
    {
        String addsong = InputReader.getString("Enter song name: ");
        System.out.println();
        String addartist = InputReader.getString("Enter the Artist name: ");
        System.out.println();
        int addstreams = InputReader.getInt("Enter the Number of Streams: ");
        System.out.println();
        System.out.print("Song: " + addsong + "\t");
        System.out.print("Artist: " + addartist + "\t");
        System.out.print("Number of Streams: " + addstreams + "\t");
        System.out.println();
        Music savesong = new Music(addsong, addartist, addstreams);
        System.out.println();
        System.out.println();
        musics.add(savesong);
        for (Music it : musics) 
        {
            it.print();
        }

    }

    System.out.println();
    System.out.println();

    String song = InputReader.getString("Do you want to Remove song... ");
    System.out.println();
    System.out.println();
    song.toLowerCase();
    if (song.equalsIgnoreCase("yes"))
    {
        int c1 = InputReader.getInt("Pick a Song ID between 0-10: ");
        System.out.println();
        System.out.println();
        if (c1 <= songnumber)
        musics.remove(c1);
        for (Music it : musics) {
            it.print();

        }
        System.out.println();
        System.out.println("The song number " + c1 + " has been removed");
    }
    
    System.out.println();
    System.out.println();
    try (Scanner select = new Scanner(System.in)) 
    {
        String nstreams = InputReader.getString("Do you want to print a list of songs with over a certain number of Streams? ");
        System.out.println();
        nstreams.toLowerCase();
    if (nstreams.equalsIgnoreCase("yes")){
        System.out.println();
        System.out.println("Enter the minimum number of Streams you are looking for? ");
        int streams = select.nextInt();
        System.out.println();
        System.out.println("The Songs with More Streams than " + streams + " are? ");
        System.out.println();
        for (Music it : musics) 
        {
            if (streams <= it.getPlaycount())
            {
                it.print();
            }
        }
    }
    System.out.println();
System.out.println();
String end = InputReader.getString("Have you Finished using Music Database 1.0 ");
    System.out.println();
    end.toLowerCase();
if (end.equalsIgnoreCase("yes"))
{
    System.out.println("Thank you for using Music Database 1.0...Bye!");
}



}


}

}
 
    


