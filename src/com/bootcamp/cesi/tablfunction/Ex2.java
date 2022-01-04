package com.bootcamp.cesi.tablfunction;

import java.util.Arrays;
import java.util.Random;
public class Ex2 {
    public static void main(String[] args) {
        int[] tab1 = randomTabInt(10,1, 10);
        int[] tab2 = randomTabInt(10,1, 10);

        System.out.println("tab1");
        afficherTabInt(tab1);
        System.out.println("tab2");
        afficherTabInt(tab2);
        System.out.println("compare ...");
        afficherTabInt(compareTabInt(tab1, tab2));
    }

    public static void afficherTabInt(int [] tabInt){
        for(int ligne:tabInt){
            System.out.println(ligne);
        }
    }

    public static int[] randomTabInt(int taille,int min,int max){
        int[] tab = new int[taille];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = RandomInt(min, max);
        }
        return tab;
    }

    public static int[] compareTabInt(int[] tab1, int[] tab2){
        int[] compareResult = new int[0];
        /**
         *
         *
        if(tab1.length > tab2.length){
            int [] tabTemp = Arrays.copyOf(tab1, tab1.length);
            tab1 = tab2;
            tab2 = tabTemp;
        }
         */

        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab2.length; j++) {
                if((tab1[i] == tab2[j]) && !containsIntInTab(compareResult, tab1[i])){
                    compareResult = Arrays.copyOf(compareResult, compareResult.length + 1);
                    compareResult[compareResult.length - 1] = tab1[i];
                }
            }
        }

        return compareResult;
    }

    public static boolean containsIntInTab(int[] tab, int key){
        return Arrays.stream(tab).anyMatch(e -> e == key);
    }

    /**
     *
     * @param min
     * @param max
     * @return
     */
    public static int RandomInt(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
