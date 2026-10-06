package br.com.senai.patrimonio.atividades;

public class Veiculo extends Equipamento {

    public Veiculo(String nome, double valorInicial) {
        super(nome, valorInicial);
    }

    // TODO: Sobrescrever o método calcularDepreciacao() usando a anotação @Override
    // Regra de Negócio: Veículos depreciam 10% do valor inicial (valorInicial * 0.10)

    @Override
    public double calcularDepreciacao() {
        return getValorInicial() * 0.10;
    }
}