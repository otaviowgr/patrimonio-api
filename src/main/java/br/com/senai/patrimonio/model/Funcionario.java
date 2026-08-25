package br.com.senai.patrimonio.model;
import br.com.senai.patrimonio.model.enums.Cargo;

public class Funcionario extends Pessoa {
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


}

