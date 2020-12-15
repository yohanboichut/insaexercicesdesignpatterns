package exercice1;

import exercice1.tools.Deplacement;

public class Main {


    public static void main(String[] args) throws DeplacementImpossible {
        Avion avion = new Avion();

        Velo velo = new Velo();

        Char monChar = new Char();


        Radar radar = new Radar();

        avion.enregistrerObservateur(radar);
        velo.enregistrerObservateur(radar);

        avion.deplacer(50,50);

        velo.deplacer(1,1);

        monChar.deplacer(3,4);


        for(Deplacement deplacement: radar.getDeplacementsEnregistres()) {
            System.out.println(deplacement.getMoyenTransport()+
                    "("+deplacement.getxDepart()+","+deplacement.getyDepart()+") -> ("+
                    deplacement.getxArrivee()+","+deplacement.getyArrivee()+")");
        }




    }
}
