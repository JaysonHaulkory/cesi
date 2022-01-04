package com.bootcamp.cesi.tablfunction.Ex3;

import com.bootcamp.cesi.tablfunction.Ex2;

import java.util.Arrays;

public class B {
    static int[] tab;
    public static void main(String[] args) {
        randomTabIntStatic(15, 1,10);

        Ex2.afficherTabInt(tab);
        int rdn = Ex2.RandomInt(1, 10);

        int[] nbOccurencetab = A.nbOccurence(tab, rdn);

        if (nbOccurencetab.length == 0){
            System.out.println("La valeur entiere " + rdn + " n'a pas ete trouvee dans le tableau");
        }else{
            System.out.println("La valeur entiere " + rdn + " a ete trouvée : " + nbOccurencetab.length + " fois. Aux index suivant : ");
            Ex2.afficherTabInt(nbOccurencetab);
        }
    }

    public static void randomTabIntStatic(int taille, int min, int max){
        int[] tabTemp = new int[taille];
        for (int i = 0; i < tabTemp.length; i++) {
            tabTemp[i] = Ex2.RandomInt(min, max);
        }
        tab = tabTemp;
    }
}
