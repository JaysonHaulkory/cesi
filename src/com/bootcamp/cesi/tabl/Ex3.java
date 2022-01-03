package com.bootcamp.cesi.tabl;

public class Ex3 {
    public static void main(String[] args){
        double i[] = new double[10];
        for(int n = 0;n<i.length;n++){
            i[n] = Math.random()*10;
        }
        double somme=0;
        double max=0;
        for(double nb:i) {
            somme += nb;
            if(max<nb){
                max = nb;
            }
            System.out.println(nb);
        }
        System.out.println("Somme : " + somme + " Moyenne : " + somme/i.length + " nb max :" + max);

    }
}
