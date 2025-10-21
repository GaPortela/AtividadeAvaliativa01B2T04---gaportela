package Principal;

import Objetos.*;

public class Principal {

	public static void main(String[] args) {
//		AtvUm();
		AtvDois();		
	}
	
	public static void AtvUm(){
		var conta = new ContaBancaria("Jão");
		
		System.out.println(conta.consultarSaldo());
		System.out.println(conta.consultarTitular());
		
		conta.depositar(-2);
		conta.depositar(1000);
		
		conta.sacar(1100);
		conta.sacar(900);
		
		conta.extrato();
	}
	
	public static void AtvDois(){
		
	}
}
