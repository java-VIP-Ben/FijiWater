//Benjamin Lukens

public class Human extends Animal implements Walking{
    public Human() {
        super("Taylor Blythe","Brown and hes in town, that one");
    }

    @Override
    public String walk() {
        return "People walking to look at the other animals";
    }

    @Override
    public String makeNoise() {
        return "So what did you have for lunch?";
    }
}
