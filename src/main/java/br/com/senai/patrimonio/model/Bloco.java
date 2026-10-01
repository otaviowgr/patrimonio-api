package br.com.senai.patrimonio.model;

public class Bloco implements BuscarEmpresaVinculada {
    private Long id;
    private String nome;
    private Empresa empresa;

    public Bloco() {}

    public Bloco(Long id, String nome, Empresa empresa) {
        this.id = id;
        this.nome = nome;
        this.empresa = empresa;
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String getEmpresaVinculada() {
        if (empresa != null) {
            String nomeEmpresa = empresa.getNome() != null ? empresa.getNome() : "Empresa sem nome";
            String cnpjEmpresa = empresa.getCnpj() != null ? empresa.getCnpj() : "CNPJ não informado";
            return "Bloco: " + nome + ", Empresa: " + nomeEmpresa + ", CNPJ: " + cnpjEmpresa;
        } else {
            return "Bloco: " + nome + ", Empresa: Não vinculada";
        }
    }
}
