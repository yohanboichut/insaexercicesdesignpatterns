package modele;

public class AdapterCanard implements Animal{
    private Canard canard;

    public AdapterCanard(Canard canard) {
        this.canard = canard;
    }

    @Override
    public void deplacer() {
        this.canard.voler();
    }

    @Override
    public void crier() {
        this.canard.cancaner();
    }
}
