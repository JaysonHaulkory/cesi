package com.bootcamp.cesi.tabl;

public class Ex4 {
    public static void main(String[] args){
        String tab1[] = new String[]{"Bonjour ","bienve","dans le ","de la programmation "};
        String tab2[] = new String[]{"tout le monde ","nue","monde ", "java"};
        String tab3[] = new String[4];

        for(int i = 0; i < tab1.length;i++){
            tab3[i] = tab1[i] + tab2[i];
        }
        for(String test:tab3){
            System.out.println(test);
        }
    }
}
