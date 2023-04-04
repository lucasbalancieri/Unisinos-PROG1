// Exercício 1 - Crie uma classe chamada Cor, que possui 3 inteiros como atributos, sendo eles r, g e b. 
public class Cor{
	//atributos
	private int r;
	private int g;
	private int b;

	//construtor
	public Cor(int r, int g, int b){
		this.r = r;
		this.g = g;
		this.b = b;
	}

	// exemplo sobrecarga de construtor
	public Cor(int r, int b){ //permite construir um objeto Cor com apenas 2 parâmetros.
		this.r = r;
		this.b = b;
	}
	
	//getters and setters
	public int getR(){
		return this.r;
	}

	public void setR(int r){
		this.r = r;
	}

	public int getG(){
		return this.g;
	}
	
	public void setG(int g){
		this.g = g;
	}

	public int getB(){
		return this.b;
	}
	
	public void setB(int b){
		this.b = b;
	}

}
