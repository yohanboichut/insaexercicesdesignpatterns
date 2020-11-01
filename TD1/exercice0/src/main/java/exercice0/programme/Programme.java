package exercice0.programme;

import exercice0.facade.FacadeMare;

import static java.lang.Thread.sleep;


public class Programme {

    public static void main(String[] args) throws InterruptedException {


        FacadeMare facadeMare = new FacadeMare();
        facadeMare.creerMare(40,50,3);
        facadeMare.animerMare();
        sleep(1500);
        facadeMare.gelerMare();
        System.out.println("La exercice0.mare\n---------------------");
        facadeMare.getMaMare().stream().forEach(e -> System.out.println(e));
        facadeMare.animerMare();
        sleep(1500);
        facadeMare.gelerMare();

        System.out.println("La exercice0.mare\n---------------------");
        facadeMare.getMaMare().stream().forEach(e -> System.out.println(e));

    }
}
