package br.com.senai.patrimonio.atividades;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    // TODO: Sobrescrever o método calcularBonificacao() usando @Override
    // Regra: Desenvolvedores recebem 15% do salário base como bonificação (salarioBase * 0.15)
    @Override
    public double calcularBonificacao() {
        return getSalarioBase()*0.15;
    }
}
