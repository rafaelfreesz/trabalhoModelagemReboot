package registros;

public abstract class Produto {
	
	private String codigo;
    private int qtdEstoque;
    private double valorUnitario;
    private String descricao;
    private String sexo;
    private String dataCadastro;
    protected String tamanho;
    
    public abstract String getTipo();
    
    public Produto(){
        this.codigo = null;
        this.qtdEstoque = 0;
        this.valorUnitario = 0.0;
        this.descricao = null;
        this.sexo = null;
        this.dataCadastro = null;
    }
    
    /*Getters & Setters*/
    
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	/*METODOS E FUNCOES*/
	
	public double calcularPrecoTotal(int quantidade) {
		return this.valorUnitario*quantidade;
	}
	public String toString() {
		return this.descricao;
	}

}
