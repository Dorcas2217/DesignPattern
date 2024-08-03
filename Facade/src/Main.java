public class Main {

  public static void main(String[] args) {
    Amplificateur amp = new Amplificateur();
    LecteurDVD dvd = new LecteurDVD();
    Projecteur projecteur = new Projecteur();
    Lumières lumieres = new Lumières();

    HomeMovieFacade  homeMovieFacade = new HomeMovieFacade(amp, dvd, projecteur, lumieres);

    homeMovieFacade.regarderFilm("Inception");
    System.out.println();
    homeMovieFacade.terminerFilm();
  }
}