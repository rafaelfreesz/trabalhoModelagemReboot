package registros;

public class ProdutoCalca extends Produto {
	
	/*Getters & Setters*/
	
	public void setNumero (String numero) {
		this.tamanho=numero;
	}
	public String getNumero() {
		return this.tamanho;
	}
	@Override
	public String getTipo() {
		return "Calça";
	}

}
