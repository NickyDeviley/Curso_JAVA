package Secao14.Exercicio;

public class Conta {

	// Atributos
	private int numero;				// Número da conta
	private String holder;			// Dono conta
	private double balance;			// saldo
	private double withdrawLimit;	// Limite de saque
	
	// Construtores
	public Conta() {}
	public Conta(int numero, String holder, double balance, double withdrawLimit) throws OutOfLimitsException {
		
		if (numero > 0 && balance >= 0 && withdrawLimit > 0) {
			this.numero = numero;
			this.holder = holder;
			this.balance = balance;
			this.withdrawLimit = withdrawLimit;
		}
		else {
			throw new OutOfLimitsException("Valor inválido! Conta não registrada, tente novamente.");
		}
	}

	// Comportamentos
	public void deposit(double amount) {
		// DEPOSITAR
		this.balance += amount;
		
	}
	
	public void withdraw(double amount) throws OutOfLimitsException {
		// SACAR
		if (amount <= this.withdrawLimit && amount > 0.0) {
			balance -= amount;
		}
		else {
			throw new OutOfLimitsException("Valor para saque inválido!");
		}
	}
	
	// Getters & Setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
}
