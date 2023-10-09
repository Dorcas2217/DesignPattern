public class NOT implements Strategy{

  public Strategy strategy;
  public NOT(Strategy strategy) {
    this.strategy = strategy;
  }

  @Override
  public boolean imprimerMot(String s) {
    return !strategy.imprimerMot(s);
  }


}
