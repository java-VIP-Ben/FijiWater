//Benjamin Lukens

public class Koala extends Animal implements Walking{
    public Koala(){
        super("Koamala Harris","Koamala Harris 2024");
    }

    @Override
    public String walk() {
        return "Gaining traction within their political party";
    }

    @Override 
    public String makeNoise() {
        return "Hey! I got your vote right?";
    }
}
