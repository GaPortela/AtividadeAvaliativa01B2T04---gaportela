package Objetos;

import java.time.Duration;


public class Musica {
	private String titulo;
	private int duracaoSegundos;

	public Musica(String titulo, int duracaoSegundos)
	{
		this.setTitulo(titulo);
		this.setDuracao(duracaoSegundos);
	}

	public String getTitulo()
	{
		return this.titulo;
	}

	public int getDuracao()
	{
		return this.duracaoSegundos;
	}

	public void setTitulo(String novoTitulo)
	{
		// Valida se o titulo não está vazio
		if (novoTitulo != null && !novoTitulo.isBlank())
		{
			this.titulo = novoTitulo;
			return;
		}
		System.out.println("Titulo inválido.");
	}

	public void setDuracao(int duracaoSegundos)
	{
		// Valida se a duração não está vazia ou é 0
		if (duracaoSegundos > 0)
		{
			this.duracaoSegundos = duracaoSegundos;
			return;
		}
		System.out.println("Duração inválida.");
	}

	public String formatarDuracao()
	{
		Duration duracao = Duration.ofSeconds(duracaoSegundos);
        long minutos = duracao.toMinutes();
        long segundosRestantes = duracao.toSeconds() % 60;

        String tempoFormatado = String.format("%02d:%02d", minutos, segundosRestantes);

		return tempoFormatado;
	}
}
