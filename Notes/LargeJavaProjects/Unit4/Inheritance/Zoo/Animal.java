//Abstract super class, so everything here is abstract
public abstract class Animal {
    
    //have a name and a desc
    private String name, desc;

    public Animal() {

    }
    public Animal(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    //forces anything that extends animal, a makeNoise function. 
    public abstract String makeNoise();
    
    //getters and setters . . . 
    public String getName(){
        return name;
    }

    public String getDesc(){
        return desc;
    }
}   
