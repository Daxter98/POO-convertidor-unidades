/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cu05.beans;
import javax.swing.ComboBoxModel;

/**
 *
 * @author gem2u
 */
public class ControlBeans {
    ComboBoxModel modelo;
    ComboBoxModel modelo2;
    double numero = 0.0;
    String resultado = "";

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public ComboBoxModel getModelo() {
        return modelo;
    }

    public void setModelo(ComboBoxModel modelo) {
        this.modelo = modelo;
    }

    public ComboBoxModel getModelo2() {
        return modelo2;
    }

    public void setModelo2(ComboBoxModel modelo2) {
        this.modelo2 = modelo2;
    }    

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
}
