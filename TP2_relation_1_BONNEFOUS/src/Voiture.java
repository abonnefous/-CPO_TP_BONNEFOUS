/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alizeebonnefous
 */
public class Voiture {
    String Modele;
    String Marque;
    Personne Proprietaire = null;
    int PuissanceCV;//on cree les variables
    
    public Voiture (String unModele, String uneMarque, int unePuissanceCV){
        Modele = unModele; // affectation du nom à l'objet
        Marque = uneMarque;
        PuissanceCV = unePuissanceCV;
        //Proprietaire = this;
    }
    @Override
    public String toString() {
        String chaine;
        chaine = "\n" +"Modele: " + Modele + "\n" + " Marque: " + Marque + "\n" +" PuissanceCV: " + PuissanceCV;
        return chaine;
    }
}


