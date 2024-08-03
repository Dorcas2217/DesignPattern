public class Circle extends Shape {
  public double radium;
  public String color;

  public Circle(double radium, String color) {
    this.radium = radium;
    this.color = color;
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

  @Override
  public Circle clone() throws CloneNotSupportedException {
    return (Circle) super.clone();
  }

  @Override
  public String toString() {
    return "Circle{" +
        "radium=" + radium +
        ", color='" + color + '\'' +
        '}';
  }
}
