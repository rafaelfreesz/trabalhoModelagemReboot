package registros;

public class VendaAVista extends Venda{
	private double desconto;

	public VendaAVista() {
		super();
		this.desconto = 0;
	}

	@Override
	public String getFormaPagamento() {
		return "A vista";
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	

}
