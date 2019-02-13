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
public class Cachorro {
        Integer tamanho;
        String nome;
        String raca;
        
        public void latir() {
            JOptionPane.showMessageDialog(null, this.nome + "AuAu");
        }
        
    }
