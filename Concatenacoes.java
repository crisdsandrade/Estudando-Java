public class Concatenacoes {
    public static void main(String[] args) {
      
      /* println() é um método.
      () definem os parâmetros do método. Nesse caso, não temos parâmetros.
      */
      System.out.println(); //Exibe quebra de linha.
      
      // Podemos enviar uma literal de string como parâmetro.
      System.out.println("Sou uma literal de string");
      
      
      String palavra = "Estou numa variável.";
      
      // Ou enviar uma referência à alguma variável.
      System.out.println(palavra); 
      
      //Podemos concatenar strings antes de atribuí-las à variável.
      String concatenada = "Caio" + " e " + "Cris";

      System.out.println(concatenada);

      //Bem como podemos concatenar literais e refências no parâmetro do método.
      System.out.println(concatenada + " formam um belo casal.");

      /*Ao utilizar o operador + com inteiros e strings, ele funcionará como concatenador
      e não como soma.
      */
      int diaAbolicao = 13;
      int mesAbolicao = 05;
      int anoAbolicao = 1888;

      String separador = ".";

      String dataAbolicao = diaAbolicao + separador + mesAbolicao + separador + anoAbolicao;
      String textoAbolicao =  "Data da sanção da lei áurea: ";

      System.out.println("\n" + textoAbolicao + dataAbolicao + "\n");

      /*Para formatarmos nossas saídas de texto (exibição no console) com mais facilidade
      podemos utilizar um método chamado printf().
      Esse método pode ter vários parâmetros, sendo o primeiro o formato do texto a ser exibido
      e os posteriores as variáveis com os dados.
      Separamos cada um dos parâmetros com ,
      */

      separador = "/";

      System.out.printf("%s%d%s%d%s%d%n", textoAbolicao, diaAbolicao, separador, mesAbolicao, separador,
       anoAbolicao);

      //Perceba que ele substitui %s por string, %d por inteiro e %n pelo caracter de nova linha.
       
      System.out.printf("%s%n", "Vamos à Fran's Café pra tomar um \u26FE num dia desses!");
 
      //Assim como já estudamos as sequências de escape \n e \t, temos também o \u em que podemos
      //representar quaisquer letras da tabela Unicode. Aqui no java é utilizado o padrão
      //UTF-16BE nesse link conseguirá achar outros http://unicode-table.com/en/ 

       /*
       Tarefas

       -> Utilize o método printf() no FazendoContas.java
       -> Perceba que podemos alterar o valor de uma variável sem ter que declará-la novamente
       como fiz na variável separador.
       -> Exiba no fim do arquivo 5 caracteres que não podem ser inseridos pelo teclado ABTN.
       -> Faça commit do arquivo.
       */ 
    }
}
