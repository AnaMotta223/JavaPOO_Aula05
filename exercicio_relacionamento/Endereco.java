package exercicio_relacionamento;

public class Endereco {
	
	private String rua;
	private String bairro;
	private String cep;
	private Cidade cidade;
	
	public Endereco(String rua, String bairro, String cep, Cidade cidade) {
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return " Rua " + rua + "\nBairro: " + bairro + "\nCep: " + cep + cidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}
}