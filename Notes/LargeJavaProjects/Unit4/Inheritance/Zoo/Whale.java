//Benjamin Lukens

public class Whale extends Animal implements Swimming{
    public Whale(){
        super("Willy","Not the real Willy.");
    }

    @Override
    public String swim() {
        return "Taking up too much space in the zoo.";
    }

    @Override
    public String makeNoise() {
        return "Yeah, I speak whale.";
    }
}