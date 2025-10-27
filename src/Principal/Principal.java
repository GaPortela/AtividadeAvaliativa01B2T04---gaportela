package Principal;

import Objetos.*;

public class Principal {

	public static void main(String[] args) {
//		AtvUm();
//		AtvDois();
//		AtvTres();
//		AtvQuatro();
		AtvCinco();
//		AtvSeis();
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
		var filme1 = new Filme("Segredo", 4.6);
		var filme2 = new Filme("Segredo 2", 5);

		filme1.infos();
		filme2.infos();
	}
	
	public static void AtvTres(){
		var func = new Funcionario("João", 1800);
		System.out.println("Funcionário: " + func.getNome());
		System.out.printf("Salário: R$%.2f", func.getSalario());

		func.aumentarSalario(10.0);

		System.out.printf("\nSalário pós acréscimo: R$%.2f", func.getSalario());
	}
	
	public static void AtvQuatro(){
		var retangulo = new Retangulo(2, 5);
		var areaRetangulo = retangulo.getArea();
		var perimetroRetangulo = retangulo.getPerimetro();

		System.out.println("Dimensões: " + retangulo.getAltura() + "cm x " + retangulo.getLargura() + "cm");
		System.out.println("Área: " + areaRetangulo);
		System.out.println("Perímetro: " + perimetroRetangulo);
	}
	
	public static void AtvCinco(){
		var m1 = new Musica("Segredo", 150);
		var m2 = new Musica("Segredo da casa", 120);

		System.out.println("Musica: " + m1.getTitulo() + " - Duração: " + m1.formatarDuracao() + "m");
		System.out.println("Musica: " + m2.getTitulo() + " - Duração: " + m2.formatarDuracao() + "m");
	}
	
	public static void AtvSeis()
	{
		var pessoa = new Pessoa("João", 70.0, 1.8);
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Estado atual: " + pessoa.classificacaoIMC());
		System.out.printf("IMC: %.2f", pessoa.calculoIMC());

	}
}
