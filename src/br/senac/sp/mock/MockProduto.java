package br.senac.sp.mock;

import br.senac.sp.model.Produto;
import java.util.ArrayList;
import java.util.List;

//Mock de Produto. Realiza operações de mock com o produto. 
public class MockProduto {
    private static int totalProdutos = 0;
    /** Armazena a lista de produtos inseridos para manipulação. #MOCK **/    
    private static List<Produto> listaProdutos = new ArrayList<Produto>();
    
    //Insere um produto no mock "produto"
    public static void inserir(Produto produto)
            throws Exception {
        produto.setCodigo(totalProdutos++);
        listaProdutos.add(produto);
    }

    //Realiza a atualização dos dados de um produto, com ID e dados
    //fornecidos como parâmetro através de um objeto da classe "Produto"
    public static void atualizar(Produto produtoProcura)
            throws Exception {
        if (produtoProcura != null && produtoProcura.getCodigo() != null && !listaProdutos.isEmpty()) {
            for (Produto produtoLi : listaProdutos) {
                if (produtoLi != null && produtoLi.getCodigo() == produtoProcura.getCodigo()) {
                    produtoLi.setNome(produtoProcura.getNome());
                    produtoLi.setData(produtoProcura.getData());
                    produtoLi.setQuantidade(produtoProcura.getQuantidade());                    
                    produtoLi.setValor(produtoProcura.getValor());
                    produtoLi.setCategoria(produtoProcura.getCategoria());
                    produtoLi.setDescricao(produtoProcura.getDescricao());                    
                    break;
                }
            }
        }
    }

    //Realiza a exclusão de um produto no mock, com ID fornecido
    //como parâmetro.
    public static void excluir(Integer id) throws Exception {
        if (id != null && !listaProdutos.isEmpty()) {
            for (int i = 0; i < listaProdutos.size(); i++) {
                Produto produtoLi = listaProdutos.get(i);
                if (produtoLi != null && produtoLi.getCodigo() == id) {
                    listaProdutos.remove(i);
                    break;
                }
            }
        }
    }

    //Lista todos os produtos
    public static List<Produto> listar()
            throws Exception {       
        //Retorna a lista de produtos
        return listaProdutos;
    }

    //Procura um produto no mock, de acordo com o nome
    //ou com o sobrenome, passado como parâmetro
    public static List<Produto> procurar(String valor)
            throws Exception {
        List<Produto> listaResultado = new ArrayList<Produto>();
        
        if (valor != null && !listaProdutos.isEmpty()) {
            for (Produto produtoLi : listaProdutos) {
                if (produtoLi != null && produtoLi.getNome() != null) {
                    if (produtoLi.getNome().toUpperCase().contains(valor.toUpperCase())) {
                        listaResultado.add(produtoLi);
                    }
                }
            }
        }
        
        //Retorna a lista de produtos encontrados
        return listaResultado;
    }

    //Obtém um produto da lista
    public static Produto obter(Integer id)
            throws Exception {
        if (id != null && !listaProdutos.isEmpty()) {
            for (int i = 0; i < listaProdutos.size(); i++) {
                if (listaProdutos.get(i) != null && listaProdutos.get(i).getCodigo() == id) {
                    return listaProdutos.get(i);
                }                
            }
        }
        return null;
    }
}