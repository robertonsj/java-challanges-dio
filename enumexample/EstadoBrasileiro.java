package enumexample;

public enum EstadoBrasileiro {
	PARA("PA", "Pará"),
	PIAUI("PI", "Piauí"),
	GOIAS("GO", "Goias"),
	SAO_PAULO("SP", "São Paulo"),
	PARANA("PR", "Paraná");
	
	private String nome;
	private String sigla;
	
	private EstadoBrasileiro(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public String getNome() {
		return nome;
	}
	
	
}
