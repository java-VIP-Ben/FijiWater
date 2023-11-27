public class GoldFish extends Animal implements Swimming{
    public GoldFish() {
        super("John Pork","FLY high 2023");
    }

    @Override
    public String swim() {
        return "Gold fish is down the toilet";
    }

    @Override
    public String makeNoise() {
        return "Blub blub";
    }
}
