/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cu05.dao;
/**
 *
 * @author gem2u
 */
public class ConversorDAO {
    public double conversorLongitud(double dato, int destinoIndex){
        double dato_aux = dato;
        switch(destinoIndex){
            case 0:{dato /= 100000;}break;//cm a km
            case 1:{dato /= 100;}break;   //cm a m
            case 2:{dato /= 10;}break; //cm a dm
            case 3:{dato = dato_aux;}break; //cm a cm
            case 4:{dato *= 10;}break; //cm a mm
            case 5:{dato /=160934;}break; //cm a mi
            case 6:{dato /= 91.44;}break; //cm a yd
            case 7:{dato /= 30.48;}break; //cm a ft
            case 8:{dato /= 2.54;}break; //cm a in
        }
        return dato;
    }
    
    public double conversorSuperficie(double dato, int destinoIndex){
        double dato_aux = dato;
        switch(destinoIndex){
            case 0:{dato /= 1000000;}break; //m^2 a km^2
            case 1:{dato /= 10000;}break; //m^2 a ha
            case 2:{dato /= 100;}break; //m^2 -> a
            case 3:{dato = dato_aux;}break; //m^2 a m^2
            case 4:{dato *= 100;}break; //m^2 a dm^2
            case 5:{dato *= 10000;}break; //m^2 a cm^2
            case 6:{dato *= 1000000;}break; //m^2 a mm^2
            case 7:{dato /= 2590000;}break; //m^2 a mi^2
            case 8:{dato /= 4047;}break; //m^2 a acre
            case 9:{dato *= 1.196;}break; //m^2 a yd^2
            case 10:{dato *= 10.764;}break; //m^2 a ft^2
            case 11:{dato *= 1550;}break; //m^2 a in^2
        }
        return dato;
    }
    
    public double conversorVolumen(double dato, int destinoIndex){
        double dato_aux = dato;
        switch(destinoIndex){
            case 0:{dato /= 1000;}break; //m^3 a lt
            case 1:{dato /= 100;}break; //hec a lt
            case 2:{dato /= 10;}break; //deca a lt
            case 3:{dato /= 1;}break; //dm^3 a lt
            case 4:{dato = dato_aux;}break; //lt a lt
            case 5:{dato *= 10;}break; //dec a lt
            case 6:{dato *= 100;}break; //cen a lt
            case 7:{dato *= 1000;}break; //cm^3 a lt
            case 8:{dato /= 163.65;}break; //barril a lt
            case 9:{dato /= 28.32;}break; //ft^3 a lt
            case 10:{dato /= 4.55;}break; //gal a lt
            case 11:{dato /= 1.44;}break; //qt a lt
            case 12:{dato /= 0.57;}break; //pt a lt
            case 13:{dato /= 0.12;}break; //agalla a lt
            case 14:{dato /= 0.03;}break; //oz a lt
            case 15:{dato /= 0.02;}break; //in^3 a lt
        }
        return dato;
    }
    
}
