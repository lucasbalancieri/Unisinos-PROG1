// declarar classe
public class Pessoa{
	//atributos
	//visibilidade(pública ou privada) tipo nome
	private String nome;
	private int idade;
	private double altura;
	private char sexo;

	//construtor
	public Pessoa(){
		//construtor da classe Pessoa sem parâmetros
	}

	public Pessoa(String nome, int idade, double altura, char sexo){
		//construtor da classe Pessoa recebendo uma String como parâmetro
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.sexo = sexo;
	}

	//getters e setters
	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public int getIdade(){
		return idade;
	}

	public void setIdade(int idade){
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}

//instanciar objetos
Pessoa pessoa = new Pessoa(); // o método construtor da classe Pessoa é chamado para a instanciar o novo objeto.

pessoa.setAltura(1.72); //altera a altura para 1.72
String nomePessoa = pessoa.getNome(); // pega o nome do objeto Pessoa referenciado por pessoa e armazena em nomePessoa.
