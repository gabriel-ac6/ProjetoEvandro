/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Files;

/**
 *
 * @author Gabriel Camargo
 */

public class Voo {
    final int nro;
    final String data, hora;

    public Voo(int nro, String data, String hora){
        this.nro = nro;
        this.data = data;
        this.hora = hora;
    }
    
    public int getNro() {
        return nro;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }
        
}
