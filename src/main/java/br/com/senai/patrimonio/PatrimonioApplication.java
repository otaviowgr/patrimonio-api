package br.com.senai.patrimonio;

import br.com.senai.patrimonio.model.Empresa;
import br.com.senai.patrimonio.model.Endereco;
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
		endereco.setRua("Rua General Lauro Sodré");
		System.out.println(endereco.getRua());

		endereco.setNumero("Nº 300");
		System.out.println(endereco.getNumero());

		endereco.setComplemento("Sem Complemento");
		System.out.println(endereco.getComplemento());

		endereco.setBairro("Comerciário");
		System.out.println(endereco.getBairro());

		endereco.setCidade("Criciúma");
		System.out.println(endereco.getCidade());

		endereco.setEstado("Santa Catarina");
		System.out.println(endereco.getEstado());
	}

}
