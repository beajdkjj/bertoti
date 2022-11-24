import java.util.LinkedList;
import java.util.List;

public class Farmacia {
	
//MEDICAMENTOS 
    private List<Remedio> remedios = new LinkedList<Remedio>();
   
    public void novoMedicamento(Remedio medicamento){
        remedios.add(medicamento);
    }
    
    public List<Remedio> getRemedio(DadosRemedio espec){
        List<Remedio> medEncontrados = new LinkedList<Remedio>();
        for(Remedio medicamento: remedios){
            if(medicamento.getEspec().comparar(espec)) 
            	medEncontrados.add(medicamento);
            
        }
        return medEncontrados; 
    }
    
    public Remedio getRemedio(String composoicaoRemedio){
        for(Remedio rem: remedios){
            if (rem.getEspec().getComposicao().equals(remedios)){
                return rem; 
            }     
        }
        
        return null;
    }

 //CLIENTE
    private List<Cliente> clientes = new LinkedList<Cliente>();
    
    public void novoCliente(Cliente addcliente) {
    	clientes.add(addcliente);
    }
    
    public List<Cliente> DadosCliente(DadosCliente espec){
    	List<Cliente> clienteEncontrados = new LinkedList<Cliente>();
    	for(Cliente cliente: clientes) {
    		if(cliente.getDadosCliente().comparar(espec)) clienteEncontrados.add(cliente);
    	}
    	return clienteEncontrados;
    }
    public Cliente DadosCliente(String cpf) {
    	for(Cliente espec:clientes) {
    		if (espec.getDadosCliente().getCpf().equals(cpf)) {
    			return espec;
    		}
    	}
    	return null;
    }
}