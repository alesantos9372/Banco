package Banco;

public class Main {
	
	public static void main(String[] args) {
		Cliente alexandre = new Cliente();
		alexandre.setNome("Alexandre");
		
		
		
		ContaCorrente cc = new ContaCorrente(alexandre);
		ContaPoupanca poupanca = new ContaPoupanca(alexandre);
		
		cc.depositar(100);
		cc.transferir(50, poupanca);
		
		
		cc.imprimirExtrato();
		cc.imprimirDados();
		
		poupanca.imprimirExtrato();
		poupanca.imprimirDados();
		
		
	}

}
