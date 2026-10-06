package br.com.senai.patrimonio;

import br.com.senai.patrimonio.atividades.*;

public class PatrimonioApiApplication {

    public static void main(String[] args) {
        // TODO 1: Criar 3 objetos do tipo Equipamento (uma referência genérica, um Computador e um Veiculo)
        Equipamento computador = new Computador("MacBook Air M5", 4500.00);
        Equipamento veiculo = new Veiculo("Ford Mustang MAC 01", 450000.00);
        Equipamento equipamento = new Equipamento("Air Tag", 2100.00);

        // TODO 2: Chamar o método exibirRelatorio(...) repassando cada um dos 3 objetos criados
        exibirRelatorio(computador);
        exibirRelatorio(veiculo);
        exibirRelatorio(equipamento);
    }

    // Método auxiliar que demonstra o polimorfismo via parâmetro
    public static void exibirRelatorio(Equipamento item) {
        System.out.println("Item: " + item.getNome());
        System.out.println("Valor Inicial: R$ " + item.getValorInicial());

        // TODO 3: Imprimir o valor da depreciação chamando o método calcularDepreciacao() do 'item'
        System.out.println("Valor Líquido Após a Depreciação: " + item.calcularDepreciacao());

        System.out.println("-------------------------------------------");

        // TODO 3: Criar 3 objetos do tipo Funcionario (um Funcionario comum, um Gerente e um Desenvolvedor)
        Funcionario funcionarioComum = new Funcionario("Richard", 2000.00);
        Funcionario gerente  = new Funcionario("Gerente", 7000.00);
        Funcionario desenvolvedor = new Funcionario("Desenvolvedor", 11000.00);

        // TODO 4: Chamar o método imprimirContraCheque(...) para cada um dos 3 funcionários criados


        // Método auxiliar que demonstra o polimorfismo
        public static void imprimirContraCheque(Funcionario f) {
            System.out.println("Funcionário: " + f.getNome());
            System.out.println("Salário Base: R$ " + f.getSalarioBase());

            // TODO 3: Imprimir a bonificação chamando f.calcularBonificacao()

            // TODO 4: Imprimir o Salário Total (Salário Base + Bonificação)

            System.out.println("-------------------------------------------");
        }
    }
}
