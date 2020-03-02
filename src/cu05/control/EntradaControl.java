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
    public DecimalFormat formato = new DecimalFormat("#.0000000000");
    
    public void validarNumero(String numeroEntrada){
      if(numeroEntrada == null || numeroEntrada.isEmpty()){
          JOptionPane.showMessageDialog(null, "El campo del numero esta vacio, debe llenarlo");
      }else{
          double numero = Double.parseDouble(numeroEntrada);
          cb.setNumero(numero);
      }
    }
    
    public void controlConversion(int tipoConversion){
        if(tipoConversion == 0){ //Para Longitud
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometro", "Metro", "Decímetro", "Centímetro", "Milímetro", "Milla", "Yarda", "Pie", "Pulgada"});
           ComboBoxModel cbcadena2 = new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometro", "Metro", "Decímetro", "Centímetro", "Milímetro", "Milla", "Yarda", "Pie", "Pulgada"});
           cb.setModelo(cbcadena);
           cb.setModelo2(cbcadena2);
        }
        if(tipoConversion == 1){ //Para Superficie
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometro cuadrado", "Hectarea", "Area", "Metro cuadrado", "Decimetro cuadrado", "Centímetro cuadrado", "Milimetro cuadrado", "Milla cuadrada", "Acre", "Yarda cuadrada", "Pie cuadrado", "Pulgada cuadrada"});
           ComboBoxModel cbcadena2 = new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometro cuadrado", "Hectarea", "Area", "Metro cuadrado", "Decimetro cuadrado", "Centímetro cuadrado", "Milimetro cuadrado","Milla cuadrada", "Acre", "Yarda cuadrada", "Pie cuadrado", "Pulgada cuadrada"});
           cb.setModelo(cbcadena);
           cb.setModelo2(cbcadena2);
        }
        if(tipoConversion == 2){ //Para Volumen
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] { "Metro cúbico", "Hectolitro", "Decalitro", "Decímetro", "Litro", "Decilitro", "Centilitro", "Centímetro cúbico", "Barril americano", "Pie cúbico", "Galón americano", "Cuarto de galón americano", "Pinta americana", "Agalla", "Onza líquida americana", "Pulgada cúbica"});
           ComboBoxModel cbcadena2 = new javax.swing.DefaultComboBoxModel<>(new String[] { "Metro cúbico", "Hectolitro", "Decalitro", "Decímetro", "Litro", "Decilitro", "Centilitro", "Centímetro cúbico", "Barril americano", "Pie cúbico", "Galón americano", "Cuarto de galón americano", "Pinta americana", "Agalla", "Onza líquida americana", "Pulgada cúbica"});
           cb.setModelo(cbcadena);
           cb.setModelo2(cbcadena2);
        }
        if(tipoConversion == 3){ //Para Masa y Peso
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] { "Tonelada", "Kilonewton","Kilogramo", "Hectogramo", "Gramo", "Quilate", "Centigramo", "Miligramo", "Microgramo", "Tonelada larga", "Tonelada corta", "Quintal largo", "Quintal corto", "Piedra", "Libra", "Onza"});
           ComboBoxModel cbcadena2 = new javax.swing.DefaultComboBoxModel<>(new String[] { "Tonelada", "Kilonewton","Kilogramo", "Hectogramo", "Gramo", "Quilate", "Centigramo", "Miligramo", "Microgramo", "Tonelada larga", "Tonelada corta", "Quintal largo", "Quintal corto", "Piedra", "Libra", "Onza"});
           cb.setModelo(cbcadena);
           cb.setModelo2(cbcadena2);
        }
        if(tipoConversion == 4){ //Para Velocidad
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometros por segundo", "Metros por segundo", "Milimetro por segundo", "Micrometro por segundo", "Milla por segundo", "Milla por hora", "Pie por segundo", "Nauticos", "Nudos"});
           ComboBoxModel cbcadena2 = new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometros por segundo", "Metros por segundo", "Milimetro por segundo", "Micrometro por segundo", "Milla por segundo", "Milla por hora", "Pie por segundo", "Nauticos", "Nudos"});
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
    
    public void validacionCampoEntrada(char validar, String numeroEntrada){
        
        if(Character.isLetter(validar)){
           JOptionPane.showMessageDialog(null, "No debe de ingresar letras en el campo."); 
        }
        if(Character.isSpaceChar(validar)){
            JOptionPane.showMessageDialog(null, "No debe de ingresar espacios en el campo."); 
        }
        if(validar == '.' && numeroEntrada.contains(".")){
            JOptionPane.showMessageDialog(null, "No debe ingresar dos puntos decimales.");
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
                case 2:{dato *= 10;}break; //dm a cm
                case 3:{dato = cb.getNumero();}break; //cm a cm
                case 4:{dato /= 10;}break; //mm a cm
                case 5:{dato *=160934;}break; //mi a cm
                case 6:{dato *= 91.44;}break; //yd a cm
                case 7:{dato *= 30.48;}break; //ft a cm
                case 8:{dato *= 2.54;}break; //in a cm
            }
            respuesta = conv.conversorLongitud(dato, destinoIndex);
            resultado = String.valueOf(formato.format(respuesta));
            cb.setResultado(resultado);
        }
        
        if(mainIndex == 1){ //Para Superficie
            switch(baseIndex){
                case 0:{dato *= 1000000;}break; //km^2 a m^2
                case 1:{dato *= 10000;}break; //ha a m^2
                case 2:{dato *= 100;}break; //a -> m^2
                case 3:{dato = cb.getNumero();}break; //m^2 a m^2
                case 4:{dato /= 100;}break; //dm^2 a m^2
                case 5:{dato /= 10000;}break; //cm^2 a m^2
                case 6:{dato /= 1000000;}break; //mm^2 a m^2
                case 7:{dato *= 2589987.83;}break; //mi^2 a m^2
                case 8:{dato *= 4047;}break; //acre a m^2
                case 9:{dato /= 1.196;}break; //yd^2 a m^2
                case 10:{dato /= 10.764;}break; //ft^2 a m^2
                case 11:{dato /= 1550;}break; //in^2 a m^2
            }
            respuesta = conv.conversorSuperficie(dato, destinoIndex);
            resultado = String.valueOf(formato.format(respuesta));
            cb.setResultado(resultado);
        }
        
        if(mainIndex == 2){ //Para Volumen
            switch(baseIndex){
                case 0:{dato *= 1000;}break; //m^3 a lt
                case 1:{dato *= 100;}break; //hec a lt
                case 2:{dato *= 10;}break; //deca a lt
                case 3:{dato *= 1;}break; //dm^3 a lt
                case 4:{dato = cb.getNumero();}break; //lt a lt
                case 5:{dato /= 10;}break; //dec a lt
                case 6:{dato /= 100;}break; //cen a lt
                case 7:{dato /= 1000;}break; //cm^3 a lt
                case 8:{dato *= 158.99;}break; //barril a lt
                case 9:{dato *= 28.317;}break; //ft^3 a lt
                case 10:{dato *= 3.785;}break; //gal a lt
                case 11:{dato /= 1.057;}break; //qt a lt
                case 12:{dato /= 2.113;}break; //pt a lt
                case 13:{dato /= 8.45;}break; //agalla a lt
                case 14:{dato /= 33.814;}break; //oz a lt
                case 15:{dato /= 61.024;}break; //in^3 a lt
            }
            respuesta = conv.conversorVolumen(dato, destinoIndex);
            resultado = String.valueOf(formato.format(respuesta));
            cb.setResultado(resultado);
        }
        if(mainIndex == 3){ //Para masa y peso
            switch(baseIndex){
                case 0:{dato *= 1000000;}break; //t a g
                case 1:{dato *= 101971.6;}break; //kN a g
                case 2:{dato *= 1000;}break; //kg a g
                case 3:{dato *= 100;}break; //hg a g
                case 4:{dato = cb.getNumero();}break; //g a g
                case 5:{dato /= 5;}break; //quilate a g
                case 6:{dato /= 100;}break; //centigramo a g
                case 7:{dato /= 1000;}break; //mg a g
                case 8:{dato /= 1000000;}break; //microg a g
                case 9:{dato *= 1016046.91;}break; //t larga a g
                case 10:{dato *= 907184.74;}break; //t corta a g
                case 11:{dato *= 50802.35;}break; //quintal largo a g
                case 12:{dato *= 45359.24;}break; //quintal corto a g
                case 13:{dato *= 6350.29;}break; //piedra a g
                case 14:{dato *= 453.59;}break; //lb a g
                case 15:{dato *= 28.35;}break; //oz a g
            }
            respuesta = conv.conversorMasaPeso(dato, destinoIndex);
            resultado = String.valueOf(respuesta);
            cb.setResultado(resultado);
        }
    }
}
