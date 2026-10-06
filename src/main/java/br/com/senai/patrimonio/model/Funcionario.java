package br.com.senai.patrimonio.model;
import br.com.senai.patrimonio.model.enums.Cargo;

public class Funcionario extends Pessoa implements Localizavel {
    private Cargo cargo;
    private Empresa empresa;
    private Sala salasResponsavel;

    public Funcionario() {}

    public Funcionario(Cargo cargo, Sala salasResponsavel, Empresa empresa) {
        this.cargo = cargo;
        this.salasResponsavel = salasResponsavel;
        this.empresa = empresa;
    }

    public Funcionario(Long id, String nome, String cpf, Cargo cargo, Sala salasResponsavel, Empresa empresa) {
        super(id, nome, cpf);
        this.cargo = cargo;
        this.salasResponsavel = salasResponsavel;
        this.empresa = empresa;
    }

    /*
     * CONCEITO DE POO: POLIMORFISMO (sobrescrita / @Override)
     * --------------------------------------------------------
     * Funcionário redefine o comportamento herdado de {@link Pessoa#getIdentificacao()}
     * incluindo o cargo na descrição. Quem chama pessoa. "pessoa.getIdentificacao()"
     * através de referência do tipoo Pessoa não precisa se o
     * o objeto real é um funcionário a versão correta é executada em
     * tempo de execução (polimosrfismo dinamico)
     */

    @Override
    public String getDescricaoLocalzavel() {
        return "Responsabilidade de " + getNome() + " (" + cargo + ")";
    }
}

