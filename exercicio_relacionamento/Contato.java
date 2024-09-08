package exercicio_relacionamento;

import java.util.ArrayList;
import java.util.List;

public class Contato {

	private String nome;
	private Endereco endereco;

	private List<Telefone> telefones = new ArrayList<>();

	public Contato(String nome) {
		super();
		this.nome = nome;
		//this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "\nContato: " + nome +"\nEndereço:" + endereco + "\nTelefones:" + telefones;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void adicionarTelefone(Telefone telefone) {
		this.telefones.add(telefone);
		
	}	
}