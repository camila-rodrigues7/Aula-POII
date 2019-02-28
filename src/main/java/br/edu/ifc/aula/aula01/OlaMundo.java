/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.aula01;

import java.awt.TrayIcon;
import javax.swing.JOptionPane;

/**
 *
 * <b>Primeira Classe Criada </b>
 *
 * @author Camila Rodrigues
 * @since 1.0
 */
public class OlaMundo {

    public static void main(String[] args) {
        String nome;
        double n1, n2, trabalho, media;
        int p1, p2, p3, somaPeso;

        try {

            nome = JOptionPane.showInputDialog("Informe seu nome: ");
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Primeira nota: "));
            n2 = Double.parseDouble(JOptionPane.showInputDialog("Segunda nota: "));
            trabalho = Double.parseDouble(JOptionPane.showInputDialog("Nota do trabalho: "));
            
            p1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso da primeira nota: "));
            p2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso da segunda nota: "));
            p3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso da terceira nota: "));

            somaPeso = p1 + p2 +p3;
            
            if (somaPeso != 10) {
                JOptionPane.showMessageDialog(null, "O peso total deve ser igual a 10");
            } else {
                media = ((n1*p1) + (n2*p2) + (trabalho*p3)) / somaPeso;
                
                if (media >= 7) {
                    JOptionPane.showMessageDialog(null, "A média do aluno " + nome + " é: " + media + ", Aluno Aprovado");
                }
                if (media >4) {
                    JOptionPane.showMessageDialog(null, "A média do aluno " + nome + " é: " + media + ", Aluno em Exame");
                }
                else {
                    JOptionPane.showMessageDialog(null, "A média do aluno " + nome + " é: " + media + ", Aluno Reprovado");
                }
            }
                 
                 
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Houve um erro na conversão dos números!",
                    "Informe números válidos!", TrayIcon.MessageType.WARNING.ordinal());
            ex.printStackTrace();
        } finally {
            System.out.println("Saindo...");
            System.exit(0);
        }

    }

}
