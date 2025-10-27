package Objetos;

public class Temperatura {
	private double celsius;

	public Temperatura(double grausCelsius) {
		this.setTemperatura(grausCelsius);
	}

	public double getTemperatura() {
		return this.celsius;
	}

	public void setTemperatura(double novaTempCelsius)
	{
		// Valida se a temperatura é maior que o zero absoluto
		if (novaTempCelsius >= -273.15)
		{
			this.celsius = novaTempCelsius;
			return;
		}
		System.out.println("O sistema não permite que a temperatura seja menor que zero absoluto.");
	}
	
	public double paraKelvin()
	{
		return this.celsius + 273.15;
	}

	public double paraFahrenheit()
	{
		return (this.celsius * 9/5) + 32;
	}
}
