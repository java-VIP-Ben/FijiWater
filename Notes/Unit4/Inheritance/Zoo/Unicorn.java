public class Unicorn extends Animal implements Flying{
    public Unicorn(){
        super("Blake Brucken","Unicorn of Industry");
    }

    @Override
    public String fly() {
        return "Unicorns are- wake up wake up wake up wake up wake up";
    }
}
