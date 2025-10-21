package Objetos;

public class ContaBancaria {
	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular){
		this.SetTitular(titular);
	}
	
	public ContaBancaria(String titular, double saldo){
		this.SetTitular(titular);
		if (saldo >= 0) this.saldo = saldo;
	}
	
	public void SetTitular(String titular) {
		if (titular != null && !titular.isBlank()) this.titular = titular;
	}
	
	public String consultarTitular(){
		return this.titular;
	}

	public double consultarSaldo(){
		return this.saldo;
	}
	
	public void depositar(double valor) {
        if (valor > 0) {
        	saldo += valor;
        	return;
        }
        
        System.out.println("Deposito inválido. O Valor deve ser positivo");
    
	}

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
        	saldo -= valor;
        	return;
        }
        System.out.println("Saque inválido. Saldo Insuficiente");
    }
     
    public void extrato(){
    	System.out.println("--------------------------");
    	System.out.println("Titular: "+ this.consultarTitular());
    	System.out.println("Saldo: "+ this.consultarSaldo());
    	System.out.println("--------------------------");
    }
}
