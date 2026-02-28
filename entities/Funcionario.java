package entities;

public class Funcionario {
	protected String nome = null;
	protected Integer horas = null;
	protected Double valorHora = null;
	
	public Funcionario() {}
	public Funcionario(String nome, Integer horas, Double valorHora) {
		this.nome = nome;
		this.horas = horas;
		this.valorHora = valorHora;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getHoras() {
		return this.horas;
	}
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public Double getValorHora() {
		return this.valorHora;
	}
	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
	
	public Double pagamento() {
		return this.horas * this.valorHora;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Funcionário: " + nome);
		sb.append("\nHoras Trabalhadas: " + horas);
		sb.append("\nValor da hora: " + String.format("%.2f",valorHora));
		sb.append("\nPagamento final: " + String.format("%.2f",pagamento()));
		return sb.toString();
	}
}
