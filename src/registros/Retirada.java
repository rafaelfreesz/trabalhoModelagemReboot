package registros;



public class Retirada {
	private Produto produto;
	private int quantidade;
	private double total;
	private Venda venda;
	
	public Retirada(Produto produto, int quantidade, Venda venda) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.venda = venda;
		if (!venda.contemRetirada(this)) {
			venda.alocarRetirada(this);
		}
		this.total = produto.calcularPrecoTotal(quantidade);
	}

	/*Getters & Setters*/
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	
	public String toString() {
		return "- " + this.produto + ", quantidade: " + this.quantidade + ", total: R$" + this.total + ";";
	}
	
}
