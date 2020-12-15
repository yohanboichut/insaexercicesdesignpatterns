package modele;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        ElementB elementB1 = new ElementB(Arrays.<Element>asList(new ElementA(),new ElementC()));


        Element elementB2= new  ElementB(Arrays.<Element>asList(elementB1,new ElementC()));


        VisiteurElementConstructionString v = new VisiteurElementConstructionString();

        elementB2.accept(v);

        System.out.println(v.getResultat());

      //  "elementB(elementB(elementA,elementC),elementC)"





    }
}
