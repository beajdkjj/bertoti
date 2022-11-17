
public class Cliente {
	static Object getCliente() {
		return null;
	}
	private String novoCliente;
	private String espec;
	
	protected Cliente(String novoCliente, String espec) {
		super();
		this.novoCliente = novoCliente;
		this.espec = espec;
	}

	public String getNovoCliente() {
		return novoCliente;
	}

	public void setNovoCliente(String novoCliente) {
		this.novoCliente = novoCliente;
	}

	public String getEspec() {
		return espec;
	}

	public void setEspec(String espec) {
		this.espec = espec;
	}


}