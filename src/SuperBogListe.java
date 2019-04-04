import java.util.ArrayList;

public class SuperBogListe extends Bogliste{

    private ArrayList Liste;

    public SuperBogListe(ArrayList liste) {
        super(liste);
    }

    public void redigerBog(int bogNr, Bog bog){
        Liste.set(bogNr, bog);
    }
}