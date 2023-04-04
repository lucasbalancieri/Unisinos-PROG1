/*
Exercício 14. Considerando a classe abaixo, crie um método  main  que chama todos os métodos desta classe. A última linha de código deve ser a chamada ao método imprimeInformacoes(), na qual todas as informações devem aparecer corretamente.

public class Empregado{
   private String nome;
   private char turno;
   private double salario;
   public void aumentaSalario(double aumento){
      this.salario += aumento;
   }
   public double calculaAdicionalNoturno(){
      if(turno == 'n')
         turno = 'N';
      if(turno == 'N')
         return salario + salario*0.3;
      return 0;
   }
   public void imprimeInformacoes(){
      System.out.println("Nome: "+nome);
      System.out.println("Turno: "+turno);
      System.out.println("Salário: "+salário);
      System.out.println("Adicional noturno: "+calculaAdicionalNoturno());
   }
   public Empregado(String nome){
      this.nome = nome;
   }
   public void setTurno(char turno){
      this.turno = turno;
   }
   public void setSalario(double salario){
      this.salario = salario;
   }
}
*/
public class Main {
	   public static void main(String[] args) {
		  Empregado empregado1 = new Empregado("Teste");
		  empregado1.setSalario(1000.00);
		  empregado1.aumentaSalario(200);
		  empregado1.setTurno('N');
		  empregado1.calculaAdicionalNoturno();
		  empregado1.imprimeInformacoes();
	   }
	}