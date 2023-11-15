import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
    
public class Zoo
    {
    public static  void main(String[] args) throws InterruptedException 
    {

        //list of animals
        //arraylist can only accept animals
        ArrayList<Animal> animals = new ArrayList<Animal>();

        System.out.println("Welcome to the Zoo!\n");
        System.out.print("Building the cages");
        delayDots();
        System.out.print("Populating the animals");
        populateAnimals(animals);
        delayDots();
        System.out.print("Hiring zookeepers");
        delayDots();

        Scanner in = new Scanner(System.in);
        System.out.println("\nYou are standing in a wondrous zoo. What would you like to do?");
        System.out.println("Type help to find out what you can do.\n");
        String text = in.nextLine();
        String msg = "";
        while(!text.equals("leave"))
        {
            //one of the best tools to utilize for a main menu. (Password manager help)
            switch(text)
            {
                case "help" : 
                msg = "So far we can visit cages, listen, leave \n"+
                "and ask for help, you can also put in pastures, look up, look around, look down, train, crawl, sleep, explode, confusion and sing.";
                break;
                case "visit cages" : 
                msg = visitCages(animals);
                break;
                case "look up":
                msg = lookUp(animals);
                break;
                case "look down":
                msg = lookDown(animals);
                break;
                case "look around":
                msg = lookAround(animals);
                break;
                default : msg = "You flail helplessly with indecision.";
            }
            System.out.println("\n" + msg);
            delayDots(3);
            System.out.println("\nYou are standing in a wondrous zoo. What would you like to do?\n");
            text = in.nextLine();
        }
        System.out.println(Math.random() < .5 ? "\nHave a nice day!  Hope you come back!" : "\nAn escaped lion eats you on your way out.  Sorry!");
    }
    
    public static String seeTheBears(List<Animal> animals){
        return "";
    }
    
    
    public static String listen(List<Animal> animals){
        return "";
    }
       
    public static String lookDown(List<Animal> animals){
        String msg = "";
        for(Animal a: animals) {
            //instanceof checks the object if it implements
            // an interface
            if(a instanceof Swimming) {
                // Cast animal a to object of swimming
                Swimming s = (Swimming) a;
                msg += a.getName() + ": \n\t" + s.swim() + "\n";

            }
        }
        return msg;
    }
    
    public static String lookUp(List<Animal> animals){
        String msg = "";
        for(Animal a: animals) {
            //instanceof checks the object if it implements
            // an interface
            if(a instanceof Flying) {
                // Cast animal a to object of flying
                Flying f = (Flying) a;
                msg += a.getName() + ": \n\t" + f.fly() + "\n";

            }
        }
        return msg;
    }
    
    public static String lookAround(List<Animal> animals){
        String msg = "";
        for(Animal a: animals) {
            //instanceof checks the object if it implements
            // an interface
            if(a instanceof Walking) {
                // Cast animal a to object of flying
                Walking w = (Walking) a;
                msg += a.getName() + ": \n\t" + w.walk() + "\n";

            }
        }
        return msg;
    }
    
    public static String visitCages(List<Animal> animals)
    {
        String msg = "";
        for(Animal a: animals) {
            msg += a.getName()+":\n\t"+a.getDesc()+"\n";
        }
        return msg;
    }

    /**
     * This prints an ellipses with 1 second between each period
     * It then moves to the next line.
     */
    public static void delayDots(int dotAmount) throws InterruptedException 
    {
        for (int i=0; i<dotAmount; i++) {
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
        }
        System.out.println();
    }

    /**
     * This prints an ellipses with 1 second between each period
     * It then moves to the next line.
     */
    public static void delayDots() throws InterruptedException 
    {
        delayDots(0);
    }

    /**
     * This is where we will all collaborate.
     * Construct your animal and add it to the List
     * @param animals the list containing all the zoo animals
     */
    public static void populateAnimals(List<Animal> animals)
    {
        TrashPanda tp = new TrashPanda();
        Otters o = new Otters();
        Chipmunk cm = new Chipmunk();
        BlueJay bj = new BlueJay();
        Eagle mighty = new Eagle();
        GoldFish fsh = new GoldFish();
        Whale whale = new Whale();
        Koala political = new Koala();
        Cricket bug = new Cricket();
        Unicorn blake = new Unicorn();
        Turtle jag = new Turtle();
        Deer bambi = new Deer();
        Dino branch = new Dino();
        Human jimmy = new Human();
        Ostrich ost = new Ostrich();
        Tegu liz = new Tegu();

        animals.add(tp);
        animals.add(new TrashPanda());
        animals.add(o);
        animals.add(cm);
        animals.add(bj);
        animals.add(mighty);
        animals.add(fsh);
        animals.add(whale);
        animals.add(political);
        animals.add(bug);
        animals.add(blake);
        animals.add(jag);
        animals.add(bambi);
        animals.add(branch);
        animals.add(jimmy);
        animals.add(ost);
        animals.add(liz);
        animals.add(new GodZilla("Zilla","Yummy Sushi roll at the Tokyo Auto Salon"));
    }
}