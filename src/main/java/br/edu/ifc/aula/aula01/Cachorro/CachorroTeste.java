/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.aula01;

/**
 *
 * @author aluno
 */
public class CachorroTeste {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        Cachorro c2 = new Cachorro();
        
        c1.nome = "Bimbo";
        c1.tamanho = 50;
        c1.raca = "Viralata";
        
        c2.nome = "Adamastor";
        c2.tamanho = 100;
        c2.raca = "Doberman";
        
        c1.latir();
        c2.latir();
    }
}
