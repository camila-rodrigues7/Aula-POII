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
public class VeiculoTeste {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        
        v1.setCor("Vermelho");
        v1.setAno(2008);
        v1.setVelocidade(0);
        v1.setLigado(false);
        
        System.out.println(v1.isLigado());
        v1.ligar();
        System.out.println(v1.isLigado());
        v1.acelerar();
        v1.acelerar();
        v1.acelerar();
        v1.acelerar(30);
        v1.frear(false);
        v1.frear(true);
        v1.desligar();
    }
    
}
