//Benjamin Lukens

public class Turtle extends Animal implements Swimming{
    public Turtle(){
        super("Jag","RIP Jag 2015");
    }
    
    @Override
    public String swim() {
        return "Turtles are swimming to their rocks";
    }

    @Override
    public String makeNoise() {
        return "meeehhhh";
    }
}
