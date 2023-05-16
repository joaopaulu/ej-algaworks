package docs.contrato;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal1 {

	public static void main(String[] args) throws IOException {
		Path pastaDocs = Path.of("files");
		Files.createDirectory(pastaDocs);
		Path pastaFornecedores = Path.of("files/contratos/fornecedores");
		Files.createDirectories(pastaFornecedores);

		Path arquivoContrato = pastaFornecedores.resolve(Path.of("contrato-venda.txt"));
		Files.createFile(arquivoContrato);
		System.out.println(Files.exists(arquivoContrato));
	}

}
