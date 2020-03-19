package registros;

public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
    private String ie;
    
    public PessoaJuridica(){
    	super();
        this.cnpj = null;
        this.ie = null;
    }
    
    /*Getters & Setters*/
    
    public String getIe() {
		return this.ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}
	
	@Override
	public String getTipo() {
		return "Pessoa Juridica";
	}

	@Override
	public String getDocumento() {
		return this.cnpj;
	}

	@Override
	public void setDocumento(String documento) {
		this.cnpj=documento;
		
	}
}
