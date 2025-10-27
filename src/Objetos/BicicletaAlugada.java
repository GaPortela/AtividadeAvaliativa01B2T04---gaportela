package Objetos;

public class BicicletaAlugada {
	private int horas;
	private double valorHora;

	public BicicletaAlugada(int horas, double valor)
	{
		this.setHoras(horas);
		this.setValorHora(valor);
	}

	public int getHoras()
	{
		return this.horas;
	}

	public double getValorHora()
	{
		return this.valorHora;
	}


	public void setHoras(int qtd)
	{
	// Valida se está sendo alugada pelo numero de horas minimas (1) 
		if (qtd >= 1)
		{
			this.horas = qtd;
			return;
		}
		System.out.println("O número de horas minimas para ser alugada é 1");
	}

	public void setValorHora(double valor)
	{
	// Valida se o valor das horas é maior que 0
		if (valor > 0)
		{
			this.valorHora = valor;
			return;
		}
		System.out.println("o Valor das horas deve ser maior que 0");
	}

	public double calcularValor()
	{
		return this.horas * this.valorHora;
	}
}
