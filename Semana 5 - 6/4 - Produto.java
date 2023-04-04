//Exercício 4. Crie uma classe chamada Produto, que possui um nome, um valor, uma descrição (tipo String) e 
//uma quantidade em estoque.

public class Produto{
	//atributos
	private String nome;
	private double valor;
	private String descricao;
	private int quantidade;

	//construtor
	public Produto(String nome, double valor, String descricao, int quantidade){
		this.nome = nome;
		this.valor = valor;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}
	
	// exemplo sobrecarga de construtor
	public Produto(String nome, int quantidade){ // permite construir um objeto Produto com apenas 2 parâmetros.
		this.nome = nome;
		this.quantidade = quantidade;
	}

	// getters and setters
		public String getNome(){
			return this.nome;
		}

		public void setNome(String nome){
			this.nome = nome;
		}

		public double getValor(){
			return this.valor;
		}

		public void setValor(double valor){
			this.valor = valor;
		}

		public String getDescricao(){
			return this.descricao;
		}

		public void setDescricao(String descricao){
			this.descricao = descricao;
		}

		public int getQuantidade(){
			return this.quantidade;
		}

		public void setQuantidade(int quantidade){
			this.quantidade = quantidade;
		}
}