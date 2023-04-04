/*
Exercício 6. Pesquise (se necessário) e responda: o que é sobrecarga de métodos? 

R: A sobrecarga de métodos é um recurso da programação orientada a objetos que permite criar vários métodos com o 
mesmo nome, mas que recebem diferentes tipos ou números de argumentos.
Com a sobrecarga de métodos, é possível definir vários métodos com o mesmo nome, mas com diferentes assinaturas.
Quando um método é chamado, o compilador seleciona o método correto com base no número e tipos dos argumentos 
passados.
*/

//Exemplo: 
public class Calculadora {
  public int soma(int a, int b) { // método soma com o construtor utilizando int
    return a + b;
  }

  public double soma(double a, double b) { // método soma com o construtor utulizando double.
    return a + b;
  }
}

calculadora.soma(2, 3) // irá chamar o primeiro método soma
calculadora.soma(2.5, 3.5) // irá chamar o segundo método soma

/*
Exercício 8. O que são atributos? E o que são métodos?

R: Atributos: são caracteristicas dos objetos criados a partir da classe, funcionam como variáveis. 
ex: private int a; privante int b;

Métodos: São as ações que os objetos da classe podem realizar.
ex: soma, pegar valores atribulos, alterar valores dos atributos etc...
*/

/*
Exercício 9. O  que  é  e  para  que  serve um  método construtor? 
Quais  as  duas características necessárias para que um método seja o construtor da classe? 
Exemplifique sua resposta.

R: É o metodo especial responsável pela construção do objeto da classe na instanciação. 

É necessário que o construtor tenha o mesmo nome da classe e seja public para que possa 
ser acessado de fora da classe através do "new".

Exemplo:
Quando chamamos "Produto prod = new Produto("prod1", 1.50)" estamos invocando o construtor da classe Produto.
//construtor da classe Produto
public Produto(String nome, int peso){
  this.nome = nome;
  this.peso = peso;
}

Portanto, o objeto será instanciado com os valores "prod1" para o atributo nome e 1.50 para o atributo peso. 
*/


/*
Exercício 10. O que são e para que servem os métodos de acesso de uma classe? Exemplifique sua resposta.

R: os métodos de acesso (get e set) são responsáveis por coletar e atualizar informações do objeto da classe.

Exemplo:
*/
public class Produto{
  private String nome;

  public String getNome(){
    return this.nome;
  }

  public void setNome(String nome){
    this.nome = nome
  }
}

Produto prod = new Produto("prod1", 1.50)
prod.getNome() // retorna "prod1" pois foi o nome atribuido na instanciação;
prod.setNome("novoNome") // atualizada o valor do atributo nome para "novoNome"
prod.getNome() // retorna "novoNome"

/*
 Exercício 11.  Seja x  uma variável inteira. Pesquise e responda: 
 qual a diferença entre a utilização de x++  e ++x  no código? 
 Exemplifique sua resposta.

 R: x++ é chamada de pós-incremento, o valor de x é incrementado somente após 
 o uso da variável na linha de código em que é aplicado.

 ++x é chamada de pré-incremento, o valor de x é incrementado antes da utilização
 da variável na linha de código em que é aplicado.
 Exemplo:
*/

//pós-incremento
int x = 1;
int y = x++; // y recebe o valor de x (1) e depois x é incrementado em 1

System.out.println("x = " + x); // x = 2
System.out.println("y = " + y); // y = 1

//pré-incremento
int x = 1;
int y = ++x; // x é incrementado em 1 e depois y recebe o novo valor de x (2)

System.out.println("x = " + x); // x = 2
System.out.println("y = " + y); // y = 2


/*
Exercício 13.  Pesquisa (se necessário) e responda: o que é o método toString()? 
Como seria um exemplo de método toString()  dentro da classe ContaCorrente  descrita no exercício 12?

R: O método toString() é um método que retorna uma representação em String do objeto.
Se passarmos um dos objetos da classe(conta1, conta2 ou conta3) para o System.out.println() sem a implementação do toString(),
o print retornará algo como "contacorrente.ContaCorrente@1d251891" que é a identificação do objeto na memória em formato string.

Quando o toString() é implementado, ele sobrescreve o retorno string padrão da classe e retorna o que foi definido no escopo do toString().
Exemplo:
*/ 
    public String toString() {
        return "Número da Conta: " + numeroConta +
                "\nSaldo Atual: " + saldoAtual +"\n";
    }
  
        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);
/*
        Retorno:
        Número da Conta: 1234
        Saldo Atual: 100.0

        Número da Conta: 8765
        Saldo Atual: -98.0

        Número da Conta: 3342
        Saldo Atual: 3445.8
*/

