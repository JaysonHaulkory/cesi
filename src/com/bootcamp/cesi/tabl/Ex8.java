package com.bootcamp.cesi.tabl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Ex8 {
    public static void main(String[] args){
        /**
         * Jeu du pendu
         *    |
         *    O
         *   \/
         *   |
         *  /\
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{

            String mot;
            int essaisRestant = 5;
            do{
                System.out.println("Player 1  : Entrez un mot (10 lettres max).");
                mot = br.readLine();
            }while(mot.length()>10);

            char[] MAD = new char[mot.length()];
            char[] RSLT = new char[mot.length()];

            char[] TRV = new char[0];

            char[] ETR = new char[0];

            for(int i = 0;i<mot.length();i++){
                MAD[i] = mot.toUpperCase().charAt(i);
                RSLT[i] = '_';
            }

            do {
                System.out.println("Player 2 : DEVINEZ !!");
                System.out.println("Il vous reste " + essaisRestant + " essai" + (essaisRestant > 1 ? "s" : "") + ".");
                for (int n = 0; n < RSLT.length; n++) {
                    System.out.print(RSLT[n] + " ");
                }
                System.out.print("Lettres deja entrées : ");
                for (int p = 0; p < ETR.length; p++) {
                    System.out.print(ETR[p] + " ");
                }
                System.out.print(" Lettres deja trouvées : ");
                for (int x = 0; x < TRV.length; x++) {
                    System.out.print(TRV[x] + " ");
                }
                char test;
                boolean contains = false;
                do {
                    System.out.println((contains ? "Veuillez entrer une lettre (différent des précédentes).":
                                                    "Veuillez entrer une lettre."));
                    test = br.readLine().toUpperCase().charAt(0);
                    contains = false;
                    for(char c : ETR){
                        if(c == test){
                            contains = true;
                            break;
                        }
                    }
                } while (contains);

                ETR = Arrays.copyOf(ETR, ETR.length + 1);
                ETR[ETR.length - 1] = test;

                boolean guess = false;
                boolean contains2 = false;
                for (int y = 0; y < MAD.length; y++) {
                    if (MAD[y] == test) {
                        RSLT[y] = test;
                        guess = true;
                        for(char e : TRV){
                            if(e == test){
                                contains2 = true;
                                break;
                            }
                        }
                        if(!contains2){
                            TRV = Arrays.copyOf(TRV, TRV.length + 1);
                            TRV[TRV.length - 1] = test;
                        }
                    }
                }
                if (!guess) {
                    essaisRestant--;
                }
                System.out.println("*************************************");
                if(essaisRestant<5){
                    System.out.println("   |");
                    if(essaisRestant<4){
                        System.out.println("   O");
                        if(essaisRestant<3){
                            System.out.println("  \\|/");
                            if(essaisRestant<2){
                                System.out.println("   |");
                                if(essaisRestant<1){
                                    System.out.println("  / \\");
                                }
                            }
                        }
                    }
                }
                System.out.println("*************************************");
            }while(essaisRestant > 0 & !(Arrays.equals(MAD, RSLT)));

            if(essaisRestant == 0){
                System.out.println("Vous avez perdu ! ");
            }else{
                System.out.println("Vous avez trouver le mot : " + mot);
            }



        }catch(IOException e){
            System.out.print(" Erreur : " + e.getMessage());
        }
    }
}
