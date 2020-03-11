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
            case 2:{dato = dato_aux;}break; //cm a cm
            case 3:{dato *= 10;}break; //cm a mm
            case 4:{dato /=160934;}break; //cm a mi
            case 5:{dato /= 91.44;}break; //cm a yd
            case 6:{dato /= 30.48;}break; //cm a ft
            case 7:{dato /= 2.54;}break; //cm a in
        }
        return dato;
    }
    
    public double conversorSuperficie(double dato, int destinoIndex){
        double dato_aux = dato;
        switch(destinoIndex){
            case 0:{dato /= 1000000;}break; //m^2 a km^2
            case 1:{dato /= 10000;}break; //m^2 a ha
            case 2:{dato = dato_aux;}break; //m^2 a m^2
            case 3:{dato /= 2590000;}break; //m^2 a mi^2
            case 4:{dato /= 4047;}break; //m^2 a acre
            case 5:{dato *= 10.764;}break; //m^2 a ft^2
            case 6:{dato *= 1550;}break; //m^2 a in^2
        }
        return dato;
    }
    
    public double conversorVolumen(double dato, int destinoIndex){
        double dato_aux = dato;
        switch(destinoIndex){
            case 0:{dato /= 1000;}break; //lt a m^3
            case 1:{dato = dato_aux;}break; //lt a lt
            case 2:{dato *= 1000;}break; //lt a cm^3
            case 3:{dato *= 1000;}break; //lt a ml
            case 4:{dato /= 158.99;}break; //lt a barril
            case 5:{dato /= 3.785;}break; //lt a gal
            case 6:{dato *= 2.113;}break; //lt a pt
            case 7:{dato *= 33.814;}break; //lt a oz
         }
        return dato;
    }
    
    public double conversorMasaPeso(double dato, int destinoIndex){
        double dato_aux = dato;
        switch(destinoIndex){
            case 0:{dato /= 1000000;}break; //g a t ** 
            case 1:{dato /= 1000;}break; //g a kg **
            case 2:{dato = dato_aux;}break; //g a g **
            case 3:{dato /= 907184.74;}break; //g a t corta **
            case 4:{dato /= 453.59;}break; //g a lb **
            case 5:{dato /= 28.35;}break; //g a oz **
        }
        return dato;
    }
    
    public double conversorVelocidad(double dato, int destinoIndex){
        double dato_aux = dato;
        switch(destinoIndex){
            case 0:{dato /= 1000;}break; //m/s a km/s **
            case 1:{dato = dato_aux;}break; //m/s a m/s **
            case 2:{dato *= 3.6;}break; //m/s a km/h **
            case 3:{dato /= 1609.34;}break; //m/s a mi/s **
            case 4:{dato *= 2.24;}break; //m/s a mph **
            case 5:{dato *= 3.28;}break; //m/s a ft/s **
            case 6:{dato *= 1.94;}break; //m/s a nudo **
        }
        return dato;
    }
    
    public double conversorTemeperatura(double dato, int destinoIndex){
        double dato_aux = dato;
        switch(destinoIndex){
            case 0:{dato = dato_aux;}break; //C° a C°
            case 1:{dato = (dato*1.8)+32;}break; //C° a F°
            case 2:{dato += 273.15;}break; //C° a K°
        }
        System.out.println(destinoIndex);
        return dato;
    }
    
}
