package Objetos;

public class Filme {
	private String titulo;
	private double avaliacao;

	public Filme(String titulo)
	{
		this.setTitulo(titulo);
	}

	public Filme(String titulo, double avaliacao)
	{
		this.setTitulo(titulo);
		this.setAvaliacao(avaliacao);
	}

	public String getTitulo()
	{
		return this.titulo;
	}

	public void setTitulo(String novoTitulo)
	{
		// Valida se o titulo está vazio
		if (novoTitulo != null && !novoTitulo.isBlank()) this.titulo = novoTitulo;
	}

	public double getAvaliacao()
	{
		return this.avaliacao;
	}


	public void setAvaliacao(double novaAvaliacao)
	{
		// Valida se a nota está entre 0 e 5
		if (novaAvaliacao >= 0 && novaAvaliacao <= 5)     this.avaliacao = novaAvaliacao;
		
	}

	public void infos()
	{
		System.out.println("Filme: " + getTitulo() + "\nAvaliacao: " + getAvaliacao() + "⭐");
	}
}
