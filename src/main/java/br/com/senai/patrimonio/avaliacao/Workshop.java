package br.com.senai.patrimonio.avaliacao;

public class Workshop extends Evento {
    public void iniciar() {
        System.out.println("Iniciando Workshop...");
    }

    private String nome;

    public Workshop() {}

    public Workshop(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
}
