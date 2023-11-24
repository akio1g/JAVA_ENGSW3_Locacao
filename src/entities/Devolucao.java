package entities;

import java.util.Date;

public class Devolucao {
	private Date dataDev;
	private float quilometragem;
	private Condicao condicaoCarro;
	
	public Devolucao(Date dataDev, float quilometragem, Condicao condicaoCarro) {
		super();
		this.dataDev = dataDev;
		this.quilometragem = quilometragem;
		this.condicaoCarro = condicaoCarro;
	}
	public Date getDataDev() {
		return dataDev;
	}
	public void setDataDev(Date dataDev) {
		this.dataDev = dataDev;
	}
	public float getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(float quilometragem) {
		this.quilometragem = quilometragem;
	}
	public Condicao getCondicaoCarro() {
		return condicaoCarro;
	}
	public void setCondicaoCarro(Condicao condicaoCarro) {
		this.condicaoCarro = condicaoCarro;
	}
	
	
}
