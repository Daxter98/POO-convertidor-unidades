/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cu05.control;
import cu05.dao.ConversorDAO;
import javax.swing.ComboBoxModel;
import cu05.beans.ControlBeans;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author gem2u
 */
public class EntradaControl {
    public ControlBeans cb = new ControlBeans();
    public ConversorDAO conv = new ConversorDAO();
    public DecimalFormat formato = new DecimalFormat("#,###.0000");
    
    public void validarNumero(String numeroEntrada, int mainIndex){
        if(mainIndex == -1){
            JOptionPane.showMessageDialog(null, "Debe de elegir un tipo de conversion");
        }else{
            if(numeroEntrada == null || numeroEntrada.isEmpty()){
                JOptionPane.showMessageDialog(null, "El campo del numero esta vacio, debe llenarlo");
                numeroEntrada = " ";
                double numero = Double.parseDouble(numeroEntrada);
                cb.setNumero(numero);
            }else{
                double numero = Double.parseDouble(numeroEntrada);
                cb.setNumero(numero);
            }
        }
    }
    
    public void controlConversion(int tipoConversion){
        if(tipoConversion == 0){ //Para Longitud
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometro", "Metro", "Centímetro", "Milímetro", "Milla", "Yarda", "Pie", "Pulgada"});
           ComboBoxModel cbcadena2 = new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometro", "Metro", "Centímetro", "Milímetro", "Milla", "Yarda", "Pie", "Pulgada"});
           cb.setModelo(cbcadena);
           cb.setModelo2(cbcadena2);
        }
        if(tipoConversion == 1){ //Para Superficie
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] {  "Kilometro cuadrado", "Hectarea","Metro cuadrado", "Milla cuadrada", "Acre", "Pie cuadrado", "Pulgada cuadrada"});
           ComboBoxModel cbcadena2 = new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometro cuadrado", "Hectarea","Metro cuadrado", "Milla cuadrada", "Acre", "Pie cuadrado", "Pulgada cuadrada"});
           cb.setModelo(cbcadena);
           cb.setModelo2(cbcadena2);
        }
        if(tipoConversion == 2){ //Para Volumen
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] { "Metro cúbico", "Litro", "Decilitro", "Centímetro cúbico", "Mililitro", "Barril americano", "Galón americano", "Pinta americana", "Onza líquida americana"});
           ComboBoxModel cbcadena2 = new javax.swing.DefaultComboBoxModel<>(new String[] { "Metro cúbico", "Litro", "Decilitro", "Centímetro cúbico", "Mililitro", "Barril americano","Galón americano", "Pinta americana", "Onza líquida americana"});
           cb.setModelo(cbcadena);
           cb.setModelo2(cbcadena2);
        }
        if(tipoConversion == 3){ //Para Masa y Peso
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] { "Tonelada", "Kilogramo", "Gramo", "Tonelada corta", "Libra", "Onza"});
           ComboBoxModel cbcadena2 = new javax.swing.DefaultComboBoxModel<>(new String[] { "Tonelada", "Kilogramo", "Gramo", "Tonelada corta", "Libra", "Onza"});
           cb.setModelo(cbcadena);
           cb.setModelo2(cbcadena2);
        }
        if(tipoConversion == 4){ //Para Velocidad
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometros por segundo", "Metros por segundo", "Kilometros por hora", "Milla por segundo", "Milla por hora", "Pie por segundo", "Nudos"});
           ComboBoxModel cbcadena2 = new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometros por segundo","Metros por segundo", "Kiolometros por hora","Milla por segundo", "Milla por hora", "Pie por segundo", "Nudos"});
           cb.setModelo(cbcadena);
           cb.setModelo2(cbcadena2);
        }
        if(tipoConversion == 5){ //Para Temperatura
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin"});
           ComboBoxModel cbcadena2 = new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin"});
           cb.setModelo(cbcadena);
           cb.setModelo2(cbcadena2);
        }
    }
    
    public void validacionCampoEntrada(char validar, String numeroEntrada, int mainIndex){
        if(Character.isLetter(validar)){
           JOptionPane.showMessageDialog(null, "No debe de ingresar letras en el campo.");
           
        }
        if(Character.isSpaceChar(validar)){
            JOptionPane.showMessageDialog(null, "No debe de ingresar espacios en el campo."); 
        }
        if(validar == '.' && numeroEntrada.contains(".")){
            JOptionPane.showMessageDialog(null, "No debe ingresar dos puntos decimales.");
        }
        if(validar == '-' && mainIndex != 5){
            JOptionPane.showMessageDialog(null, "En este tipo de conversión, no puede ingresar números negativos");
        }
    }
    
    public void validarBaseyDestino(int mainIndex, int baseIndex, int destinoIndex){
        double dato = cb.getNumero();
        double respuesta = 0.0;
        String resultado = "";
        
        if(mainIndex == 0){ //Para Longitud
            switch(baseIndex){
                case 0:{dato *= 100000;}break;  //km a cm
                case 1:{dato *= 100;}break; //m a cm
                case 2:{dato = cb.getNumero();}break; //cm a cm
                case 3:{dato /= 10;}break; //mm a cm
                case 4:{dato *=160934;}break; //mi a cm
                case 5:{dato *= 91.44;}break; //yd a cm
                case 6:{dato *= 30.48;}break; //ft a cm
                case 7:{dato *= 2.54;}break; //in a cm
            }
            respuesta = conv.conversorLongitud(dato, destinoIndex);
            resultado = String.valueOf(formato.format(respuesta));
            cb.setResultado(resultado);
        }
        
        if(mainIndex == 1){ //Para Superficie
            switch(baseIndex){
                case 0:{dato *= 1000000;}break; //km^2 a m^2
                case 1:{dato *= 10000;}break; //ha a m^2
                case 2:{dato = cb.getNumero();}break; //m^2 a m^2
                case 3:{dato *= 2589987.83;}break; //mi^2 a m^2
                case 4:{dato *= 4047;}break; //acre a m^2
                case 5:{dato /= 10.764;}break; //ft^2 a m^2
                case 6:{dato /= 1550;}break; //in^2 a m^2
            }
            respuesta = conv.conversorSuperficie(dato, destinoIndex);
            resultado = String.valueOf(formato.format(respuesta));
            cb.setResultado(resultado);
        }
        
        if(mainIndex == 2){ //Para Volumen
            switch(baseIndex){
                case 0:{dato *= 1000;}break; //m^3 a lt **
                case 1:{dato = cb.getNumero();}break; //lt a lt **
                case 2:{dato /= 1000;}break; //cm^3 a lt  **
                case 3:{dato /= 1000;}break; //ml a lt
                case 4:{dato *= 158.99;}break; //barril a lt ** 
                case 5:{dato *= 3.785;}break; //gal a lt ** 
                case 6:{dato /= 2.113;}break; //pt a lt **
                case 7:{dato /= 33.814;}break; //oz a lt **
            }
            respuesta = conv.conversorVolumen(dato, destinoIndex);
            resultado = String.valueOf(formato.format(respuesta));
            cb.setResultado(resultado);
        }
        if(mainIndex == 3){ //Para masa y peso
            switch(baseIndex){
                case 0:{dato *= 1000000;}break; //t a g **
                case 1:{dato *= 1000;}break; //kg a g **
                case 2:{dato = cb.getNumero();}break; //g a g **
                case 3:{dato *= 907184.74;}break; //t corta a g **
                case 4:{dato *= 453.59;}break; //lb a g **
                case 5:{dato *= 28.35;}break; //oz a g **
            }
            respuesta = conv.conversorMasaPeso(dato, destinoIndex);
            resultado = String.valueOf(formato.format(respuesta));
            cb.setResultado(resultado);
        }
        if(mainIndex == 4){ //Para Velocidad
            switch(baseIndex){
                case 0:{dato *= 1000;}break; //km/s a m/s **
                case 1:{dato = cb.getNumero();}break; //m/s a m/s **
                case 2:{dato /= 3.6;}break; //km/h a m/s **
                case 3:{dato *= 1609.34;}break; //mi/s a m/s **
                case 4:{dato /= 2.24;}break; //mph a m/s **
                case 5:{dato /= 3.28;}break; //ft/s a m/s **
                case 6:{dato /= 1.94;}break; //nudo a m/s **
            }
            respuesta = conv.conversorVelocidad(dato, destinoIndex);
            resultado = String.valueOf(formato.format(respuesta));
            cb.setResultado(resultado);
        }
        if(mainIndex == 5){ //Para Temperatura
            switch(baseIndex){
                case 0:{dato = cb.getNumero();}break; //C° a C°
                case 1:{dato = (dato - 32)*(0.55556);}break; //F° a C°
                case 2:{dato -= 273.15;}break; //K° a C°
            }
            respuesta = conv.conversorTemeperatura(dato, destinoIndex);
            resultado = String.valueOf(formato.format(respuesta));
            cb.setResultado(resultado);
        }
    }
}
