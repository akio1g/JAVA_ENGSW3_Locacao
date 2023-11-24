package entities;

import java.util.Date;
import java.util.List;

public class Locacao {

	private Date dataLocacao;
	private int	horas;
	private String finalidade;
	private String local;
	private double valor;
	private List<Carro> carros;
	private Cliente cliente;
	private Devolucao devolucao;
	
	public Locacao(Date dataLocacao, int horas, String finalidade, String local, double valor, List<Carro> carros, Cliente cli, Devolucao dev) {
		super();
		this.dataLocacao = dataLocacao;
		this.horas = horas;
		this.finalidade = finalidade;
		this.local = local;
		this.valor = valor;
		this.carros = carros;
		this.cliente = cli;
		this.devolucao = dev;
	}
	public Date getDataLocacao() {
		return dataLocacao;
	}
	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public String getFinalidade() {
		return finalidade;
	}
	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public List<Carro> getCarros() {
		return carros;
	}
	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Devolucao getDevolucao() {
		return devolucao;
	}
	public void setDevolucao(Devolucao devolucao) {
		this.devolucao = devolucao;
	}
	
	
}
