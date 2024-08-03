public class Main {

  public static void main(String[] args) throws CloneNotSupportedException {
    Point point = new Point(5,6);
    Circle originalCircle = new Circle(5,"red", point);
    System.out.println("Original: " + originalCircle);

    // Clonage du cercle
    Circle clonedCircle =  originalCircle.clone();
    System.out.println("Clone: " + clonedCircle);

    // Modifier le clone pour vérifier qu'il est indépendant de l'original
    originalCircle.setRadium(10);
    originalCircle.setColor("blue");

    System.out.println("Modified Clone: " + clonedCircle);
    System.out.println("Original after clone modification: " + originalCircle);
  }
}