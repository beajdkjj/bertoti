
public class DadosCliente {

	public String clienteNome;
	public String clienteTelefone;
	public String clienteEndereco;

	public DadosCliente(String clienteNome, String clienteTelefone, String clienteEndereco) {
	super();
	this.clienteNome = clienteNome;
	this.clienteTelefone = clienteTelefone;
	this.clienteEndereco = clienteEndereco;
}

	public String getClienteNome() {
		return clienteNome;
	}

	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}

	public String getClienteTelefone() {
		return clienteTelefone;
	}

	public void setClienteTelefone(String clienteTelefone) {
		this.clienteTelefone = clienteTelefone;
	}

	public String getClienteEndereco() {
		return clienteEndereco;
	}

	public void setClienteEndereco(String clienteEndereco) {
		this.clienteEndereco = clienteEndereco;
	}
	
	
}

