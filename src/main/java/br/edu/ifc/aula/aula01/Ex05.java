/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.aula01;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Ex05 {
    public static void main(String[] args) {
        double v1, v2, soma, sub, multi, divi;

        v1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor: "));
        v2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor: "));
        
        soma = v1 + v2;
        sub = v1 - v2;
        multi = v1 * v2;
        divi = v1 / v2;
        
        JOptionPane.showMessageDialog(null, "A soma dos valores é: " +soma);
        JOptionPane.showMessageDialog(null, "A subtração dos valores é: " +sub);
        JOptionPane.showMessageDialog(null, "A multiplicação dos valores é: " +multi);
        JOptionPane.showMessageDialog(null, "A divisão dos valores é: " +divi);
    }
}
