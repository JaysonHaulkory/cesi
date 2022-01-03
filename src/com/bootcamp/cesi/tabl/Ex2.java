package com.bootcamp.cesi.tabl;

public class Ex2 {
    public static void main(String[] args){
        int[] i = new int[10];
        for(int n=0;n < i.length;n++){
            i[n] = n+1;
        }

        for (int num:i){
            System.out.print(num);
        }
    }
}
