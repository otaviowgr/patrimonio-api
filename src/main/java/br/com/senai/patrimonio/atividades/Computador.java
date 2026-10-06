package br.com.senai.patrimonio.atividades;

public class Computador extends Equipamento {

    public Computador(String nome, double valorInicial) {
        super(nome, valorInicial);
    }

    // TODO: Sobrescrever o método calcularDepreciacao() usando a anotação @Override
    // Regra de Negócio: Computadores depreciam 20% do valor inicial (valorInicial * 0.20)

    @Override
    public double calcularDepreciacao() {
        return getValorInicial() * 0.20;
    }
}
