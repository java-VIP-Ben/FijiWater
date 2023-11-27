//Benjamin Lukens

public class Otters extends Animal implements Swimming{
    
    public Otters(){
        super("Ryan Houston","Loves Water and plays alot of chess on chess.com.");
    }

    @Override
    public String swim() {
        return "The otters are swimmy.";
    }
    
    @Override
    public String makeNoise() {
        return "meow";
    }
}
