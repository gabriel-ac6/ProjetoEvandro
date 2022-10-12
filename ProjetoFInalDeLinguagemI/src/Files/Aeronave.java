/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinaldelinguagemi.Aeronave;

/**
 *
 * @author Gabriel Camargo
 */

import javax.swing.*;

public class Aeronave {
    
    String modelo = JOptionPane.showInputDialog("Digite o modelo da aeronave");

    public Aeronave(String modelo) {
        modelo = this.modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
