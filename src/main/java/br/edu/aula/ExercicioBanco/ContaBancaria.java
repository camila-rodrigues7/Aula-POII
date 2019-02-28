/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.aula.ExercicioBanco;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ContaBancaria {

    private String cliente;
    private double saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ContaBancaria () {
        
    }
    
    public void exibeSaldo() {
        this.saldo = saldo;
        JOptionPane.showMessageDialog(null, "Saldo Total: " + saldo);
    }

    public void sacaValor(double valor) {
        this.saldo -= valor;
        JOptionPane.showMessageDialog(null, (this.saldo <= 50 ? " Saldo Insuficiente" : "Seu saldo é: " + saldo));

    }

    public void depositaValor(double valor) {
        this.saldo += valor;
        JOptionPane.showMessageDialog(null, "Seu saldo é: " + saldo);
    }

    public void transferePara(double valor) {
        this.saldo -= valor;
        JOptionPane.showMessageDialog(null, "Seu saldo é: " + saldo);
    }
}
