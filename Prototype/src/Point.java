/**
 * I create this class just for highlight deep copy
 */
class Point implements Cloneable {
  int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public Point clone() {
    try {
      return (Point) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public String toString() {
    return "Point{" +
        "x=" + x +
        ", y=" + y +
        '}';
  }
}