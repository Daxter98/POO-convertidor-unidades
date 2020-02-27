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
          conv.OriginalAEstandar(numero);
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
    
    public void validarBaseyDestino(String base, String destino, String jefe){
    int codigo = 0;
    if(jefe == "Longitud"){
        if(base == "Kilometro"){
           codigo = 1;
           conv.operacionPorCodigo(codigo);
        }
        if(base == "Metro"){
            codigo = 2;
            cb.setCodigo(codigo);
        }
        if(base == "Decimetro"){
            codigo = 3;
            cb.setCodigo(codigo);
        }
        if(base == "Centimetro"){
            codigo = 4;
            cb.setCodigo(codigo);
        }
        if(base == "Milimetro"){
            codigo = 5;
            cb.setCodigo(codigo);
        }
        if(base == "Milla"){
            codigo = 6;
            cb.setCodigo(codigo);
        }
        if(base == "Yarda"){
            codigo = 7;
            cb.setCodigo(codigo);
        }
        if(base == "Pie"){
            codigo = 8;
            cb.setCodigo(codigo);
        }
        if(base == "Pulgada"){
            codigo = 9;
            cb.setCodigo(codigo);
        }
      }   
    } 
    
}
