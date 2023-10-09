public class OR implements Strategy{

  public Strategy strategy1;
  public  Strategy strategy2;

  public OR(Strategy strategy1, Strategy strategy2) {
    this.strategy1 = strategy1;
    this.strategy2 = strategy2;
  }


  @Override
  public boolean imprimerMot(String s) {
    return strategy1.imprimerMot(s) || strategy2.imprimerMot(s);
  }
}
