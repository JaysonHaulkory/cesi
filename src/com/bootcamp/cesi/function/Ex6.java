package com.bootcamp.cesi.function;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println(calcul(10));
        System.out.println(calcul(10.5));
        System.out.println(calcul(10, 20));
    }

    public static int calcul(int x){
        return x + 2;
    }

    public static double calcul(double x){
        return x - 3;
    }

    public static int calcul(int x, int y){
        return calcul(x) * y;
    }

}
