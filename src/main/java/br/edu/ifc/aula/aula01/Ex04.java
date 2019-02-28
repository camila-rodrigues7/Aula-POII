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
public class Ex04 {

    public static void main(String[] args) {
        String nome; 
        double peso, altura, imc;

        nome = JOptionPane.showInputDialog("Informe seu nome: ");
        peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: "));

        imc = peso / (altura * altura);

        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "IMC: " + imc + "Seu peso está abaixo do normal");
        }
        else if (imc >= 18.5 && imc <= 24.4) {
            JOptionPane.showMessageDialog(null, "IMC: " + imc + "Seu peso está ideal");
        }
        else if (imc > 24.4 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null, "IMC: " + imc + "Seu peso está acima do normal, Pré Obesidade");
        }
        else if (imc > 29.9 && imc <= 34.9) {
            JOptionPane.showMessageDialog(null, "IMC: " + imc + "Seu peso está acima do normal, Obesidade Classe I");
        }
        else if (imc > 34.9 && imc <= 39.9) {
            JOptionPane.showMessageDialog(null, "IMC: " + imc + "Seu peso está acima do normal, Obesidade Classe II - Severa");
        }    
        else {
                JOptionPane.showMessageDialog(null, "IMC: " + imc + "Seu peso está acima do normal, Obesidade Classe III - Mórbida");
    }
}

}
