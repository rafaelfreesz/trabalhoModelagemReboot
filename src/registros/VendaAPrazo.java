package registros;

public class VendaAPrazo extends Venda {
	private int parcelas;
	private double valorParcela;
	
	
	public VendaAPrazo() {
		super();
		this.parcelas = 0;
		this.valorParcela = this.getValorTotal();
	}


	public int getParcelas() {
		return parcelas;
	}


	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
		calcularPrestacao();
	}


	public double getValorParcela() {
		return valorParcela;
	}

	@Override
	public String getFormaPagamento() {
		return"A prazo";
	}
	
	private void calcularPrestacao() {
		this.valorParcela=this.valorTotal/parcelas;
	}

}
