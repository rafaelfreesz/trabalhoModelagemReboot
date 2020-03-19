package registros;

public class Login {
	
	private String usuario;
    private String senha;
    private String tipo;
    
	public Login() {
		this.usuario = null;
		this.senha = null;
		this.tipo = null;
	}

	/*Getters & Setters*/
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
    
	
	
	

}
