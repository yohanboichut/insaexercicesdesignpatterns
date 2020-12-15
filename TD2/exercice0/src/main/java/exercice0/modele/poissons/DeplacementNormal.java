package exercice0.modele.poissons;

public class DeplacementNormal implements ComportementDeplacement{
    private Poisson poisson;


    public DeplacementNormal(Poisson poisson) {
        this.poisson = poisson;

    }



    @Override
    public void deplacer() {
        if (this.poisson.getX() == 0 || this.poisson.getX() == this.poisson.getMare().getDimX()) {
            this.poisson.setSensDeplacement(this.poisson.getSensDeplacement() * -1);
        }
        this.poisson.setX(this.poisson.getX() + this.poisson.getSensDeplacement());

    }
}
