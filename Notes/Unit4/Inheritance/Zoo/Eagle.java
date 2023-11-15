public class Eagle extends Animal implements Flying{
    public Eagle() {
        super("Big Jake", "Big time freedom advocate");
    }

    @Override
    public String fly() {
        return "The mighty eagle is soaring";
    }
}
