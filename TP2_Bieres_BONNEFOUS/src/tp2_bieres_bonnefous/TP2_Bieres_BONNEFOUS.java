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
    BouteilleBiere uneBiere = new BouteilleBiere ("Cuvée des trolls",7.0,"Dubuisson");
    //BouteilleBiere uneBiere1 = new BouteilleBiere() ; 
    //uneBiere1.nom = "Cuvée des trolls";
    //uneBiere1.degreAlcool = 7.0 ;
    //uneBiere1.brasserie = "Dubuisson";
    //uneBiere1.ouverte = false;
    //uneBiere1.lireEtiquette();
   
    BouteilleBiere autreBiere1 = new BouteilleBiere ("Leffe",6.6,"Abbaye de Leffe");
    //BouteilleBiere uneBiere2 = new BouteilleBiere() ; 
    //uneBiere2.nom = "Leffe";
    //uneBiere2.degreAlcool = 6.6 ;
    //uneBiere2.brasserie = "Abbaye de Leffe";
    //uneBiere2.ouverte = false;
    //uneBiere2.lireEtiquette();
    
    BouteilleBiere autreBiere2 = new BouteilleBiere ("Kronembourg",4.2,"Obernai");
    
    BouteilleBiere autreBiere3 = new BouteilleBiere ("Heineken",5,"de L'Esperance");
    
    BouteilleBiere autreBiere4 = new BouteilleBiere ("1664",5.5,"Le Canon");
    
    BouteilleBiere autreBiere5 = new BouteilleBiere ("Corona extra",4.5,"Grupo Modelo");
     
    BouteilleBiere autreBiere6 = new BouteilleBiere ("Asahi",5,"Asahi");
      
    BouteilleBiere autreBiere7= new BouteilleBiere ("la Chouffe",8,"d'Achouffe");
    
    System.out.println(uneBiere);
    System.out.println(autreBiere1);
    System.out.println(autreBiere2);
    System.out.println(autreBiere3);
    System.out.println(autreBiere4);
    System.out.println(autreBiere5);
    System.out.println(autreBiere6);
    System.out.println(autreBiere7);
    }
    
}
