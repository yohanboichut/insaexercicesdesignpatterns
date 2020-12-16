package modele.etats;

import modele.OperationImpossibleException;
import modele.Systeme;

public abstract class EtatSysteme {

    private Systeme systeme;

    public Systeme getSysteme() {
        return systeme;
    }

    public EtatSysteme(Systeme systeme) {
        this.systeme = systeme;
    }

    public EtatSysteme charger(){
        throw new OperationImpossibleException();
    }

    public EtatSysteme decharger(){
        throw new OperationImpossibleException();
    }

    public EtatSysteme evacuer(){
        throw new OperationImpossibleException();
    }

    public EtatSysteme pivoter(){
        throw new OperationImpossibleException();
    }

}
