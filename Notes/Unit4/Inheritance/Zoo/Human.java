public class Human extends Animal implements Walking{
    public Human() {
        super("Taylor Blythe","Brown and hes in town, that one");
    }

    @Override
    public String walk() {
        return "People walking to look at the other animals";
    }
}
