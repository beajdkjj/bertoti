
public class DadosCliente {

	public String clienteNome;
	public String clienteTelefone;
	public String clienteEndereco;
	private String cpf;

	public DadosCliente(String clienteNome, String clienteTelefone, String clienteEndereco, String cpf) {
		super();
		this.clienteNome = clienteNome;
		this.clienteTelefone = clienteTelefone;
		this.clienteEndereco = clienteEndereco;
		this.cpf = cpf;
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
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public boolean comparar(DadosCliente dadoCliente) {
		return dadoCliente.getCpf() == this.cpf;
	}
}