package br.com.senai.patrimonio.model;

public class Pessoa implements BuscarEmpresaVinculada {
    private Long id;
    private String nome;
    private String cpf;

    public Pessoa() {}

    public Pessoa(Long id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
        this.cpf = cpf;
    }

    @Override
    public String getEmpresaVinculada() {
        String nomePessoa = nome != null ? nome : "Pessoa sem nome";
        String cpfPessoa = cpf != null ? cpf : "CPF não informado";
        return "Pessoa: " + nomePessoa + ", CPF: " + cpfPessoa;
    }
}
