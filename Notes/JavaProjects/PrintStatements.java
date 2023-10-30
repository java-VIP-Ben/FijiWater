public class PrintStatements {
    public static void main(String[] args) {
        print("Hello World");
        print(7);
        print('H');
        print("Hello","world!");



    }

    public static void print(String stuff) { //could also need arrays []
        System.out.println(stuff);
    }

    public static void print(int stuff) {  //could also need arrays []
        //requires the int to differentiate between data types
        System.out.println(stuff);
    }

    public static void print(char stuff) { //could also need arrays []
        System.out.println(stuff);
    }

    public static void print(String stuff, String moreStuff) {
        System.out.println(stuff+ " " + moreStuff);
    }
}
