package com.bootcamp.cesi.tabl;

public class Ex5 {
    public static void main(String[] args){
        int[] tab = new int[]{56,2,32,4,5};
        int temp = tab[0];


        for(int i = 0; i < tab.length;i++){
            if(i + 1  == tab.length){
                tab[i] = temp;
            }else{
                tab[i] = tab[i+1];
            }
        }
        for(int test:tab){
            System.out.println(test);
        }

    }
}
