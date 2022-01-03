package com.bootcamp.cesi.boucles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {
    public static void main(String[] args){
        int a=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            do{
                System.out.println("a = "  + a + " Ajoutez un nombre : ");
                a += Integer.parseInt(br.readLine());
            }while(a<100);

            System.out.println(" fin a = " + a);

        }catch(IOException e){

        }
    }
}
