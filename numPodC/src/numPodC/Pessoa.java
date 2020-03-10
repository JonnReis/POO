package numPodC;

public class Pessoa {
	private String nome;
	public Endereco endereco;
	public Telefone telefone;
	
	
	public Pessoa(String nome, Endereco endereco, Telefone telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
