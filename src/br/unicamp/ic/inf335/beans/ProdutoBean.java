package br.unicamp.ic.inf335.beans;

public class ProdutoBean implements java.io.Serializable, Comparable<ProdutoBean>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String codigo;
	private String nome;
	private String descricao;
	private Double valor;
	private String estado;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public ProdutoBean () {
		codigo = new String();
		nome = new String();
	    descricao = new String();
		valor = 0.0;
		estado = new String();
	}
	
	
	public ProdutoBean(String codigo, String nome, String descricao, Double valor, String estado) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.estado = estado;
	}
	
	@Override
	public int compareTo(ProdutoBean p) {
		if (valor < p.getValor()) {
			return 1;
		} else if (valor > p.getValor()) {
			return -1;
		} else
		    return 0;
	}

//	Codigo = CD00001 Nome = Celular Galaxy S10 Valor = 1250.0
//	Codigo = CD00002 Nome = Prod 2 ... Valor = 1100.0
//	Codigo = CD00003 Nome = Prod 3 ... Valor = 120.0
//	Codigo = CD00004 Nome = Prod 4 ... Valor = 1300.0
//	Codigo = CD00005 Nome = Prod 5 ... Valor = 9400.0
//	Codigo = CD00006 Nome = Prod 6 ... Valor = 1500.0

}
