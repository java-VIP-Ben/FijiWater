public class Student {
    //global variable dump
    String n = "name"; //n is for name, obviously
    int g = 0; //g is for grade


    public Student (String name, int grade) {
        this.n = name;
        this.g = grade;
    }

    //getters and setters
    public void setName(String newName) {
        this.n = newName;
    }
    public String getName() {
        return this.n;
    }
    public void setGrade(int newGrade) {
        this.g = newGrade;
    }
    public int getGrade() {
        return this.g;
    }

    //public data type name of function(parameters) {
    // return this.variable 
    //}

    //public void setVar(parameters) {
    // return this.variable
    //}

    //to String method
    @Override
    public String toString() {
        String out = "";
        out+=("Name:\t" + this.n + "\n");
        out+=("Grade:\t" + this.g + "\n");

        //to-do: auto generated method stub ..?
        return out;
    }

}
