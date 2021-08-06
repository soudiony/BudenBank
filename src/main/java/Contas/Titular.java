package Contas;

import java.io.Serializable;

public class Titular implements Serializable {

    private String nome;
    private String cpf;
    private String profissao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Titular{" +
                "nome='" + this.getNome() + '\'' +
                '}';
    }
}
