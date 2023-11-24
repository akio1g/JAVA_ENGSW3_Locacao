package entities;

public class Cliente {
	private String nome;
	private String cnh;
	private String cpf;
	
	public Cliente(String nome, String cnh, String cpf) {
		super();
		this.nome = nome;
		this.cnh = cnh;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
