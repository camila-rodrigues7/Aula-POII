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

    public String cor;
    private int ano;
    private int velocidade;
    protected boolean ligado;
    
    private static int qtdVeiculos; //global
    private static final int VELOCIDADE_MAXIMA = 180; //constante

    public Veiculo(String cor, int ano) {
        this.cor = cor;
        this.ano = ano;
        qtdVeiculos++;
    }

    public static int getQtdVeiculos() {
        return qtdVeiculos;
    }

        
    public Veiculo() {
        this("branco", 2019);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
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
            System.out.println("Parou");
        } else {
            this.velocidade -= 10;
            System.out.println("Freou");
        }
    }
    
    public void setAno(int valor) {
        this.ano = valor;
    }
    
    public int getAno() {
        return this.ano;
    }
    
    public void setVelocidade(int valor) {
        this.ano = valor;
    }
    
    public int getVelocidade() {
        return this.velocidade;
    }
}
