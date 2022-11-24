import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class Teste {

	@Test 
	public void testeRemedio() {
		Farmacia farmacia = new Farmacia(); 
		
		assertEquals(farmacia.getRemedios().size(), 0); 
		
		farmacia.novoMedicamento(new Remedio("Dipirona",new DadosRemedio("vw","mm","dipirona")));
		farmacia.novoMedicamento(new Remedio("Ibuprofeno",new DadosRemedio("vs","jj","álcool polivinílico")));
		
		assertEquals(farmacia.getRemedios().size(), 2); 
		
		Remedio encontrarRemedio = farmacia.getRemedio("dipirona");
		assertNotEquals(encontrarRemedio, null);
		
		List<Remedio> medEncontrados = farmacia.getRemedio(new DadosRemedio("vs","jj","álcool polivinílico"));
		assertEquals(medEncontrados.size(), 1); 

	}

	@Test 
	public void testeCliente() {
		Farmacia farmacia = new Farmacia(); 
		
		assertEquals(farmacia.getClientes().size(), 0); 
		
		farmacia.novoCliente(new Cliente(new DadosCliente("Marcinho","1239092345","Rua 1","000 000 000 00")));
		farmacia.novoCliente(new Cliente(new DadosCliente("Lucas","12987969252","Rua Araujo","000 111 222 33")));
	
		
		assertEquals(farmacia.getClientes().size(), 2); 
		
		Cliente encontrarCliente = farmacia.DadosCliente("000 000 000 00");
		assertNotEquals(encontrarCliente, null);
		
		List<Cliente> Clientes = farmacia.DadosCliente(new DadosCliente("Lucas","12987969252","Rua Araujo","000 111 222 33"));
		assertEquals(Clientes.size(), 1); 
	}

}

