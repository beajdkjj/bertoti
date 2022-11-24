
public class Cliente {
	static Object getCliente() {
		return null;
	}
	
	private DadosCliente espec;
	
	protected Cliente(DadosCliente espec) {
		super();
		this.espec = espec;
	}
	

	public DadosCliente getDadosCliente() {
		return espec;
	}

	public void setEspec(DadosCliente espec) {
		this.espec = espec;
	}


}