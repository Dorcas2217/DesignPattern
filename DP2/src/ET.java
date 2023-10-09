public class ET implements Strategy{
  public Strategy [] strategies;

  public ET(Strategy... strategies) {
    this.strategies = strategies;
  }

  @Override
  public boolean imprimerMot(String s) {
    for( Strategy strategy : strategies){
      if(!strategy.imprimerMot(s)) return  false;
    }
    return true;
  }
}
