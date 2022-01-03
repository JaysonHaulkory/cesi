package com.bootcamp.cesi.boucles;

public class DoubleDemiSapin {
    public static void main(String[] args){
        String ligne;
        int a = 0;
        for(int i=10;i>0;i--){
            ligne="";
            for(int p = 0;p<-(i-10);p++){
                ligne+=" ";
            }
            for(int n = 0;n<i;n++){
                ligne+=a;
            }
            a++;
            System.out.println(ligne);
        }

        String ligne1;
        for(int x=0;x<10;x++){
            ligne1="";
            for(int y = 0;y<x;y++){
                if((y==0 || ((y+1)==x)) || x+1 == 10){
                    ligne1+="X";
                }else{
                    ligne1+="O";
                }
            }
            System.out.println(ligne1);
        }
    }
}
