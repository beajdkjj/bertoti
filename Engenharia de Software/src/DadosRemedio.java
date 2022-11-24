public class DadosRemedio {
	protected String nome;
	protected String marca;
	protected String modelo;
	protected String composicao;
	protected DadosRemedio(String marca, String modelo, String composicao) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.composicao = composicao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getComposicao() {
		return composicao;
	}
	public void setComposicao(String composicao) {
		this.composicao = composicao;
	}

	public boolean comparar(DadosRemedio remedio) {
		return remedio.composicao == this.composicao;
	}

}