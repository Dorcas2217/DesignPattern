public class Ou implements Strategy{
  public Strategy [] strategies;

  public Ou(Strategy... strategies) {
    this.strategies = strategies;
  }
  @Override
  public boolean imprimerMot(String s) {
    for( Strategy strategy : strategies){ // si une réussi alors c'est vrai donc on renvoie true - gabriel...
      if(strategy.imprimerMot(s)) return  true;
    }
    return false;
  }
}
