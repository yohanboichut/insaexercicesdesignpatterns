package modele;

public class JeuMain {
    public static void main(String[] args) {
        ; /* un certain type de manette
         */

        Clavier clavier = new Clavier();
        Jeu jeu = new Jeu(new ClavierAdapter(clavier));
        jeu.mainLoop();
    }
}