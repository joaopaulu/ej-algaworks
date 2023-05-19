package comercial.repositorio.memoria;

import comercial.repositorio.FabricaDeRepositorio;
import comercial.repositorio.VendaRepositorio;

public class MemoriaFabricaDeRepositorio implements FabricaDeRepositorio {

	@Override
	public VendaRepositorio criarVendaRepositorio() {
		return new MemoriaVendaRepositorio();
	}

	@Override
	public void close() {
	}

}
