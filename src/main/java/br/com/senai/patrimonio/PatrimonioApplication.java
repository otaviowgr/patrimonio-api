package br.com.senai.patrimonio;

import br.com.senai.patrimonio.model.Bloco;
import br.com.senai.patrimonio.model.Empresa;
import br.com.senai.patrimonio.model.Endereco;
import br.com.senai.patrimonio.model.Pessoa;
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
	}

}
