public abstract class Shape implements Cloneable{

  public Shape clone() throws CloneNotSupportedException {
    return (Shape) super.clone();
  }

}

