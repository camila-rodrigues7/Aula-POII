/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.aula3;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Animal {

    protected int id;
    private double peso;
    private String comida;

    public Animal(double peso, String comida) {
        this.peso = peso;
        this.comida = comida;
    }

    public void dormir() {
        JOptionPane.showMessageDialog(null, "Animal Dormindo");
    }

    public void fazerBarulho() {
        JOptionPane.showMessageDialog(null, "Animal Fazendo Barulho!");
    }

    public void fazerBarulhoSemPolimorfismo() {
        if (this instanceof Cachorro) {
            JOptionPane.showMessageDialog(null, "Au Au!");
        } else if (this instanceof Galinha) {
            JOptionPane.showMessageDialog(null, "Có Có!");
        } else if (this instanceof Vaca) {
            JOptionPane.showMessageDialog(null, "Muuuuuuuh!");
        }
        
    }

    public void correr() {
        if (this instanceof Cachorro) {
            JOptionPane.showMessageDialog(null, "Que cachorro veloz!");
        } else if (this instanceof Galinha) {
            JOptionPane.showMessageDialog(null, "Ciscando!");
        }
    }
}
