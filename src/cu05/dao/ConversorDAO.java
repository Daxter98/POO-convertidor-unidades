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
            case 0:{dato /= 1000;}break; //lt a m^3
            case 1:{dato /= 100;}break; //lt a hec
            case 2:{dato /= 10;}break; //lt a deca
            case 3:{dato /= 1;}break; //lt a dm^3
            case 4:{dato = dato_aux;}break; //lt a lt
            case 5:{dato *= 10;}break; //lt a dec
            case 6:{dato *= 100;}break; //lt a cen
            case 7:{dato *= 1000;}break; //lt a cm^3
            case 8:{dato /= 158.99;}break; //lt a barril
            case 9:{dato /= 28.317;}break; //lt a ft^3
            case 10:{dato /= 3.785;}break; //lt a gal
            case 11:{dato *= 1.057;}break; //lt a qt
            case 12:{dato *= 2.113;}break; //lt a pt
            case 13:{dato *= 8.45;}break; //lt a agalla
            case 14:{dato *= 33.814;}break; //lt a oz
            case 15:{dato *= 61.024;}break; //lt a in^3
         }
        return dato;
    }
    
    public double conversorMasaPeso(double dato, int destinoIndex){
        double dato_aux = dato;
        switch(destinoIndex){
            case 0:{dato /= 1000000;}break; //g a t
            case 1:{dato /= 101971.6;}break; //g a kN
            case 2:{dato /= 1000;}break; //g a kg
            case 3:{dato /= 100;}break; //g a hg
            case 4:{dato = dato_aux;}break; //g a g
            case 5:{dato *= 5;}break; //g a quilate
            case 6:{dato *= 100;}break; //g centigramo
            case 7:{dato *= 1000;}break; //g a miligramo
            case 8:{dato *= 1000000;}break; //g a microgramo
            case 9:{dato /= 1016046.91;}break; //g a t larga
            case 10:{dato /= 907184.74;}break; //g a t corta
            case 11:{dato /= 50802.35;}break; //g a quintal largo
            case 12:{dato /= 45359.24;}break; //g a quintal corto
            case 13:{dato /= 6350.29;}break; //g a piedra
            case 14:{dato /= 453.59;}break; //g a lb
            case 15:{dato /= 28.35;}break; //g a oz
        }
        return dato;
    }
    
    public double conversorVelocidad(double dato, int destinoIndex){
        double dato_aux = dato;
        switch(destinoIndex){
            case 0:{dato /= 1000;}break; //m/s a km/s 
            case 1:{dato = dato_aux;}break; //m/s a m/s
            case 2:{dato *= 3.6;}break; //m/s a km/h
            case 3:{dato *= 1000;}break; //m/s a mm/s
            case 4:{dato *= 1000000;}break; //m/s a microm/s
            case 5:{dato /= 1609.34;}break; //m/s a mi/s
            case 6:{dato *= 2.24;}break; //m/s a mph
            case 7:{dato *= 3.28;}break; //m/s a ft/s
            case 8:{dato *= 1.94;}break; //m/s a nudo
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
