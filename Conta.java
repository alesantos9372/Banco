package Banco;

public abstract class Conta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected int saldo;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public void sacar(double valor) {
		
		saldo -= valor;
		
	}
	
	public void depositar(double valor) {
		saldo += valor;
		
	}
	
	public void transferir(double valor, Conta contaDestino) {
		sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	public void imprimirDados() {
		System.out.println("Cliente:" + cliente.getNome());
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Numero: " + numero);
		System.out.println("Saldo: " + saldo);
		
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public int getSaldo() {
		return saldo;
	}

	

	

}
