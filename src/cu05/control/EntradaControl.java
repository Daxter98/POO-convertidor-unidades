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

/**
 *
 * @author gem2u
 */
public class EntradaControl {
    public ControlBeans cb = new ControlBeans();
    public ConversorDAO conv = new ConversorDAO();
    
    public void validarNumero(String numeroEntrada){
      if(numeroEntrada == null || numeroEntrada.isEmpty()){
          JOptionPane.showMessageDialog(null, "El campo del numero esta vacio, debe llenarlo");
      }else{
          double numero = Double.parseDouble(numeroEntrada);
          cb.setNumero(numero);
      }
    }
    
    public void controlConversion(String tipoConversion){
        if(tipoConversion == "Longitud"){
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometro", "Metro", "Decímetro", "Centímetro", "Milímetro", "Milla", "Yarda", "Pie", "Pulgada"});
           ComboBoxModel cbcadena2 = new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometro", "Metro", "Decímetro", "Centímetro", "Milímetro", "Milla", "Yarda", "Pie", "Pulgada"});
           cb.setModelo(cbcadena);
           cb.setModelo2(cbcadena2);
        }
        if(tipoConversion == "Superficie"){
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometro cuadrado", "Hectarea", "Metro cuadrado", "Decimetro cuadrado", "Centímetro cuadrado", "Milimetro cuadrado"});
           ComboBoxModel cbcadena2 = new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometro cuadrado", "Hectarea", "Metro cuadrado", "Decimetro cuadrado", "Centímetro cuadrado", "Milimetro cuadrado"});
           cb.setModelo(cbcadena);
           cb.setModelo2(cbcadena2);
        }
        if(tipoConversion == "Volumen"){
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] { "Metro cúbico", "Hectolitro", "Decalitro", "Decímetro", "Litro", "Decilitro", "Centilitro", "Centímetro cúbico", "Barril", "Pie cúbico", "Galón", "Cuarto de galón", "Pinta", "Agalla", "Onza líquida", "Pulgada cúbica"});
           ComboBoxModel cbcadena2 = new javax.swing.DefaultComboBoxModel<>(new String[] { "Metro cúbico", "Hectolitro", "Decalitro", "Decímetro", "Litro", "Decilitro", "Centilitro", "Centímetro cúbico", "Barril", "Pie cúbico", "Galón", "Cuarto de galón", "Pinta", "Agalla", "Onza líquida", "Pulgada cúbica"});
           cb.setModelo(cbcadena);
           cb.setModelo2(cbcadena2);
        }
        if(tipoConversion == "Masa y Peso"){
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] { "Tonelada", "Kilonewton", "Hectogramo", "Gramo", "Quilate", "Centigramo", "Miligramo", "Microgramo", "Tonelada larga", "Tonelada corta", "Quintal largo", "Quintal corto", "Piedra", "Libra", "Onza"});
           ComboBoxModel cbcadena2 = new javax.swing.DefaultComboBoxModel<>(new String[] { "Tonelada", "Kilonewton", "Hectogramo", "Gramo", "Quilate", "Centigramo", "Miligramo", "Microgramo", "Tonelada larga", "Tonelada corta", "Quintal largo", "Quintal corto", "Piedra", "Libra", "Onza"});
           cb.setModelo(cbcadena);
           cb.setModelo2(cbcadena2);
        }
        if(tipoConversion == "Velocidad"){
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometros por segundo", "Metros por segundo", "Milimetro por segundo", "Micrometro por segundo", "Milla por segundo", "Milla por hora", "Pie por segundo", "Nauticos", "Nudos"});
           ComboBoxModel cbcadena2 = new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometros por segundo", "Metros por segundo", "Milimetro por segundo", "Micrometro por segundo", "Milla por segundo", "Milla por hora", "Pie por segundo", "Nauticos", "Nudos"});
           cb.setModelo(cbcadena);
           cb.setModelo2(cbcadena2);
        }
        if(tipoConversion == "Temperatura"){
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
    
    public void validarBaseyDestino(String jefe, int baseIndex, int destinoIndex){
        if(jefe == "Longitud"){
            double dato = cb.getNumero();
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
            conv.conversorLongitud(dato, destinoIndex);
        }
    }   
}
