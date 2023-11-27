public class Ostrich extends Animal implements Walking{
    public Ostrich() {
        super("Liberty Mutual","Best advertised worst insurance ever.");
    }

    @Override
    public String walk() {
        return "Preparing to sign a treaty with Emus.";
    }

    @Override
    public String makeNoise() {
        return "SQUAKKKK";
    }
}
