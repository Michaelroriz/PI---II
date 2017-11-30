package br.senac.sp.dados;

import br.senac.sp.entidades.Venda;
import java.util.ArrayList;
import java.util.List;

public class MockVenda {

    // armazena a lista de Vendas
    private static List<Venda> listaVendas = new ArrayList<Venda>();
    //controle de quantidade de Vendas
    private static int totalVendas = 0;

    public static void inserir(Venda venda)
            throws Exception {
        //define ID para o Venda atual
        venda.setCodigo(totalVendas++);
        listaVendas.add(venda);

    }

    /**
     * Realiza A exclusão de um Venda
     *
     * @param id
     * @throws Exception
     */
    public static void excluir(int id) throws Exception {
        if (id != 0 && !listaVendas.isEmpty()) {

            for (int i = 0; i < listaVendas.size(); i++) {

                Venda venda = listaVendas.get(i);
                // Compara o objeto venda com o id do Venda existente na lista quando encontrado exclui o mesmo
                if (venda != null && venda.getCodigo() == id) {
                    listaVendas.remove(i);
                    break;
                }
            }
        }
    }

    /**
     * lista todos os Vendas presentes na lista
     *
     * @return
     * @throws Exception
     */
    public static List<Venda> listar()
            throws Exception {
        //Retorna a lista de Vendas
        return listaVendas;
    }

    /**
     * busca um Venda pelo nome informado ou sobrenome
     *
     * @param nome
     * @return
     * @throws Exception
     */
    public static List<Venda> procurar(String nome)
            throws Exception {
        List<Venda> listaResultado = new ArrayList<Venda>();

        if (nome != null && !listaVendas.isEmpty()) {
            for (Venda VendaLi : listaVendas) {
                if (VendaLi != null && VendaLi.getCliente() != null
                        && VendaLi.getData() != null && VendaLi.getProduto() != null) {

                    listaResultado.add(VendaLi);
                }
            }
        }

        return listaResultado;
    }

    /**
     * Obtem um Venda da lista
     *
     * @param id
     * @return
     * @throws Exception
     */
    public static Venda obter(int id)
            throws Exception {
        if (id != 0 && !listaVendas.isEmpty()) {
            for (int i = 0; i < listaVendas.size(); i++) {
                if (listaVendas.get(i) != null && listaVendas.get(i).getCodigo() == id) {
                    return listaVendas.get(i);
                }
            }
        }
        return null;
    }

}
