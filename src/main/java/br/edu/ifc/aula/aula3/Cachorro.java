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
public class Cachorro extends Animal {

    
    public Cachorro() {
        super(3, "Ração");
       super.id = 1;
    }
    
    @Override
    public void fazerBarulho() {
        JOptionPane.showMessageDialog(null, "Au Au");
    }
    
    @Override
    public void correr() {
        JOptionPane.showMessageDialog(null, "Que cachorro veloz!");
    }
}
