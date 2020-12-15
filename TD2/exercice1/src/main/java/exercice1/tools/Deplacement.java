package exercice1.tools;

import exercice1.MoyenTransport;

public class Deplacement {

    private MoyenTransport moyenTransport;
    private int xDepart, yDepart, xArrivee,yArrivee;

    public Deplacement(MoyenTransport moyenTransport, int xDepart, int yDepart, int xArrivee, int yArrivee) {
        this.moyenTransport = moyenTransport;
        this.xDepart = xDepart;
        this.yDepart = yDepart;
        this.xArrivee = xArrivee;
        this.yArrivee = yArrivee;
    }

    public MoyenTransport getMoyenTransport() {
        return moyenTransport;
    }

    public int getxDepart() {
        return xDepart;
    }

    public int getyDepart() {
        return yDepart;
    }

    public int getxArrivee() {
        return xArrivee;
    }

    public int getyArrivee() {
        return yArrivee;
    }
}
