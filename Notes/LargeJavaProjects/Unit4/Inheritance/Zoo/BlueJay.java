public class BlueJay extends Bird implements Flying{
    public BlueJay() {
        super("Jake, Jay, and Jim","Breaking glass and Ice since 2009");
    }

    @Override
    public String fly() {
        return "Blue Jays are crashing into fragile windows";
    }
    
    @Override
    public String poop() {
        return "Drops a duce right on parker's windshield";
    }

    @Override
    public String makeNoise() {
        return "wahhhh heyaaaaa";
    }
}
