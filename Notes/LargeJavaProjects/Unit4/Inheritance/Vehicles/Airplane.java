public class Airplane extends Vehicle {
    //an airplane is a vehicle
    //variables
    private int elevation; 

    public Airplane(String material, String color, String fuel, String speed) {
        //uses super to take the same variables that were declared in the extended Vehicle.java files
        super(material,color,fuel,speed);
    }

    public void flying(int elevation) {
        this.elevation = elevation;

    }
}
