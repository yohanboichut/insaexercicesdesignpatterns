package modele;

public class Programme {

    public static void main(String[] args) {
        Boisson cafe = new Sumatra();

        cafe = new Chocolat(cafe);

        cafe = new Chantilly(cafe);

        System.out.println("Prix total: "+cafe.getCout());

    }
}
