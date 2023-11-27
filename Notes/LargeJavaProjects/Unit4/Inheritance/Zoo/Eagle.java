//Benjamin Lukens

public class Eagle extends Bird implements Flying{
    public Eagle() {
        super("Big Jake", "Big time freedom advocate");
    }

    @Override
    public String fly() {
        return "The mighty eagle is soaring";
    }

    @Override
    public String poop() {
        return "Drops a duce right on parker's windshield";
    }

    @Override
    public String makeNoise() {
        return "FREEDOM INTENSIFIES!";
    }
}
