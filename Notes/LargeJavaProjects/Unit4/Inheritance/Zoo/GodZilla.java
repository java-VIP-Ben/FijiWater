//Benjamin Lukens

public class GodZilla extends Animal implements Flying{
    public GodZilla() {
        super("Zillagod", "Big and Scary");
    }

    public GodZilla(String name, String desc) {
        super(name, desc);
    }

    @Override
    public String fly() {
        return "God Zilla is rotating";
    }

    @Override
    public String makeNoise() {
        return "*charging up the laser* ROARRRRR";
    }
}
