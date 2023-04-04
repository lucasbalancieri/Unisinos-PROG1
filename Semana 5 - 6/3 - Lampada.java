// Exercício 3. Crie uma classe chamada Lampada, que possui um atributo indicando se a lâmpada está ligada.

public class Lampada{
	//atributos
	private boolean ligada;

	//construtor
	public Lampada(boolean ligada){
		this.ligada = ligada;
	}

	// exemplo sobrecarga de construtor
	public Lampada(){ // permite a cronstrução do objeto Lampada sem informar seu estado.

	}

	//getters and setters

	public boolean getLigada(){
		return this.ligada;
	}

	public void setLigada(boolean ligada){
		this.ligada = ligada;
	}
}