package br.com.senai.patrimonio;

import br.com.senai.patrimonio.model.*;
import br.com.senai.patrimonio.model.enums.Cargo;
import br.com.senai.patrimonio.model.enums.Pagamento;
import br.com.senai.patrimonio.model.enums.PagamentoComposto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatrimonioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatrimonioApplication.class, args);

		Empresa empresa = new Empresa();
		empresa.setRazaoSocial("Senai LTDA");
		System.out.println(empresa.getRazaoSocial());

		Endereco endereco = new Endereco();
		endereco.setRua("Bela vista");
		System.out.println(endereco.getRua());
		System.out.println(endereco.getBairro());

		empresa.setEndereco(endereco);
		System.out.println(empresa.getEndereco().getRua());

		Endereco enderecoComArgumentos = new Endereco("Líbano jose gomes",
				"489", "Perto do posto de saúde",
				"Santa luzia","Criciúma", "SC");
		System.out.println(enderecoComArgumentos.getBairro());

		Pessoa pessoa = new Pessoa();

		Pessoa pessoaComArgumentos = new Pessoa(1L, "Otávio", "123.456.789-00");
		System.out.println(pessoaComArgumentos.getNome());

		System.out.println(pessoaComArgumentos.getId());
		System.out.println(pessoaComArgumentos.getNome());

		empresa.setPessoa(pessoaComArgumentos);
		System.out.println(empresa.getPessoa().getCpf());
		System.out.println(empresa.getPessoa().getNome());

		Bloco bloco = new Bloco();

		Bloco blocoComArgumentos = new Bloco(2L, "Bloco 1", empresa);
		System.out.println(blocoComArgumentos.getNome());

		empresa.setBloco(blocoComArgumentos);
		System.out.println(empresa.getBloco().getNome());

		Sala sala = new Sala();

		Sala salaComArgumentos = new Sala(1L, "Otávio", "QR Code", bloco, empresa);
		System.out.println(sala.getNome());
		System.out.println(salaComArgumentos.getNome());

		Bem bem = new Bem();

		Bem bemComArgumentos = new Bem(2L, "Wilson", "Código: 1234", empresa);
		System.out.println(bem.getNome());
		System.out.println(bemComArgumentos.getNome());

		Funcionario funcionario = new Funcionario(
				35L, "Cleison", "123",
				Cargo.GERENTE, sala, empresa);

		System.out.println(Pagamento.PIX);
		System.out.println(PagamentoComposto.PIX.getDescricao());
		System.out.println(PagamentoComposto.BOLETO.getSituacao());
	}
}
