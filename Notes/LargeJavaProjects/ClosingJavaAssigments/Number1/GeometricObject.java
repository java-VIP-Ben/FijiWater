// GeometricObject.java: The abstract GeometricObject class
public abstract class GeometricObject {
  private String color = "white";
  private boolean filled;
  double side1, side2, side3;

  /**Default construct*/
  protected GeometricObject() {
    side1 = 1.0; side2 = 1.0; side3 = 1.0;
  }

  /**Construct a geometric object*/
  protected GeometricObject(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  /**Getter method for color*/
  public String getColor() {
    return color;
  }

  /**Setter method for color*/
  public void setColor(String color) {
    this.color = color;
  }

  /**Getter method for filled. Since filled is boolean,
     so, the get method name is isFilled*/
  public boolean isFilled() {
    return filled;
  }

  /**Setter method for filled*/
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /**Abstract method findArea*/
  public abstract double getArea();

  /**Abstract method getPerimeter*/
  public abstract double getPerimeter();

  //Abstract method to string
  public abstract String toString(); //returns a string description for the triangle.
}
