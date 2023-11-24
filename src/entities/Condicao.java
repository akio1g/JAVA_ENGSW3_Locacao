package entities;

public class Condicao {
	
	private String local;
	private String tipo;
	
	public Condicao(String local, String tipo) {
		super();
		this.local = local;
		this.tipo = tipo;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
