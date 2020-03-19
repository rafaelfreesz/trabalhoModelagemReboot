package registros;


public class Empresa {
	
	private static Empresa empresa=new Empresa();
	private static String cnpj="000.222.333/00001-00";
	private static String razaoSocial="Carioca Multimarcas LTDA";
	private static String enderecoCompleto="Rua do Jão, nº 77 - Centro - Juiz de Fora/MG";
	
	private Empresa() {}
	
	public Empresa getInstance() {
		return empresa;
	}
	public static void emitirCabecalho() {
		System.out.println(razaoSocial);
		System.out.println("CNPJ: "+cnpj);
		System.out.println(enderecoCompleto);
		System.out.println("-------------------------------------");
		
	}

	public String getDocumento() {
		return cnpj;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}


}
