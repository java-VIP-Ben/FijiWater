//imports

public class LoopyString {
    public static void main(String[] args) {
       //Data types that are sequence -> Strings, Array, List, ArrayList,maps,
       
       /* These functions can work with other sequences, it just depends on how to access the data. 
        * 
        */

        //count the number of a certain char in a String
        //System.out.println(howMany("GIGGLING","G"));

        //find all and replace any double \s\s with a single \s
        //System.out.print(spaceReplacer("This sentence.  Has Double"));

         //input banana, it will print out bnn
        //System.out.println(removeVowels("Banana"));


        //be able to place items in a String 
        //System.out.println(replacePhrase("I like potatoes", "potoato", "poop"));

        //replacing stuff
        System.out.println(replaceStuff("I like potatoes with a side of potato sauce" , "potato", "poop"));
    }
    public static String spaceReplacer(String a){
        for(int p=0;p!=a.length()-1;p++){
            char chart = a.charAt(p);
            char chart2 = a.charAt(p+1);
            if(chart==' '&&chart2==' '){
                a = a.substring(0,p)+a.substring(p+1,a.length());
            }
        }
        return a;
   }
        //print out the corrected version
    public static String removeVowels(String input){
        String output = "";
        input=input.toLowerCase();
        for(int x=0;x!=input.length();x++){
            if (input.substring(x,x+1).equals("a") || input.substring(x,x+1).equals("e") || input.substring(x,x+1).equals("i") || input.substring(x,x+1).equals("o") || input.substring(x,x+1).equals("u") ){
                 System.out.print("");
            } else {
                 output += input.substring(x,x+1).toUpperCase();
             }
        }
        return output;
    }

    public static String replacePhrase(String phrase, String wordToFind, String wordToReplace) {
        String out = "";
        int beginIndex = 0;
        System.out.println(phrase.indexOf(wordToFind, 0));
        out = (phrase.substring(0, phrase.indexOf(wordToFind, 0))+ wordToReplace);
        beginIndex = phrase.indexOf(wordToFind) + wordToFind.length();
        System.out.println(beginIndex);
        out = (phrase.substring(0, phrase.indexOf(wordToFind, 0))+ wordToReplace);
        beginIndex = phrase.indexOf(wordToFind) + wordToFind.length();
        System.out.println(beginIndex);
        out = (phrase.substring(0, phrase.indexOf(wordToFind, 0))+ wordToReplace);
        beginIndex = phrase.indexOf(wordToFind) + wordToFind.length();

        return out;
    }

    public static String replaceStuff(String ph,String f,String r){
        while(ph.indexOf(f)!=-1){
            ph = ph.substring(0,ph.indexOf(f))+r+ph.substring(ph.indexOf(f)+f.length(),ph.length());
        }
        return ph;
    }
} 