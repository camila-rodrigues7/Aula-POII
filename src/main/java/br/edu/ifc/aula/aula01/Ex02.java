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
public class Ex02 {
    public static void main(String[] args) {
        double base, altura;
        base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base do retângulo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do retângulo"));
        
                
        JOptionPane.showMessageDialog(null, "A área do retângulo é: " + new Ex02().calculaAreaRetangulo(base, altura));
    }
    
    public double calculaAreaRetangulo(double base, double altura) {
        return base * altura;
    }
}
