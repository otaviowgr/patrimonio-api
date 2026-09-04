package br.com.senai.patrimonio.avaliacao;

import br.com.senai.patrimonio.avaliacao.enums.StatusEvento;

public class Curso extends Evento {
    private int cargaHoraria;
    private String instrutor;
    private int quantidadeVagas;

    public Curso() {}

    @Override
    public void iniciar() {
        System.out.println("Iniciando Curso...");
    }

    public Curso(int codigo, String nome, String local, StatusEvento status, Participante resposanvel, int cargaHoraria, String instrutor, int quantidadeVagas) {
        super(codigo, nome, local, status, resposanvel);
        this.cargaHoraria = cargaHoraria;
        this.instrutor = instrutor;
        this.quantidadeVagas = quantidadeVagas;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public int getQuantidadeVagas() {
        return quantidadeVagas;
    }

    public void setQuantidadeVagas(int quantidadeVagas) {
        this.quantidadeVagas = quantidadeVagas;
    }
}
