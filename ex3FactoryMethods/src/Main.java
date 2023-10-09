public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");
    FactoryStrategy factoryDVD = new FactoryDVD();
    FactoryStrategy factoryLivre = new FactoryLivre();
    Magasin magasinLivre  = new Magasin(factoryLivre);
    Magasin magasinDVD  = new Magasin(factoryDVD);

    magasinLivre.ajouterArticle("super art", 1900);
    magasinLivre.ajouterArticle("livre 2",1890);
    magasinDVD.ajouterArticle("dvd1", 1800);
    magasinDVD.ajouterArticle("dvd2", 1800);


  }
}