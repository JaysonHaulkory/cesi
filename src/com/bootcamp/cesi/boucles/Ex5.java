package com.bootcamp.cesi.boucles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int a;
            do{
                System.out.println("Entrez un nombre entre 10 et 20 : ");
                a = Integer.parseInt(br.readLine());
                if(a<10){
                    System.out.println("Plus grand!");
                }else if(a>20){
                    System.out.println("Plus petit!");
                }else{
                    System.out.println("Parfait! " + a);
                }
            }while(a>20 || a<10);

        }catch(IOException e){

        }
    }
}
