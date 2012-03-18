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
public class Produto {
    private int id;
    private String nome;
    private float valor;
    private int estoque;

    public Produto(){
   
    }
    
    public Produto(int i, String nm, float vl, int etq){
        i=id;
        nm=nome;
        vl=valor;
        etq=estoque;
    }
    
    public int getCodigo() {
        return id;
    }

    public void setCodigo(int codigo) {
        this.id = codigo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
