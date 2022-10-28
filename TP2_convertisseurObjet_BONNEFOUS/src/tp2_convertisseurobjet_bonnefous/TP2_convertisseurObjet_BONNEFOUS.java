/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_bonnefous;

import java.util.Scanner;

/**
 *
 * @author alizeebonnefous
 */
public class TP2_convertisseurObjet_BONNEFOUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in); //coder un scanner qui permettra de rentrer la valeur de v à la main dans le Output  
        System.out.println("Rentrez une valeur de température");
        double T = sc.nextDouble();

        Convertisseur Convert1 = new Convertisseur();
        System.out.println(Convert1);

        Convertisseur Convert2 = new Convertisseur();
        double r = Convert2.CelciusVersFarenheit(T);
        System.out.println("la valeur de " + T + " celcius en farenheit est " + r);

        System.out.println(Convert2);
    }

}
