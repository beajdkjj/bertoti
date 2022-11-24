
public class Remedio {
	static Object getMed() {
		return null;
	}
	private String novoMedicamento;
	private DadosRemedio espec;

	protected Remedio(String nome, DadosRemedio espec) {
		super();
		this.novoMedicamento = nome;
		this.espec = espec;
	}

	public String getNovoMedicamento() {
		return novoMedicamento;
	}

	public void setNovoMedicamento(String novoMedicamento) {
		this.novoMedicamento = novoMedicamento;
	}

	public DadosRemedio getEspec() {
		return espec;
	}

	public void setEspec(DadosRemedio espec) {
		this.espec = espec;
	}
}