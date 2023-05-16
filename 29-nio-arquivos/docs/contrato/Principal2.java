package docs.contrato;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Principal2 {

	public static void main(String[] args) throws IOException {
		Path pastaFornecedores = Path.of("files/contratos/fornecedores");
		Path arquivoContrato = Path.of("contrato-venda.txt");
		Path arquivoContratoOrigem = pastaFornecedores.resolve(arquivoContrato);

		Path pastaClientes = Path.of("files/contratos/clientes");
		Path arquivoContratoDestino = pastaClientes.resolve(arquivoContrato);

		Path pastaParceiros = Path.of("files/contratos/parceiros");

		System.out.println(arquivoContratoOrigem);
		System.out.println(arquivoContratoDestino);

		Files.copy(arquivoContratoOrigem, arquivoContratoDestino, REPLACE_EXISTING);
		Files.copy(pastaFornecedores, pastaParceiros);
	}

}
