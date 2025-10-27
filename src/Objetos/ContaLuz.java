package Objetos;

public class ContaLuz {
	private double consumoKwh;
	private double valorKwh;

	public ContaLuz(double consumo, double valor)
	{
		this.setConsumo(consumo);
		this.setValorKwh(valor);
	}

	public double getConsumo()
	{
		return this.consumoKwh;
	}

	public double getValorKwh()
	{
		return this.valorKwh;
	}

	public void setConsumo(double consumo)
	{
	//	Valida se o consumo é maior que 0
		if (consumo > 0)
		{
			this.consumoKwh = consumo;
			return;
		}
		System.out.println("Consumo inválido.");
	}

	public void setValorKwh(double valor)
	{
	//	Valida se o valor do consumo é maior que 0
		if (valor > 0)
		{
			this.valorKwh = valor;
			return;
		}
		System.out.println("Valor inválido.");
	}

	public double calcularValorTotal()
	{
		return this.consumoKwh * this.valorKwh;
	}
}
