package br.senac.sp.classes;

import br.senac.sp.exceptions.ClienteException;
import br.senac.sp.exceptions.EnderecoException;

/**
 *
 * @author sonac
 */
public class Endereco {

    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String complemento;
    private String cep;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Endereco(String rua, String bairro, String cidade, String estado, String complemento, String cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.complemento = complemento;
    }
    
   

    Endereco() throws EnderecoException {
        throw new EnderecoException("Não Foi infomado os dados de Endereço correntamente"); //To change body of generated methods, choose Tools | Templates.
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
