/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_bonnefous;

/**
 *
 * @author alizeebonnefous
 */
public class TP2_Bieres_BONNEFOUS { // cuisine,ingrédients

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    BouteilleBiere uneBiere1 = new BouteilleBiere() ; 
    uneBiere1.nom = "Cuvée des trolls";
    uneBiere1.degreAlcool = 7.0 ;
    uneBiere1.brasserie = "Dubuisson";
    uneBiere1.ouverte = false;
    uneBiere1.lireEtiquette();
   
    BouteilleBiere uneBiere2 = new BouteilleBiere() ; 
    uneBiere2.nom = "Leffe";
    uneBiere2.degreAlcool = 6.6 ;
    uneBiere2.brasserie = "Abbaye de Leffe";
    uneBiere2.ouverte = false;
    uneBiere2.lireEtiquette();
    }
    
}
