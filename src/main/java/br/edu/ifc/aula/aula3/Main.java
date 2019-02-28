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
public class Main {

    public static void main(String[] args) {
        
        Animal generico = new Animal(6, "Peixe");
        Animal toto = new Cachorro();
        Animal coco = new Galinha();
        Animal mimosa = new Vaca();

        //Sem Polimorfismo
        generico.fazerBarulhoSemPolimorfismo();
        toto.fazerBarulhoSemPolimorfismo();
        coco.fazerBarulhoSemPolimorfismo();
        mimosa.fazerBarulhoSemPolimorfismo();

//Com Polimorfismo
        generico.fazerBarulho();
        toto.fazerBarulho();
        coco.fazerBarulho();
        mimosa.fazerBarulho();
        
        generico.correr();
        toto.correr();
        coco.correr();
        mimosa.correr();

}
}
