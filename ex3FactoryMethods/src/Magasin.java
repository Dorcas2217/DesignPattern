import java.util.HashMap;


public class Magasin {

  private FactoryStrategy factoryStrategy;
  private HashMap<Object, Article> bac = new HashMap<Object, Article>();

  public Magasin(FactoryStrategy factoryStrategy) {
    this.factoryStrategy = factoryStrategy;
  }

  public void ajouterArticle(String name, int anneeDeParution) {
    Article newArticle = factoryStrategy.createArticle(name, anneeDeParution);
    bac.put(name, newArticle);
  }

  public Article retourneArticle(String name) {
    return bac.get(name);
  }
}
