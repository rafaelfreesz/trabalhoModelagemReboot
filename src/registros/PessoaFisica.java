package registros;

public class PessoaFisica extends Pessoa {
	
	private String cpf;
    private String dataNasc;
    private String sexo;
    
    public PessoaFisica(){
    	super();
        this.cpf = null;
        this.dataNasc = null;
        this.sexo = null;
    }
    
    /*Getters & Setters*/
    
	public String getDataNasc() {
		return dataNasc;
	}



	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	@Override
	public String getTipo() {
		return "Pessoa Fisica";
	}

	@Override
	public String getDocumento() {
		return this.cpf;
	}

	@Override
	public void setDocumento(String documento) {
		this.cpf=documento;
		
	}
	

}
