package Files;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.*;
import java.io.*;

/**
 *
 * @author Gabriel Camargo
 */
public class ProjetoFInalDeLinguagemI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String var = JOptionPane.showInputDialog("Menu Principal \n 1.Parâmetros do Sistema \n 2.Reserva de Passagens \n 3.Sair");
        int opcao1 = Integer.parseInt(var);

        switch (opcao1) {

            case 1:
                String var2 = JOptionPane.showInputDialog("Parâmetros do Sistema \n 1.Cadastrar Aeronave \n 2.Cadastrar Voo \n 3.Voltar");
                int Parametros = Integer.parseInt(var2);

                switch (Parametros) {
                    case 1:
                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                }

                break;

            case 2:
                String var3 = JOptionPane.showInputDialog("Reserva de Passagens \n 1.Fazer reserva \n 2.Consultar lugares vazios \n 3.Consultar reservas realizadas \n 4.Voltar");
                int reserva = Integer.parseInt(var3);

                switch (reserva) {
                    case 1:
                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                }

                break;

            case 3:
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }

    }

}