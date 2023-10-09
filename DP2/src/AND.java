public class AND implements  Strategy{
  public Strategy strategyA;
  public  Strategy strategyB;

  public AND(Strategy strategyA, Strategy strategyB) {
    this.strategyA = strategyA;
    this.strategyB = strategyB;
  }

  @Override
  public boolean imprimerMot(String s) {
    return strategyA.imprimerMot(s) && strategyB.imprimerMot(s);
  }
}
