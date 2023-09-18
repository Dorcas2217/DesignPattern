import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class LecteurText {
    private List<Observer> observerList ;

    public LecteurText(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public void registerObserver(Observer observer){
       observerList.add(observer);
    }

    public void lireFichier(String file) throws IOException {
        BufferedReader lecteurAvecBuffer = null;
        String ligne;
        try {
            lecteurAvecBuffer = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println("Erreur d'ouverture");
        }
        while ((ligne = lecteurAvecBuffer.readLine()) != null) {
            for(Observer observer : observerList){
                observer.traiterLigne(ligne);
            }
        }

        for(Observer observer : observerList){
            int nbrLigneLue;

        }


        lecteurAvecBuffer.close();

    }
}
