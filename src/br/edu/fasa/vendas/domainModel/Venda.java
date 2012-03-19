/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;



import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Pedro Gomes
 * @version 1.0
 */
public class Venda {
private int id;
private Time hora;
private Date data;
private List<Itemvenda> itens ;
private Cliente cliente;

public Venda(){
}

public Venda(int i, Time hr, Date dt, List<Itemvenda> list, Cliente cli  ){
    i=id;
    hr=hora;
    dt=data;
    list=itens;
    cli=cliente;

}

    public List<Itemvenda> getItens() {
        return itens;
    }

    public void setItens(List<Itemvenda> itens) {
        this.itens = itens;
    }

    public int getCodigo() {
        return id;
    }

    public void setCodigo(int codigo) {
        this.id = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

        public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
