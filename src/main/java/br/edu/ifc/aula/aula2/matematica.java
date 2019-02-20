/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.aula2;

/**
 *
 * @author aluno
 */
public class matematica {
    public double calculo(double[]notas) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma+= notas[i];
            
        }
        return soma / notas.length;
    }
    public double calculo(double n1, double n2) {
        return calculo(new double[] {n1,n2});
    }
    public int media(int n1, int n2) {
        return Double.valueOf(calculo(n1,n2)).intValue();
    }
    public double media(String n1, String n2) {
        int numero1 = Double.valueOf(n1).intValue();
        int numero2 = Double.valueOf(n2).intValue();
        return media(numero1, numero2); 
    }
    
}
