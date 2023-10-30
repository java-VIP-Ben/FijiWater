//imports
import java.util.ArrayList;
import java.util.Scanner;

public class MediaLibrary {
        //setting the array list as static cleared the error at the bottom with the playlist print statement. 
        //setting the array list as static makes it not able to be referenced outside of the file. 
        final static String ipAddress = "192.168.68.46";
        private static ArrayList<Song> myPlayList = new ArrayList<Song>();
        private static ArrayList<Book> mySeries = new ArrayList<Book>();

    public static void main(String[] args) {

        //creating the scanner class
        Scanner ui = new Scanner(System.in);

        System.out.println("Would you like to add a song to your playlist? (Y/N)"); 
        String answer = ui.nextLine();

        while (answer.equals("Y") || answer.equals("y")) {
            Song firstSong = new Song();
        //System.out.println(firstSong);

        Song secondSong = new Song("I no Longer Feel the Razor Gaurding my Heel","$B");
        //System.out.println(secondSong);
        
        Song thirdSong = new Song("Look at This");
        thirdSong.reArtist("Xavier Wulf");
        //System.out.println(thirdSong);

        myPlayList.add(firstSong);
        myPlayList.add(secondSong);
        myPlayList.add(thirdSong);
        firstSong.reRecord("Wheels on Da Bus");
        firstSong.setRating(1);
        myPlayList.get(1).setRating(5);
        myPlayList.get(2).setRating(10);
        printPlayList(myPlayList);
        
        addSong();
        addSong();

        printPlayList(myPlayList);

        //printing out the average rating of my playlist
        printAvgRating(myPlayList);

        findSong();

        ui.close();

        }
    }
    private static void addSong() {
        Scanner ui = new Scanner(System.in);
        String n = ui.nextLine();
        String a = ui.nextLine();
        double r = ui.nextDouble();
        myPlayList.add(new Song(n, a, r));
        System.out.print("\n");
       
    }

    public static void printPlayList(ArrayList<Song> arr) {
        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }


    private static void printAvgRating(ArrayList<Song> arr) {
        double average = 0.0;
        double sum = 0.0;
        for(int i=0; i < arr.size(); i++) {
            sum += arr.get(i).getRating();
        }
        average = sum/arr.size();
        System.out.println(average);
    }

    public static Song findSong() {
        //finding the song titles
        Scanner ui = new Scanner(System.in);
        System.out.println("Enter the song name to search:");
        String ftitle = ui.nextLine();

        for(int i = 0; i < myPlayList.size(); i++) {
            if(myPlayList.get(i).getRecord().equals(ftitle)) {
                return myPlayList.get(i);
            }
        }
        return new Song(); 
    }
  }
