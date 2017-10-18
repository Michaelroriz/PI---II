package br.senac.sp.dados;

import br.senac.sp.classes.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victor.salves1
 */

/*
* Mantem a persintência dos dados enquanto o programa esta em execução
 */
public class mockCliente {

    // armazena a lista de clientes
    private static List<Cliente> listaClientes = new ArrayList<Cliente>();
    //controle de quantidade de clientes
    private static int totalClientes = 0;

    public static void inserir(Cliente cli)
            throws Exception {
        //define ID para o cliente atual
        cli.setId(totalClientes++);
        listaClientes.add(cli);

    }

    /**
     * Altera os dados do cliente informado
     *
     * @param Cliente
     * @throws Exception
     */
    public static void atualizarCliente(Cliente buscaCliente)
            throws Exception {
        if (buscaCliente != null && buscaCliente.getId() != 0 && !listaClientes.isEmpty()) {

            for (Cliente clienteLi : listaClientes) {
                if (clienteLi != null && clienteLi.getId() == buscaCliente.getId()) {
                    //esse if atribui os valores do cliente a ser procurado na lista (clienteProcura) para o objeto clienteLi
                    clienteLi.setGenero(buscaCliente.getGenero());
                    clienteLi.setDataNascimento(buscaCliente.getDataNascimento());
                    clienteLi.setNome(buscaCliente.getNome());
                    clienteLi.setSobrenome(buscaCliente.getSobrenome());
                    break;
                }
            }
        }
    }

    /**
     * Realiza A exclusão de um cliente
     *
     * @param id
     * @throws Exception
     */
    public static void excluir(int id) throws Exception {
        if (id != 0 && !listaClientes.isEmpty()) {

            for (int i = 0; i < listaClientes.size(); i++) {

                Cliente cli = listaClientes.get(i);
                // Compara o objeto cli com o id do cliente existente na lista quando encontrado exclui o mesmo
                if (cli != null && cli.getId() == id) {
                    listaClientes.remove(i);
                    break;
                }
            }
        }
    }

    /**
     * lista todos os clientes presentes na lista
     *
     * @return
     * @throws Exception
     */
    public static List<Cliente> listar()
            throws Exception {
        //Retorna a lista de clientes
        return listaClientes;
    }

    /**
     * busca um cliente pelo nome informado ou sobrenome
     *
     * @param nome
     * @return
     * @throws Exception
     */
    public static List<Cliente> procurar(String nome)
            throws Exception {
        List<Cliente> listaResultado = new ArrayList<Cliente>();

        if (nome != null && !listaClientes.isEmpty()) {
            for (Cliente clienteLi : listaClientes) {
                if (clienteLi != null && clienteLi.getNome() != null
                        && clienteLi.getSobrenome() != null) {
                    if (clienteLi.getNome().toUpperCase().contains(nome.toUpperCase()) || clienteLi.getSobrenome().toUpperCase().contains(nome.toUpperCase())) {
                        listaResultado.add(clienteLi);
                    }
                }
            }
        }

        return listaResultado;
    }

    /**
     * Obtem um cliente da lista
     *
     * @param id
     * @return
     * @throws Exception
     */
    public static Cliente obter(int id)
            throws Exception {
        if (id != 0 && !listaClientes.isEmpty()) {
            for (int i = 0; i < listaClientes.size(); i++) {
                if (listaClientes.get(i) != null && listaClientes.get(i).getId() == id) {
                    return listaClientes.get(i);
                }
            }
        }
        return null;
    }

}
