package exercice0.programme;

import exercice0.facade.CompteurEtourdissements;
import exercice0.facade.CompteurMorts;
import exercice0.facade.FacadeMare;
import exercice0.modele.grenades.Grenade;
import exercice0.modele.grenades.GrenadeEtourdissante;
import exercice0.modele.grenades.GrenadeMortelle;

import static java.lang.Thread.sleep;


public class Programme {

    public static void main(String[] args) throws InterruptedException {


        FacadeMare facadeMare = new FacadeMare();
        CompteurMorts compteurMorts = facadeMare.getCompteur();
        CompteurEtourdissements compteurEtourdissements = facadeMare.getCompteurEtourdissements();
        facadeMare.creerMare(40,50,10);
        facadeMare.animerMare();
      //  sleep(1500);

        System.out.println("Nb poissons: "+ compteurMorts.getNbPoissons()+ " | Nb morts: "+ compteurMorts.getNbMorts());
        System.out.println("Nb poissons: "+ compteurEtourdissements.getNbPoissons()+ " | Nb étourdis: "+ compteurEtourdissements.getNbPoissonsEtourdis());

        Grenade grenade = new GrenadeEtourdissante(30,0,0);
        facadeMare.lancerGrenade(grenade);

        System.out.println("Nb poissons: "+ compteurMorts.getNbPoissons()+ " | Nb morts: "+ compteurMorts.getNbMorts());
        System.out.println("Nb poissons: "+ compteurEtourdissements.getNbPoissons()+ " | Nb étourdis: "+ compteurEtourdissements.getNbPoissonsEtourdis());


        grenade = new GrenadeMortelle(30,0,0);
        facadeMare.lancerGrenade(grenade);

        System.out.println("Nb poissons: "+ compteurMorts.getNbPoissons()+ " | Nb morts: "+ compteurMorts.getNbMorts());
        System.out.println("Nb poissons: "+ compteurEtourdissements.getNbPoissons()+ " | Nb étourdis: "+ compteurEtourdissements.getNbPoissonsEtourdis());


    }
}
