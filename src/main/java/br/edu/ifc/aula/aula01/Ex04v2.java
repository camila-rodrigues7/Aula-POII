package br.edu.ifc.aula.aula01;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class Ex04v2 {

    public static void main(String[] args) {
        String nome;
        double peso, altura;

        nome = JOptionPane.showInputDialog("Informe seu nome: ");
        peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: "));

        Double imc = calcularImc(peso, altura);

        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" + "IMC: " + imc + "\n" + "Resultado: " + TipoImc(imc));
    }

    public static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String TipoImc(double imc) {

        String resultado = null;
        if (imc < 18.5) {
            resultado = "Peso abaxo do normal";
        } else if (imc >= 18.6 && imc <= 24.4) {
            resultado = "Peso ideal";
        } else if (imc >= 24.5 && imc <= 29.9) {
            resultado = "Pré_Obesidade";
        } else if (imc >= 30 && imc <= 34.9) {
            resultado = "Obesidade Classe I";
        } else if (imc >= 35 && imc <= 39.9) {
            resultado = "Obesidade Classe II (severa)";
        } else if (imc >= 40) {
            resultado = "Obesidade Classe III (mórbida)";
        }
        return resultado;
    }

}
