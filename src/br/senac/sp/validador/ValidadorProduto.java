package br.senac.sp.validador;

import br.senac.sp.exceptions.ProdutoException;
import br.senac.sp.classes.Produto;

//Validador de dados do cliente
public class ValidadorProduto {
    public static  void validar(Produto produto) throws ProdutoException {
        //Realização de validações de negócio
        if (produto == null) {
            throw new ProdutoException("Não foi informado um cliente");
        }
        if (produto.getNome() == null || "".equals(produto.getNome())) {
            throw new ProdutoException("É necessário informar "
                    + "um nome de produto");
        }
        if (produto.getData() == null
                || "".equals(produto.getData())) {
            throw new ProdutoException("É necessário informar a "
                    + "data do produto");
        }
        if (produto.getQuantidade() <=0) {
            throw new ProdutoException("É necessário informar uma "
                    + "quantidade a ser cadastrada do produto");
        }
        if (produto.getValor() <=0){
            throw new ProdutoException("É necessário informar o "
                    + "valor do produto");
        }
        if (produto.getCategoria() == null || "".equals(produto.getCategoria())
                || (!produto.getCategoria().equals("Cama"))
                && (!produto.getCategoria().equals("Mesa"))
                && !produto.getCategoria().equals("Banho")){
            throw new ProdutoException("É necessário informar a "
                    + "categoria do produto");
        }
        if (produto.getDescricao() == null || "".equals(produto.getDescricao())){
            throw new ProdutoException("É necessário informar a "
                    + "descrição do produto");
        }
        
    }
}

