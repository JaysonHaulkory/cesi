package com.bootcamp.cesi.boucles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        int a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            do{
                System.out.println("Entrez un nombre entre 1 et 3 : ");
                a = Integer.parseInt(br.readLine());
            }while(a>3 || a<1);

            System.out.println("Vous avez enter : " + a);

        }catch(IOException e){

        }
    }
}
