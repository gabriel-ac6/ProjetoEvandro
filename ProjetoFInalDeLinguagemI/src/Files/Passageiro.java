/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Files;

/**
 *
 * @author Gabriel Camargo
 */
public class Passageiro {
    
    final String nome, cpf;
    
    public Passageiro(String nome, String cpf){
       
        this.nome = nome;
        this.cpf = cpf;
       
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
   
}
