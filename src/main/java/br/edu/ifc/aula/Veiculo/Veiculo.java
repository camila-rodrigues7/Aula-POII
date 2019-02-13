/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.Veiculo;

/**
 *
 * @author aluno
 */
public class Veiculo {

    String cor;
    public int ano;
    public int velocidade;
    public boolean ligado;

    public Veiculo(String cor, int ano) {
        this.cor = cor;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("Ligou");
        this.ligado = true;
    }

    public void desligar() {
        System.out.println("Desligou");
        this.ligado = false;
    }

    public void acelerar() {
        System.out.println("Acelerou");
        this.acelerar(1);
    }

    //sobrecarga
    public void acelerar(int valor) {
        this.velocidade += valor;
    }

    public void frear(boolean parar) {
        if (parar) {
            this.velocidade = 0;
        } else {
            this.velocidade -= 10;
        }
    }
}
