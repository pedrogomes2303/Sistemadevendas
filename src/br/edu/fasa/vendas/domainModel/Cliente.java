/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;

/**
 *
 * @author Pedro Gomes
 * @version 1.0
 */


public class Cliente {
    private int id;
    private String nome;
     
    
    public Cliente(){
        
    }
    
    public Cliente(int i, String nm, Cliente cli){
        id=i;
        nm=nome;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
        
}
