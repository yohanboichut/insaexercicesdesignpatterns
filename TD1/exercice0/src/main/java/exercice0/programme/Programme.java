package exercice0.programme;

import exercice0.facade.FacadeMare;
import exercice0.modele.grenades.Grenade;
import exercice0.modele.grenades.GrenadeEtourdissante;
import exercice0.modele.grenades.GrenadeMortelle;

import static java.lang.Thread.sleep;


public class Programme {

    public static void main(String[] args) throws InterruptedException {


        FacadeMare facadeMare = new FacadeMare();
        facadeMare.creerMare(40,50,3);
        facadeMare.animerMare();
      //  sleep(1500);

        Grenade grenade = new GrenadeEtourdissante(200,10,10);
        facadeMare.lancerGrenade(grenade);
        System.out.println("Toujours effet ??");
        sleep(1500);

        System.out.println("Toujours effet ??");








    }
}
