public abstract class Bird extends Animal{

    //super constructor
        //this constructor is related to the Animal Class
    public Bird() {
        super("Bird","Drone");
    }

    public Bird(String name, String desc) {
        super(name,desc);
    }

    public abstract String poop();

    @Override
    public String makeNoise() {
        return "tweet tweet";
    }
}
