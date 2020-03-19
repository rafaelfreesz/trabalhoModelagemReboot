package registros;

public class ProdutoBlusa extends Produto {
	
	/*Getters & Setters*/
	
	public void setTamanho (String tamanho) {
		this.tamanho=tamanho;
	}
	public String getTamanho() {
		return this.tamanho;
	}
	@Override
	public String getTipo() {
		return "Calça";
	}
}
