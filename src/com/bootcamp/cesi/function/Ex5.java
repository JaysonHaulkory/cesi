package com.bootcamp.cesi.function;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println(f(0));

        for (int i = 0; i < 20 ; i++) {
            System.out.println(f(i+1));
        }
    }

    public static int f( int x)
    {
        int valeur;
        valeur =  x * 3 + 1;
        return valeur;
    }

}
