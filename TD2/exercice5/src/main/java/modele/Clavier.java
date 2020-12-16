package modele;

public class Clavier {

    private Key toucheCourante;

    public enum Key { SPACEBAR, ARROW_LEFT, ARROW_RIGHT };
    public Clavier() { /* constructeur */ }

    public void hitKey(Key k) {
        this.toucheCourante = k;
    }
    public Key keyPressed() { /* retourne le type de la touche */
        return toucheCourante;
    }
    /* etc */
}