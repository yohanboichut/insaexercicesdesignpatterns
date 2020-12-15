package exercice1;

public interface Observateur {

    void notifierDeplacement(MoyenTransport moyenTransport,
                             int xDepart, int yDepart,int xArrivee, int yArrivee);

}
