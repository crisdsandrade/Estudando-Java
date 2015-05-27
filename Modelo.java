public class Modelo {
	public static void main(String[] args) {
		//Aqui temos declarações de variáveis sem atribuição de valores.		
		String nome, data, linha;
		int numero1, numero2;
		
		//Aqui atribuímos os valores às variáveis através do operador =
		nome = "caiosantesso";
		data = "26.05.2015";
		numero1 = 25;
		numero2 = 4;
		linha = "'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''";
		
		//Métodos para exibição do programa no console
		System.out.printf("%n%s%n", linha);
		System.out.printf("Programa Para Exibição de Operações Aritméticas%n");
		System.out.printf("%s%n", linha);
		System.out.printf("Autor: %s%n", nome);
		System.out.printf("Criado em: %s%n%n%n", data);
		System.out.printf("%-15s %s %n", "Descrição", "Operação");
		System.out.printf("%-15s %d + %d = %d%n","Soma", numero1, numero2, numero1 + numero2);
		System.out.printf("%-15s %d - %d = %d%n","Subtração", numero1, numero2, numero1 - numero2);
		System.out.printf("%-15s %d * %d = %d%n","Multiplicação", numero1, numero2, numero1 * numero2);
		System.out.printf("%-15s %d / %d = %d%n","Divisão", numero1, numero2, numero1 / numero2);
		System.out.printf("%-15s %d %% %d = %d%n%n", "Resto", numero1, numero2, numero1 % numero2);
		
		linha = "******************************************************************";
		
		System.out.printf("%s%n%n", linha);
		
		
		/* Novos conceitos: 
		 * -> declarar variável numa linha e atribuir valor em outra.
		 * -> declarar mais de uma variável do mesmo tipo separando-as por vírgula.
		 * -> na String de formatação precisar digitar %% para que seja reconhecido o caracter %
		 * -> usar um tamanho fixo no %s como %20s, o que faz o console exibir um espaço de 20 caracteres.
		 * -> usar justificar à esquerda (-) como em %-6s.
		 * -> atribuir novos valores à uma variável que já tinha valor, como ocorreu com linha que tinha '
		 * e foi substituído por *.
		 */
		
		
		
	}
}
