package br.com.senai.patrimonio;

import br.com.senai.patrimonio.model.*;
import br.com.senai.patrimonio.model.enums.EstadoConservacao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class PatrimonioApplication {

	public static void main(String[] args) {
		// Apenas inicia a aplicação Spring Boot
		SpringApplication.run(PatrimonioApplication.class, args);
	}

	// Isola os testes aqui dentro de forma limpa e organizada
	@Bean
	public CommandLineRunner executarTestes() {
		return args -> {
			System.out.println("\n========================================");
			System.out.println("INICIANDO TESTES DAS INTERFACES E MODELOS");
			System.out.println("========================================\n");

			// 1. Testando Sala e Bloco com ‘Interfaces’
			Empresa empresaInterface = new Empresa();
			Bloco blocoInterface = new Bloco(1L, "Bloco 1", empresaInterface);
			Sala salaInterface = new Sala(2L, "Lab. 2", "45678", blocoInterface, empresaInterface);

			System.out.println("-> Descrição Localizável da Sala:");
			System.out.println(salaInterface.getDescricaoLocalzavel());

			// 2. Testando Patrimônio com Estado de Conservação (Novo)
			Patrimonio patrimonioInterface = new Patrimonio();
			patrimonioInterface.setBem(new Bem());
			patrimonioInterface.setDataAquisicao(LocalDate.now());
			patrimonioInterface.setEstado(EstadoConservacao.NOVO);

			System.out.println("\n-> Teste Patrimônio (Estado: NOVO):");
			System.out.println("Data de Aquisição: " + patrimonioInterface.getDataAquisicao());
			System.out.println(patrimonioInterface.getBuscaConservacao());

			// 3. Testando Patrimônio com Estado Nulo
			Patrimonio patrimonioNulo = new Patrimonio();
			patrimonioNulo.setBem(new Bem());
			patrimonioNulo.setDataAquisicao(LocalDate.now());
			patrimonioNulo.setEstado(null);

			System.out.println("\n-> Teste Patrimônio (Estado: NULO):");
			System.out.println("Data de Aquisição: " + patrimonioNulo.getDataAquisicao());
			System.out.println(patrimonioNulo.getBuscaConservacao());

			// 4. Testando Empresa, Bloco, Pessoa, Sala e Endereco com BuscarEmpresaVinculada
			Bloco bloco = new Bloco(1L, "Bloco A", empresaInterface);
			System.out.println(bloco.getEmpresaVinculada());

			Pessoa pessoa = new Pessoa(1L, "João Silva", "123.456.789-00");
			System.out.println(pessoa.getEmpresaVinculada());

			Sala sala = new Sala(1L, "Sala 101", "QR123", bloco, empresaInterface);
			System.out.println(sala.getDescricaoLocalzavel());
			System.out.println(sala.getEmpresaVinculada());

			Endereco endereco = new Endereco("Rua das Flores", "123", "Centro", "Cidade Exemplo", "Estado Exemplo", "12345-678");
			System.out.println(endereco.getEmpresaVinculada());

			System.out.println("\n========================================");
			System.out.println("FIM DOS TESTES");
			System.out.println("========================================\n");
		};
	}
}