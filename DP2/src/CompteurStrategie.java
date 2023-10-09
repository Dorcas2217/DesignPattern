public class CompteurStrategie implements Strategy{

  private int cpt;

  private  Strategy strategy;

  public CompteurStrategie( Strategy strategy) {
    this.cpt = 0;
    this.strategy = strategy;
  }


  @Override
  public boolean imprimerMot(String s) {
    boolean resp = strategy.imprimerMot(s);
    if(resp) {
      cpt ++;
    }
    return resp;

  }
}
