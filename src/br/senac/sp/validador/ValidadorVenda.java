
package br.senac.sp.validador;

import br.senac.sp.classes.Venda;
import br.senac.sp.exceptions.VendaException;

public class ValidadorVenda {
    public static void validar(Venda venda) throws VendaException {
        //Realização de validações de negócio
        if (venda == null) {
            throw new VendaException("Não foi informado um venda");
        }
        if (venda.getCliente() == null || "".equals(venda.getCliente())) {
            throw new VendaException("É necessário informar "
                    + "o cliente que realizou a venda");
        }
        if (venda.getProduto()== null || "".equals(venda.getProduto())) {
            throw new VendaException("É necessário informar "
                    + "o(s) produto(s) da venda");
        }
        if (venda.getEndereco()== null || "".equals(venda.getEndereco())) {
            throw new VendaException("É necessário informar "
                    + "o endereço do cliente que realizou a venda");
        }        

    }
}
