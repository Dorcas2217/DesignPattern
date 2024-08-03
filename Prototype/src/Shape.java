public abstract class Shape implements Cloneable{

  public Shape clone() throws CloneNotSupportedException {
    Shape clone = (Shape) super.clone();
    return clone;
  }

}

