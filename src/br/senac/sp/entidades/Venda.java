package br.senac.sp.entidades;


import br.senac.sp.entidades.Cliente;
import br.senac.sp.entidades.Produto;
import java.util.Date;

public class Venda {
    private Integer codigo;
    private Date data;
   private Cliente cliente; 
    private Produto produto; 

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
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}

