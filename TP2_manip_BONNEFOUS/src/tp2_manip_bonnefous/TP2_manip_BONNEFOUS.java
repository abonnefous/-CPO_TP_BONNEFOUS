/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_bonnefous;

/**
 *
 * @author alizeebonnefous
 */
public class TP2_manip_BONNEFOUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;
        // pour que assiette1 et assiette2 s'intarvertisse on a :        
        //assiette2 = assiette1 ;
        //assiette1 = assiette3 ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);       // il y a donc bien 3 tartiflettes avec 2 ayant le même nombre de calories
       
        Moussaka tab[] = new Moussaka[10]; // tableau de moussaka vide (pour l'instant de taille : 10 places
        for (int i = 0; i < 9; i++) { //bloucle
            Moussaka a = new Moussaka(); //cree des moussakas
            tab[i]=a; //le met dans le tableau
            System.out.println(tab[i]); //ppour comprendre et afficher le tableau
        }    
    }
        
    
}
    
