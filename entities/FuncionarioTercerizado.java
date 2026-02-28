package entities;

public final class FuncionarioTercerizado extends Funcionario{
	private Double custoAdicional = null;
	
	public FuncionarioTercerizado(String nome, Integer horas, Double valorHora, Double custoAdicional) {
		super(nome, horas, valorHora);
		this.custoAdicional = custoAdicional;
	}
	
	public Double getCustoAdicional() {
		return this.custoAdicional;
	}
	public void setCustoAdicional(Double custoAdicional) {
		this.custoAdicional = custoAdicional;
	}
	
	@Override
	public Double pagamento() {
		return super.pagamento() + (custoAdicional * 1.10);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Funcionário  Tercerizado: " + nome);
		sb.append("\nHoras Trabalhadas: " + horas);
		sb.append("\nValor da hora: " + String.format("%.2f",valorHora));
		sb.append("\nCusto Adicional: " + String.format("%.2f", getCustoAdicional()));
		sb.append("\nPagamento final: " + String.format("%.2f", pagamento()));
		return sb.toString();
	}
}
