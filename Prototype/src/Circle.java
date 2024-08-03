public class Circle extends Shape implements Cloneable{
  public double radium;
  public String color;

  public Point point;

  public Circle(double radium, String color, Point point) {
    this.radium = radium;
    this.color = color;
    this.point = point;
  }

  public Circle clone() throws CloneNotSupportedException {
    Circle cercleClone = (Circle) super.clone();
    cercleClone.point = this.point.clone(); // Clonage du point : deep copy
    return cercleClone;
  }

  public double getRadium() {
    return radium;
  }

  public String getColor() {
    return color;
  }

  public void setRadium(double radium) {
    this.radium = radium;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Point getPoint() {
    return point;
  }

  @Override
  public String toString() {
    return "Circle{" +
        "radium=" + radium +
        ", color='" + color + '\'' +
        ", point=" + point +
        '}';
  }
}
