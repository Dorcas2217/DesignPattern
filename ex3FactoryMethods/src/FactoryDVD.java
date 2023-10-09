public class FactoryDVD implements FactoryStrategy {

  @Override
  public Article createArticle(String name, int anneeDeParution) {
    return new DVD(name, anneeDeParution);
  }


}
