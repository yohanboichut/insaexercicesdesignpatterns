package exercice1;

import exercice1.tools.Deplacement;

import java.util.ArrayList;
import java.util.List;

public class Radar implements Observateur {

    private List<Deplacement> deplacementsEnregistres;

    public Radar() {
        this.deplacementsEnregistres = new ArrayList<>();
    }


    @Override
    public void notifierDeplacement(MoyenTransport moyenTransport, int xDepart, int yDepart, int xArrivee, int yArrivee) {

        this.deplacementsEnregistres.add(new Deplacement(moyenTransport, xDepart, yDepart, xArrivee, yArrivee));
    }

    public List<Deplacement> getDeplacementsEnregistres() {
        return deplacementsEnregistres;
    }
}
