package com.bootcamp.cesi.tablfunction.Ex3;

import com.bootcamp.cesi.tablfunction.Ex2;

import java.util.Arrays;

public class A {
    public static void main(String[] args) {

        int[] tab = Ex2.randomTabInt(15,1,10);
        Ex2.afficherTabInt(tab);
        int rdn = Ex2.RandomInt(1, 10);

        int[] nbOccurencetab = nbOccurence(tab, rdn);

        if (nbOccurencetab.length == 0){
            System.out.println("La valeur entiere " + rdn + " n'a pas ete trouvee dans le tableau");
        }else{
        System.out.println("La valeur entiere " + rdn + " a ete trouvée : " + nbOccurencetab.length + " fois. Aux index suivant : ");
            Ex2.afficherTabInt(nbOccurencetab);
        }

    }

    public static int[] nbOccurence(int[] tab, int key){
        int[] index = new int[0];

        for (int i = 0; i < tab.length; i++) {
            if(key == tab[i]){
                index = Arrays.copyOf(index, index.length + 1);
                index[index.length - 1] = i;
            }
        }

        return index;
    }
}
