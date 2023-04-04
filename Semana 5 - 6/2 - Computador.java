// Exercício 2. Crie uma classe chamada Computador, que possui 4 atributos, sendo eles a marca, a velocidade, o ano de fabricação e um atributo que indica se o computador é novo.
public class Computador{
	//atributos
	private String marca;
	private int velocidade;
	private int anoFabricacao;
	private boolean novo;

	//construtor
	public Computador(String marca, int velocidade, int anoFabricacao, boolean novo){
		this.marca = marca;
		this.velocidade = velocidade;
		this.anoFabricacao = anoFabricacao;
		this.novo = novo;
	}

	// exemplo sobrecarga de construtor
	public Computador(String marca, boolean novo){ //permite construir um objeto Computador com apenas 2 parâmetros.
		this.marca = marca;
		this.novo = novo;
	}

	//getters and setters
	public String getMarca(){
		return this.marca;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

	public int getVelocidade(){
		return this.velocidade;
	}

	public void setVelocidade(int velocidade){
		this.velocidade = velocidade;
	}

	public int getAnoFabricacao(){
		return this.anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao){
		this.anoFabricacao = anoFabricacao;
	}

	public boolean getNovo(){
		return this.novo;
	}

	public void setNovo(boolean novo){
		this.novo = novo;
	}
}