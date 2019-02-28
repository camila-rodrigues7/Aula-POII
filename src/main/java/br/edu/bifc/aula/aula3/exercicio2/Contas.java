/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.bifc.aula.aula3.exercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Contas {

    public static void mostrarCalculo(OperacaoMatematica operacao, double x, double y) {
        JOptionPane.showMessageDialog(null, "O resultado é: " + operacao.calcular(x, y));
    }

    public static void main(String args[]) {
        
        Contas.mostrarCalculo(new Soma(), 5, 5); 

        
        Contas.mostrarCalculo(new Subtracao(), 5, 5); 
}
}