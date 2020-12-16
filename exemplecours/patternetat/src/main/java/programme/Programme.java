package programme;

import modele.Systeme;
import modele.SystemeImpl;

public class Programme {

    public static void main(String[] args) {
        Systeme systeme = new SystemeImpl();


        systeme.charger();

        systeme.pivoter();

        systeme.decharger();

        systeme.evacuer();

        systeme.pivoter();
    }
}
