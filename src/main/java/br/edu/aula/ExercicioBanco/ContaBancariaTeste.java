/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.aula.ExercicioBanco;

import br.edu.ifc.aula.Veiculo.Veiculo;

/**
 *
 * @author aluno
 */
public class ContaBancariaTeste {
    public static void main(String[] args) {
    ContaBancaria c1 = new ContaBancaria();
    c1.setCliente("José");
    c1.setSaldo(0);

    ContaBancaria c2 = new ContaBancaria();
    c2.setCliente("Ronaldo");
    c2.setSaldo(100);
    
    c1.exibeSaldo();
    c2.exibeSaldo();

    c1.deposita(100);
    c1.saca(50);
    c2.transferePara(c1, 35);

    // não deve permitir
    c1.saca(100);
    
    c1.exibeSaldo();
    c2.exibeSaldo();
  }
        
    }
