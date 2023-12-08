//silly imports
import java.util.ArrayList;
import java.util.Scanner;
public class FinalLibrary {

     private static ArrayList<Book> mySeries = new ArrayList<Book>();
     private static ArrayList<Song> myLibrary = new ArrayList<Song>();
     public static void main(String[] args) {
        
         //setting the array list as static cleared the error at the bottom with the playlist print statement. 
        //setting the array list as static makes it not able to be referenced outside of the file. 
        String ipAddress = "192.168.68.46";
        

        //creating the scanner class
        Scanner ui = new Scanner(System.in);

        System.out.println("Would you like to add a song to your playlist? (Y/N)"); 
        String answer = ui.nextLine();

        while (answer.equals("Y") || answer.equals("y")) {
        printPlayList(myLibrary);

        //formating
        System.out.printf("\nEnter a song title:  \nEnter song artist:   \nRate the song 1-10: \n");
        
        addSong();
        System.out.println("Would you like to add another song?");
        answer = ui.nextLine();
        if(answer.equals("Y") || answer.equals("y")) {
            //formating
            System.out.printf("\nEnter a song title:  \nEnter song artist:   \nRate the song 1-10: \n");
          addSong();
        } else {
          System.out.println("What else would you like to do? \n1.)View PlayList \n2.)Exit \n3.)Search Songs \n4.)Books \n5.)Search Books\n");
          int num = ui.nextInt();
          if(num == 1) {
               printPlayList(myLibrary);
          } else if (num == 2) {
               System.exit(0);
          } else if (num == 3) {
            findSong();
          } else if (num == 4) {
            System.out.println("Would you like to add a book to your library? (Y/N)"); 
            answer = ui.nextLine();

            if(answer.equals("Y") || answer.equals("y")) {
            printSeries(mySeries);

            //formating
            System.out.printf("\nEnter a book title:  \nEnter Book Author:   \n");
        
            addBook();
            System.out.println("Would you like to add another book?");
            answer = ui.nextLine();
            if(answer.equals("Y") || answer.equals("y")) {
                addBook();
            } else {
                System.out.println("What else would you like to do? \n1.)View Bookshelf \n2.)Exit\n");
                num = ui.nextInt();
                if(num == 1) {
                    printSeries(mySeries);
                } else {
                    System.exit(0);
                }
            }
        }
    } else if(num == 5) {
        findBook();
    }

        printPlayList(myLibrary);

        //printing out the average rating of my playlist
        printAvgRating(myLibrary);
        }
    }
        if(!answer.equals("Y") || !answer.equals("y")) {

            System.out.println("Would you like to add a book to your library? (Y/N)"); 
            answer = ui.nextLine();

            if(answer.equals("Y") || answer.equals("y")) {
            printSeries(mySeries);

            //formating
            System.out.printf("\nEnter a book title:  \nEnter Book Author:   \n");
        
            addBook();
            System.out.println("Would you like to add another book?");
            answer = ui.nextLine();
            if(answer.equals("Y") || answer.equals("y")) {
            addBook();
            } else {
            System.out.println("What else would you like to do? \n1.)View Bookshelf \n2.)Exit\n");
            int num = ui.nextInt();
            if(num == 1) {
               printSeries(mySeries);
            } else {
               System.exit(0);
            }
        }

            printPlayList(myLibrary);

            //printing out the average rating of my playlist
            printAvgRating(myLibrary);

        }
    }
        if(answer.equals("n") || answer.equals("N")) {
            System.out.println("What else would you like to do? \n1.)View PlayList \n2.)Exit \n3.)Search Songs \n4.)Books \n5.)Search Books");
            int num = ui.nextInt();


            //readding this stuff because i am covering all the bases (this is bad coding, but nothing is perfect the first try)
            if(num == 1) {
               printPlayList(myLibrary);
            } else if (num == 2) {
               System.exit(0);
            } else if (num == 3) {
                findSong();
            } else if (num == 4) {
                System.out.println("Would you like to add a book to your library? (Y/N)"); 
                answer = ui.nextLine();
            } else if(num == 5) {
                findBook();
            }
    }
    ui.close();
}
    private static void addSong() {
        Scanner ui = new Scanner(System.in);
        String n = ui.nextLine();
        String a = ui.nextLine();
        double r = ui.nextDouble();
        myLibrary.add(new Song(n, a, r));
        System.out.print("\n");
       
    }

    private static void addBook() {
        Scanner ui = new Scanner(System.in);
        String n = ui.nextLine();
        String a = ui.nextLine();
        mySeries.add(new Book(n, a));
        System.out.print("\n");
    }

    public static void printPlayList(ArrayList<Song> arr) {
        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
    public static void printSeries(ArrayList<Book> arr) {
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

    private static Song findSong() {
        //finding the song titles
        Scanner ui = new Scanner(System.in);
        System.out.println("Enter the song name to search:");
        String ftitle = ui.nextLine();

        for(int i = 0; i < myLibrary.size(); i++) {
            if(myLibrary.get(i).getRecord().equals(ftitle)) {
                return myLibrary.get(i);
            }
        }
        return new Song(); 
    }

    private static Book findBook() {
        //finding the song titles
        Scanner ui = new Scanner(System.in);
        System.out.println("Enter the book title to search:");
        String ftitle = ui.nextLine();

        for(int i = 0; i < mySeries.size(); i++) {
            if(mySeries.get(i).getBookTitle().equals(ftitle)) {
                return mySeries.get(i);
            }
        }
        return new Book(); 
    }
}
