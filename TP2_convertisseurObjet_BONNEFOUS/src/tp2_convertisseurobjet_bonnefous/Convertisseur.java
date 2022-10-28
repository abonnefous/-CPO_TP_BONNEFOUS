/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_bonnefous;

/**
 *
 * @author alizeebonnefous
 */
public class Convertisseur {

    int nbConversions;

    public Convertisseur() {
        nbConversions = 0;
    }

    @Override
    public String toString() {
        return "nb de conversions" + nbConversions;
    }

    public double CelciusVersKelvin(double Celcius) {
        double Kelvin = Celcius + 273.15;
        nbConversions +=1;
        return Kelvin;
    }
             
    public double KelvinVersCelcuis(double Kelvin) {
        double Celcius = Kelvin - 273.15;
        nbConversions +=1;
        return Celcius;
    }
    
    public double FarenheitVersCelcius(double Farenheit) {
        double Celcius= (Farenheit-32)/1.8;
        nbConversions +=1;
        return Celcius;
    }
    public double CelciusVersFarenheit(double Celcius) {
        double Farenheit = (Celcius*1.8)+32;
        nbConversions +=1;
        return Farenheit;
    }
    public double FarenheitVersKelvin(double Farenheit) {
        double Kelvin = ((Farenheit-32)/1.8)+273.15;
        nbConversions +=1;
        return Kelvin;
    }
    public double KelvinVersFarenheit(double Kelvin) {
        double Farenheit = ((Kelvin-273.15)*1.8)-32;
        nbConversions +=1;
        return Farenheit;
    }
}
