//imports
import java.util.Scanner;


public class looptyLoop {
    public static void main(String[] args) {
        /*
         * for and while loops
         * pythong: a while loop looked like this 
         * while(boolean statement == true):
         *        do this algorithm
         * while(PlayerAlive):
         * while(PlayerIsAlive): <-- these 2 examples are prime examples of variables that are clearly booleans, but their true or false value is hidden. 
         * while(user.Input.isDigit()):
         */

        //print out the numbers 0-9
        int i = 0;
        while(i != 20) {
            System.out.println(i);
            i += 2;
        }

        int x = 1;
        while(x<=20) {
            System.out.println(x);
            x+=2;
        }

        int n = 1;
        double denominator = 1;
        double total = 0;
        while(n != 101) {  //while bool
            //System.out.println(n);
            total += (1/denominator);
            System.out.printf("1/%s\n" ,denominator); //algorithm
            denominator *= 2;  // iterate
            n++;
        }
        System.out.println(total);

        //keep asking the guess What
        //until they enter chicken butt

        Scanner ui = new Scanner(System.in);

        // String guess = "";
        //while(!guess.equals("chicken butt")) {
        //   System.out.println("Guess what?");
        //   guess = ui.nextLine();
        //}
        //System.out.println("hehhehehehheheheheheeheheehehehheheheehhehehehehe");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            // ive fully lost it at this point. Written 8/30/23 at 1:28 PM SICTC 

        

        /****************************  FOR   LOOPS  **********************************************/
        /*
         * print out a 0-9
         * initialize the iterator boolean iterate and use; at the end of the arguments  
         */

        for(int y = 0; y!=10; y++) {
            System.out.println(y);
        }

        //String guess1 = "";
        //int xy = 10;
        //for(int xx = 0; xx != xy; xx++) {
        //System.out.println("Guess what?");
        //    guess1 = ui.nextLine();
        //    if(guess1.equals("chicken butt")) {
        //        System.out.println("Hehehehhe");
        //        xx = xy;
        //    }    
        //    
        //}


        for(int o=0;o!=3;o++){
            for(int l=0;l<=2;l+=1){
                if(o<2) {
                    System.out.print(l+",");
                }
                else {
                    if(l>1){
                        System.out.print(l);
                } else {
                    System.out.print(l + ",");
                }        
            }
        }
    }

         System.out.println("");

        for(int p=0;p!=3;p++){
            for(int w=2;w>=0;w-=1){
                if(p<2) {
                    System.out.print(w+",");
                }
                else {
                    if(w<1){
                        System.out.print(w);
                } else {
                    System.out.print(w + ",");
                }        
            }
        }

        ui.close();
    }
}
}
