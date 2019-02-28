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
public class Vaca extends Animal {

    public Vaca() {
        super(300, "Pasto");
        super.id = 3;
    }

    @Override
    public void fazerBarulho() {
        JOptionPane.showMessageDialog(null, "Muuuuuh");
    }

    @Override
    public void correr() {
        JOptionPane.showMessageDialog(null, "Pastanto!");
    }
}
