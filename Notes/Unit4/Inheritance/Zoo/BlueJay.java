public class BlueJay extends Animal implements Flying{
    public BlueJay() {
        super("Jake, Jay, and Jim","Breaking glass and Ice since 2009");
    }

    @Override
    public String fly() {
        return "Blue Jays are crashing into fragile windows";
    }
    
}
