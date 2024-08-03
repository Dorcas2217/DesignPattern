public class HomeMovieFacade {
  private Amplificateur amp;
  private LecteurDVD dvd;
  private Projecteur projecteur;
  private Lumières lumieres;

  public HomeMovieFacade(Amplificateur amp, LecteurDVD dvd, Projecteur projecteur, Lumières lumieres) {
    this.amp = amp;
    this.dvd = dvd;
    this.projecteur = projecteur;
    this.lumieres = lumieres;
  }

  public void regarderFilm(String film) {
    System.out.println("Préparation pour regarder un film...");
    lumieres.dim(10);
    projecteur.on();
    projecteur.setInput("DVD");
    amp.on();
    amp.setVolume(5);
    dvd.on();
    dvd.play(film);
  }

  public void terminerFilm() {
    System.out.println("Extinction du home cinéma...");
    lumieres.dim(100);
    projecteur.off();
    amp.off();
    dvd.off();
  }
}
