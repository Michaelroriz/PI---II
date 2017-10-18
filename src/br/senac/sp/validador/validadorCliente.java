package br.senac.sp.validador;

import br.senac.sp.exceptions.ClienteException;
import br.senac.sp.classes.Cliente;

/**
 *
 * @author WolfDevelloper
 */
public class validadorCliente {

    public static void validar(Cliente cliente) throws ClienteException { // validação de negocios
        // tratado caso o cliente seja nulo 
        if (cliente == null) {
            throw new ClienteException("Não Foi informado um cliente");

            // tratando se o nome do cliente é nulo ou o campo esteja em branco 
        }
        if (cliente.getNome() == null || "".equals(cliente.getNome())) {
            throw new ClienteException("É necessário informar um sobrenome" + "Sobrenome do Cliente");
        }
        // tratando caso o sobrenome seja vazio ou nulo
        if (cliente.getSobrenome() == null || "".equals(cliente.getSobrenome())) {

            throw new ClienteException("É necessário informar um" + "Sobrenome de Cliente");
        }
        // trantado caso a data de nascimento seja nula
        if (cliente.getDataNascimento() == null) {
            throw new ClienteException("É necessário informar uma Data de Nascimento válida " + "valor da idade válido");
        }
        // tratando caso o genero seja nulo ou o campo esteja em branco
        if (cliente.getGenero() == null || "".equals(cliente.getGenero())) {
            throw new ClienteException("É necessário informar um Genero");

        }

    }

}
