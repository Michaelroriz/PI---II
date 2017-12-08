package br.senac.sp.entidades;


import br.senac.sp.entidades.Cliente;
import br.senac.sp.entidades.Produto;
import java.util.Date;
import java.util.List;

public class Venda {
    private Integer codigo;
    private Date data;
   private int cliente; 
    private int produto; 

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }
    
    
}

