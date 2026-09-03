package br.com.senai.patrimonio.avaliacao;

public class Palestra extends Evento{
    @Override
    public void iniciar() {
        System.out.println("Iniciando Palestra...");
    }

    private String nome;

    public Palestra() {}

    public Palestra(String nome) {
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
