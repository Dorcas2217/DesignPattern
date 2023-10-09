public class FactoryLivre implements FactoryStrategy {

  @Override
  public Article createArticle(String name, int anneeDeParution) {
    return new Livre(name, anneeDeParution);
  }
}
