package com.bootcamp.cesi.boucles;

public class demiSapinNombre {
    public static void main(String[] args){


        String ligne;
        for(int i =0;i<10;i++){
            ligne="";
            for(int n = 0;n<=i;n++){
                ligne+=i;
            }
            System.out.println(ligne);
        }
    }
}
