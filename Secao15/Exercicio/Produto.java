package Secao15.Exercicio;

public class Produto {

	private String nome;
	private double precoUnitario;
	private int qtd;
	
	// Construtor
	public Produto(String nome, double precoUnitario, int qtd) {
		
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.qtd = qtd;
		
	}
	
	// Método para calcular o preço total
	public double calcPrecoTotal() {
		
		return precoUnitario * qtd;
		
	}

	
	// GETTERS & SETTERS
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }

	public double getPrecoUnitario() { return precoUnitario; }
	public void setPrecoUnitario(double precoUnitario) { this.precoUnitario = precoUnitario; }

	public int getQtd() { return qtd; }
	public void setQtd(int qtd) { this.qtd = qtd; }
	
	
	
}
