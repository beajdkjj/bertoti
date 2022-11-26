
public class Cliente {

	private DadosCliente espec;
	
	public Cliente(DadosCliente espec) {
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