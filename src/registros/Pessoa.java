package registros;

public abstract class Pessoa {
    private String nome;
    private String telefone;
    private String dataCadastro;
    private Endereco endereco;
    private int numCompras;
    
    public abstract String getTipo();
    public abstract String getDocumento();
    public abstract void setDocumento(String documento);
    
    public Pessoa(){
      this.nome = null;
      this.telefone = null;
      this.dataCadastro = null;
      this.endereco = null;
      this.numCompras = 0;
    }
    
    /*Getters & Setters*/
    
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getNumCompras() {
		return numCompras;
	}

	public void setNumCompras(int numCompras) {
		this.numCompras = numCompras;
	}
    
    

}

