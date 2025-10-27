package Objetos;

public class Funcionario {
	private String nome;
	private double salario;

	public Funcionario(String nome, double salario)
	{
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome()
	{
		return this.nome;
	}

	public double getSalario()
	{
		return this.salario;
	}

	public void aumentarSalario(double porcentagem)
	{	
		if (porcentagem <= 0)
		{
			System.out.println("Porcentagem inválida. O valor deve ser maior que 0");
			return;
		}

		this.salario = this.salario * (1 + (porcentagem / 100.0));
	}

}
