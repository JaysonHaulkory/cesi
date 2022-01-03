package com.bootcamp.cesi.boucles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Losange {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Largeur max du losange ?");
            int largeurMaxLos = Integer.parseInt(br.readLine());
            String ligne="";
            for(int i = 0 ;i<largeurMaxLos;i++){
                for(int p=0;p<largeurMaxLos;p++){
                    ligne+=" ";
                }
                System.out.println(ligne);
            }
        }catch(IOException e){

        }
    }

}
