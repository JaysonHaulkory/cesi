package com.bootcamp.cesi.hopital;

public class Patient {

    String nom;
    String prenom;
    int age;
    int id;

    public Patient(String nomPatient, String prenomPatient, int agePatient){
        nom = nomPatient;
        prenom = prenomPatient;
        age = agePatient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
