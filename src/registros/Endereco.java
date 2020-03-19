package registros;

public class Endereco {
	private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private String numero;
    private String complemento;
    private String cep;
	
    public Endereco() {
		super();
		this.rua = null;
		this.bairro = null;
		this.cidade = null;
		this.estado = null;
		this.pais = null;
		this.numero = null;
		this.complemento = null;
		this.cep = null;
	}

    /*Getters & Setters*/
    
	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCEP(String cep) {
		this.cep = cep;
	}
    
    
}
