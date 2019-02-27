/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.ufc;

/**
 *
 * @author aluno
 */
public enum CategoriaType {
    
    LEVE("Peso Leve"),
    PENA("Peso Pena"),
    PESADO("Peso Pesado"),
    MOSCA("Peso Mosca"),
    MEDIO("Peso Médio");
    
    private final String tipo;
    
    private CategoriaType(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return tipo;
    }
}
