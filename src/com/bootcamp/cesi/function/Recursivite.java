package com.bootcamp.cesi.function;

public class Recursivite {
    public static void main(String[] args) {
        System.out.println("Fin : " + decrementSiPlusGrandQueCinq(20));
    }

    public static int decrementSiPlusGrandQueCinq(int i){
        System.out.println(i);
        i--;
        if(i>5){
            i = decrementSiPlusGrandQueCinq(i);
        }
        System.out.println(i);
        return i;
    }
}
