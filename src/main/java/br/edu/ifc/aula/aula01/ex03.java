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
public class ex03 {

    public static void main(String[] args) {
        double saldo, deposito, saque;
        saldo = 0;
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do depósito: "));

        saldo = saldo + deposito;
        JOptionPane.showMessageDialog(null, "O saldo da conta é: R$" + saldo);

        saque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do saque: "));

        if (saque > saldo) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para saque!");
        } else {
            saldo = saldo - saque;
            JOptionPane.showMessageDialog(null, "O saldo da conta é: R$" + saldo);
        }
    }

}
