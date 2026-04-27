package Secao09;

public class Objeto {

	// EXEMPLO DE ENCAPSULAMENTO
	public int val1;
	private int val2;
	protected int val3;
	
	// CONSTRUTOR PADRÃO
	public Objeto() {
		// EXEMPLO DO PONTEIRO THIS
		this.val1 = 0;
		this.val2 = 0;
		this.val3 = 0;
	}
	
	// CONSTRUTOR QUE PERMITE INICIAR O OBJETO COM VALORES
	public Objeto(int val1, int val2, int val3) {
		this.val1 = val1;
		this.val2 = val2;
		this.val3 = val3;
	}


	// GETTERS & SETTERS
	public int getVal2() { return val2; }
	public void setVal2(int val2) { this.val2 = val2; }
	public int getVal3() { return val3; }
	public void setVal3(int val3) { this.val3 = val3; }
	
	
	
}
