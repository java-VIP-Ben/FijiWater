public abstract class Vehicle {
    private String title, brand, speed,  material, color, fuel;
    private int acceleration, braking;

    public vehicle(String title, String color, String fuel, String speed) {
        this.title = title;
        this.color = color;
        this.fuel = fuel;
        this.speed = speed;

    }

    //w button
    public void accelerate(int time) {
        this.speed+= acceleration * time;
    }

    //s button
    public void decelerate(int time) {
        this.speed += braking * time;
    }

    //quitting the game 
    public void destruct() {
        this.speed="STOP";
    }
}
