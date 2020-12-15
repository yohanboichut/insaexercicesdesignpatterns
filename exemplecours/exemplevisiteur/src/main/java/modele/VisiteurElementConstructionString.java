package modele;

public class VisiteurElementConstructionString implements Visiteur{
   private String resultat="";

    public String getResultat() {
        return resultat;
    }

    @Override
    public void visit(ElementA elementA) {
        resultat = "elementA";
    }

    @Override
    public void visit(ElementB elementB) {
        resultat = elementB.getElements().size()>0 ? "elementB(":"elementB";

        for(Element e : elementB.getElements()) {
            VisiteurElementConstructionString v = new VisiteurElementConstructionString();
            e.accept(v);
            resultat+= v.getResultat()+",";

        }

        if (elementB.getElements().size() > 0) {
            resultat = resultat.substring(0,resultat.length()-1)+")";
        }

    }

    @Override
    public void visit(ElementC elementC) {
        resultat = "elementC";
    }
}
