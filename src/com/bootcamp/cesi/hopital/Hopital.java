package com.bootcamp.cesi.hopital;

import java.util.Random;
import java.util.Scanner;

public class Hopital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] services = new String[]{"acceuil", "pneumologie", "radiologie", "cardiologie","traumatologie", "Externe"};
        String serviceProposer = services[0];

        System.out.println("Patient : Bonjour, j'ai mal ! ");

        System.out.println("Hopital : Quel votre nom ?");
        String nom = scan.nextLine();

        System.out.println("Hopital : Quel votre prenom ?");
        String prenom = scan.nextLine();

        System.out.println("Hopital : Quel votre age ?");
        int age = Integer.parseInt(scan.nextLine());

        Patient patient = new Patient(nom,prenom,age);

        System.out.println("Intensité de la douleur (1 - 5)");
        if(scan.nextInt() > 2){
            System.out.println("Vous etes entré au service " + services[2] + ".");
            Random random = new Random();
            int rdn = 0;
            do {
                rdn = random.nextInt(services.length - 1);
            }while (rdn == 0 || rdn == 2 || rdn == 5);

            System.out.println("Suite a l'examen en " + services[2] + " on va ou envoyer dans le service " + services[rdn]);
            System.out.println(certificatDeSortie(services[rdn], patient));

        }else{

            System.out.println("Allez au service " + services[5]);
            System.out.println(certificatDeSortie(services[5], patient));

        }

    }

    public static String certificatDeSortie(String service, Patient patientP){
        return "Le patient a été admis au service " + service + ". Vous avez été soigner, vous pouvez sortir. Mr : "
                + patientP.nom + " "  + patientP.prenom;
    }
}
