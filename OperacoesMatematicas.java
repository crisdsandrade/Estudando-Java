public class OperacoesMatematicas {
    public static void main(String[] args) {
        
        //Literais são dados inseridos diretamente, ou seja, sem variáveis.
        System.out.println(5 * 2); //Exibe 10.
        
        //Podemos misturar o uso de variáveis e literais.
        int a = 20;
        
        System.out.println(a / 4); //Exibe 5.
        
        //Ou usar somente variáveis.
        int b = 16;
        
        System.out.println(a - b); //Exibe 4.
        
        //É possível fazer operações com literais e atribuir o resultado em uma variável.
       	int resultado = 8 % 5;

        System.out.println(resultado); //Exibe 3.
       
    	//Ou fazer as operações com variáveis.
        int outroResultado = a - b;
        
        System.out.println(outroResultado - 2); //Exibe 2.
        
        /*
        Esse é um comentário
        para múltiplas linhas.	
        */
        
        /*
        Tarefas:
        -> Crie outro código fonte com o nome que desejar.
        -> Nele declare 3 variáveis int: 2 para os operandos e 1 para o resultado.
        -> Realize as 5 operações aritméticas possíveis: + - * / % .
        -> Exiba no terminal (capriche!) as contas e o resultado no mesmo método print.
        -> Perceba a diferença entre os métodos print e println.
        -> Faça commit do código.
        */
        
    }
}
