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
public class Itemvenda {
    private int id;
    private int quantidade;
    private float valorUnitario;

    public int getCodigo() {
        return id;
    }

    public void setCodigo(int codigo) {
        this.id = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
}
