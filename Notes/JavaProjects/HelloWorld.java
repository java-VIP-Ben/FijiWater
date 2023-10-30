// one line comment 
    /*
     * block comment (collapsable)
     * public -> public means that everyone can see it in the scope of work.
     * main class must be public for the JVM to see it 
     * class -> define a class
     * HelloWorld -> name of your class
     */
    
public class HelloWorld {
    //main method -> where code starts
    public static void main(String[] args){
        /*
         * private -> no other files can access this method
         * method -> abstract command to run an algorithm, can do or return data
         * static -> HelloWorld.main() how the method is called
         * void -> Empty, doesnt return anything 
         * main(String[] args) -> when running, you can give the function arguments
         *  java HelloWorld.java ['words' , 'data' , 'stuff']
         */

        System.out.println("Hello World!");

        /*
         * System -> system module or class
         * out -> subclass of System
         * println() -> method used to print with the /n at the end of the line
         * 
         */

        System.out.print("Hello World!"); // no /n to create a new line
        System.out.print("double it and give it to the next person!");

        System.out.println("\n12345.6789");
        System.out.printf("%1.2f%n", 12345.6789); //introduction to rounding numbers | decimal format also works here

        //print({}{}{}, varlist)
        System.out.println("bob" + "the" + "builder");
        System.out.println(1+2+3);


    }

}