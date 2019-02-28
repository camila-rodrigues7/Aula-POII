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
public class Galinha
        extends Animal {

    public Galinha() {
        super(1.4, "Milho");
    }

    @Override
    public void fazerBarulho() {
        JOptionPane.showMessageDialog(null, "Có Có");
    }
    
    @Override
    public void correr() {
        JOptionPane.showMessageDialog(null, "Ciscando!");
    }
}
