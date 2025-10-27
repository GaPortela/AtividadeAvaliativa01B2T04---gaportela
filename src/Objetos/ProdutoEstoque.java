package Objetos;

public class ProdutoEstoque {
	private String nome;
	private int quantidade;

	public ProdutoEstoque(String nome, int qtd)
	{
		if (!nome.isBlank())
		{
			this.nome = nome;
		} else {
			System.out.println("Erro na declaração do nome");
		}

		if (qtd > 0)
		{
			this.quantidade = qtd;
		} else {
			System.out.println("Erro na declaração de quantidade");
		}

	}

	public String getNome() {return this.nome;}
	public int getQuantidade() {return this.quantidade;}

	public void setNome(String novoNome)
	{
		if (!novoNome.isBlank())
		{
			this.nome = novoNome;
			return;
		}
		System.out.println("Nome inválido.");
	}

	public void adicionarEstoque(int qtd)
	{
		// Valida se a quantidade é maior que 0
		if (qtd > 0)
		{
			this.quantidade += qtd;
			return;
		}
		System.out.println("Quantidade a ser adicionada não pode ser nula ou ser menor que 0");
	}

	public void removerEstoque(int qtd)
	{
		// Valida se a quantidade de itens é menor que o que existe no estoque
		if (!(this.quantidade - qtd < 0))
		{
			this.quantidade -= qtd;
			return;
		}
		System.out.println("Insira um valor que não deixe o estoque negativado.");
	}

}
