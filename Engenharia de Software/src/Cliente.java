
public class Cliente {
	static Object getCliente() {
		return null;
	}
	
	private DadosCliente espec;
	
	protected Cliente(String cpf, DadosCliente espec) {
		super();
		this.cpf = cpf;
		this.espec = espec;
	}
	

	public DadosCliente getDadosCliente() {
		return espec;
	}

	public void setEspec(DadosCliente espec) {
		this.espec = espec;
	}


}