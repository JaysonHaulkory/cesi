package com.bootcamp.cesi.tabl;

public class Ex7 {
    public static void main(String[] args){
        char tableau[] = new char[]{'L','A','V','A','L'};
        Boolean resultat = true;

        for(int i = 0 ; i < tableau.length ; i++){
            if(tableau[i] != tableau[(tableau.length - 1) - i]){
                resultat = false;
            }
        }
        System.out.println(resultat);
    }
}
