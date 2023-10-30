//imports 

//DO NOT name this the same thing as something built-in
public class Hero {
    //YOU DO NOT HAVE A MAIN IN THIS CLASS.
    String name;
    String superPower;
    //NullPointerException -> nothing is there.

    //no-args constructors
    //python -> def __init__(self);
    public Hero() {

    }

    //things that characters need. Aside from a tragic backstory, that idea was denied. 
    //constructor signature.
    public Hero(String newName) {
        //this.globalvariable = localvariable <- within the signature
        this.name = newName;
    }

    //overloading -> multiple constructors with different signatures
    public Hero(String newName, String newSuperPower) {
        //this.globalvariable = localvariable
        this.name = newName;
        this.superPower = newSuperPower;
    }
    //public Hero(String newName, String Power) { } is a signature
    //they need to be unique data types. 

    //getters and setters
    public void newPower(String newPower) {
        this.superPower = newPower;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        String out = "";
        out += "Name: " + this.name;
        if(this.superPower==null){
            out += "\nSuperpower : " + "no powers... lame.";
        } else {
            out += "\nSuperpower: " + this.superPower;
        }
        out += "\n";


        return out;
    }

}
