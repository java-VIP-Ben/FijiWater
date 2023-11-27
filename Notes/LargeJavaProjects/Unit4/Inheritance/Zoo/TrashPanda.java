//Benjamin Lukens

//Trash Panda is A animal -> child class can be a parent cass (is A)
//"child" HAS A interface -> wednesday
public class TrashPanda extends Animal implements Walking{
    public TrashPanda() {
        //Super constrcutor, or AnimalConstructor(name, desc)
        super("Zander Gumula","Trash Love from Taco Bell in Newburgh");
    }

    @Override
    public String walk() {
        return "Trash Pandas digging through garbage";
    }

    @Override
    public String makeNoise() {
        return "Squeak! Squeak!";
    }
}
