package com.bootcamp.cesi.tabl;
import java.lang.*;
import java.util.*;

public class Ex6 {
    public static void main(String[] args){
        int tab1[] = new int[]{2,4,8,11,4};
        int tab2[] = new int[]{1,5,3};
        int tab3[] = new int[0];

        for(int i = 0 ; i < tab2.length ; i++){
            for(int n = 0 ; n < tab1.length ; n++){
                tab3 = Arrays.copyOf(tab3, tab3.length + 1);
                tab3[tab3.length - 1] = tab1[n] * tab2[i];
            }
        }
    }
}
