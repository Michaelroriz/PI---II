package br.senac.sp.classes;

import br.senac.sp.classes.Endereco;
import java.util.Date;
//Classe de negócio de cliente

public class Cliente {

    //Atributos
    private Integer id;
    private String nome;
    private String sobrenome;
    private Date dataNascimento;
    private String genero;
    private Endereco endereco;
    private String cpf;

    //Métodos de acesso
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    // endereco cliente recebe um objeto endereco
    public void setEndereco(Endereco end) {
        this.endereco = end;

    }

    public Endereco getEndereco() {
        return endereco;
    }
}
