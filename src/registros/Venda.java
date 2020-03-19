package registros;

import java.util.ArrayList;

public abstract class Venda {
	private String codigo;
    protected double valorTotal;
    private Pessoa cliente;
    private String dataVenda;
    private int codigoProduto;
    private ArrayList<Retirada> retiradas;
    
    
    public abstract String getFormaPagamento();
    
    public Venda() {
    	this.codigo=null;
    	this.valorTotal=0;
    	this.cliente=null;
    	this.dataVenda=null;
    	this.retiradas=new ArrayList<Retirada>();  	
    }
    
    /*GETTERS & SETTERS*/
    
    public String getCodigo() {
		return this.codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public double getValorTotal() {
		return this.valorTotal;
	}


	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}


	public Pessoa getCliente() {
		return this.cliente;
	}


	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}


	public String getDataVenda() {
		return this.dataVenda;
	}


	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}


	public int getCodigoProduto() {
		return this.codigoProduto;
	}


	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}


	public ArrayList<Retirada> getRetiradas() {
		return this.retiradas;
	}


	public void setRetiradas(ArrayList<Retirada> retiradas) {
		this.retiradas = retiradas;
	}
	
	/*METODOS & FUNÇÕES*/
	
	/*Metodo cria uma nova retirada e a inclui na lista de retiradas dessa venda. Atualzia tambem o valor total*/
    public void incluirRetirada(Produto produto, int quantidade) {
		if (produto != null) {

			Retirada retirada = new Retirada(produto, quantidade, this);
			
			this.valorTotal+=retirada.getTotal();
			
			if (retirada.getTotal() != 0) {
				alocarRetirada(retirada);
			}

		}
	}
    /*Metodo aloca na lista de retiradas a retirada do parâmetro*/
    public void alocarRetirada(Retirada retirada) {
		if (retirada != null) {
			if (!contemRetirada(retirada)) {
				this.retiradas.add(retirada);
			}
			if(retirada.getVenda()!=this) {
				retirada.getVenda().getRetiradas().remove(retirada);
				retirada.setVenda(this);
			}
		}
	}
    
    /*Função verifica se na lista de retiradas já contém a retirada do parâmetro*/
    public boolean contemRetirada(Retirada retirada) {
		return this.retiradas.contains(retirada);
	}
    
    /*Calcula e retorna o valor total da venda, a qualquer momento*/
    public double calcularTotal() {
    	double somatorio=0D;
		for(Retirada retirada:this.retiradas) {
			somatorio+=retirada.getTotal();
		}
		return somatorio;
    	
    }
    
    /*Imprime na tela a "nota fical", com  todos os itens da venda, seus respectivos valores e o total*/
	public void imprimirVenda() {
		Empresa.emitirCabecalho();
		double somatorio=0F;
		for(Retirada retirada:this.retiradas) {
			somatorio+=retirada.getTotal();
			System.out.println(retirada);
		}
		System.out.println("Somatório da venda: R$"+somatorio);
		System.out.println();
	}
    
}
