import java.util.LinkedList;
import java.util.List;

public class Farmacia {
	
//MEDICAMENTOS 
    private List<DadosRemedio> remedio = new LinkedList<DadosRemedio>();
   
    public void novoMedicamento(DadosRemedio medicamento){
        remedio.add(medicamento);
    }
    
    public List<DadosRemedio> DadosRemedio(DadosRemedio espec){
        List<DadosRemedio> medEncontrados = new LinkedList<DadosRemedio>();
        for(DadosRemedio medicamento: remedio){
            if(medicamento.getEspec().comparar(DadosRemedio)) medEncontrados.add(medicamento);
            
        }
        return medEncontrados; 
    }
    
    public DadosRemedio DadosRemedio(String remedio){
        for(DadosRemedio espec:remedio){
            if (espec.getMed().equals(remedio)){
                return espec; 
            }     
        }
        
        return null;
    }

 //CLIENTE
    private List<DadosCliente> cliente = new LinkedList<DadosCliente>();
    
    public void novoCliente(DadosCliente addcliente) {
    	cliente.add(addcliente);
    }
    
    public List<DadosCliente> DadosCliente(DadosCliente espec){
    	List<DadosCliente> clienteEncontrados = new LinkedList<DadosCliente>();
    	for(DadosCliente addcliente: cliente) {
    		if(cliente.getEspec().comparar(DadosRemedio)) clienteEncontrados.add(addcliente);
    	}
    	return clienteEncontrados;
    }
    public DadosCliente DadosCliente(String cliente) {
    	for(DadosCliente espec:cliente) {
    		if (espec.getCliente().equals(cliente)) {
    			return espec;
    		}
    	}
    	return null;
    }
}