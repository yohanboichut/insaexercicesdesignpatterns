package modele;


public class ClavierAdapter implements Manette {

    private Clavier clavier;

    public ClavierAdapter(Clavier clavier) {
        this.clavier = clavier;
    }

    @Override
    public boolean isLeft() {

        return clavier.keyPressed() == Clavier.Key.ARROW_LEFT;
    }

    @Override
    public boolean isRight() {
        return clavier.keyPressed() == Clavier.Key.ARROW_RIGHT;
    }

    @Override
    public boolean isPush() {
        return clavier.keyPressed() == Clavier.Key.SPACEBAR;
    }
}
