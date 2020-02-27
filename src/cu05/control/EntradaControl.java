/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cu05.control;
import javax.swing.ComboBoxModel;
import cu05.beans.ControlBeans;

/**
 *
 * @author gem2u
 */
public class EntradaControl {
    public ControlBeans cb = new ControlBeans();
    public ControlBeans cb2 = new ControlBeans();
    
    public void validarNumero(String numeroEntrada){
      
    }
    
    public void controlConversion(String tipoConversion){
        if(tipoConversion == "Longitud"){
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometro", "Metro", "Decímetro", "Centímetro", "Milímetro", "Milla", "Yarda", "Pie", "Pulgada"});
           cb.setModelo(cbcadena);
           cb2.setModelo(cbcadena);
        }
        if(tipoConversion == "Superficie"){
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometro cuadrado", "Hectarea", "Metro cuadrado", "Decimetro cuadrado", "Centímetro cuadrado", "Milimetro cuadrado"});
           cb.setModelo(cbcadena);
           cb2.setModelo(cbcadena);
        }
        if(tipoConversion == "Volumen"){
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] { "Metro cúbico", "Hectolitro", "Decalitro", "Decímetro", "Litro", "Decilitro", "Centilitro", "Centímetro cúbico", "Barril", "Pie cúbico", "Galón", "Cuarto de galón", "Pinta", "Agalla", "Onza líquida", "Pulgada cúbica"});
           cb.setModelo(cbcadena);
           cb2.setModelo(cbcadena);
        }
        if(tipoConversion == "Masa y Peso"){
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] { "Tonelada", "Kilonewton", "Hectogramo", "Gramo", "Quilate", "Centigramo", "Miligramo", "Microgramo", "Tonelada larga", "Tonelada corta", "Quintal largo", "Quintal corto", "Piedra", "Libra", "Onza"});
           cb.setModelo(cbcadena);
           cb2.setModelo(cbcadena);
        }
        if(tipoConversion == "Velocidad"){
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometros por segundo", "Metros por segundo", "Milimetro por segundo", "Micrometro por segundo", "Milla por segundo", "Milla por hora", "Pie por segundo", "Nauticos", "Nudos"});
           cb.setModelo(cbcadena);
           cb2.setModelo(cbcadena);
        }
        if(tipoConversion == "Temperatura"){
           ComboBoxModel cbcadena = new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin"});
           cb.setModelo(cbcadena);
           cb2.setModelo(cbcadena);
        }
    }
    
}
