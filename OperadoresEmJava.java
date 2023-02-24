public class OperadoresEmJava {
    public static void main(String[] args) {
        // Operador de Atrubuição ("=")

            String nome = "Thiago";
            int idade = 20;
            double peso = 90.5;
            char sexo = 'M';
            boolean doadorOrgao = false;
            //Date dataNascimento = new Date();
        
        // Operadores Aritmeticos
            double soma = 10.5 + 15.7;
            int subtração = 113 - 25;
            int multiplicacao = 20 * 7;
            int divisao = 15 / 3;
            int modulo = 18 % 3;
            double resultadoDouble = (10 * 7) + (20/4);

        //classe Operadores.java
            String nomeCompleto = "LINGUAGEM" + "JAVA";
                    
        //qual o resultado das expressoes abaixo?
            String concatenacao ="?"; 

            concatenacao = 1+1+1+"1"; 

            concatenacao = 1+"1"+1+1; 

            concatenacao = 1+"1"+1+"1"; 

            concatenacao = "1"+1+1+1; 

            concatenacao = "1"+(1+1+1); 

        // Operadores Unários

            int numero = 4;

        // Operador Unário Negativo (-)
            numero = - numero ;
            System.out.println(numero); // -4

        // Operador Unário Positivo (+) 
            numero = numero * -1; // numero era negativo, logo , numero passa a ser ele mesmo vezes -1 para tornalo positivo novamente
            System.out.println(numero); // 4

        // Operador Unário Incrementar(++)
            int numeroUnarioPos = 4;
            System.out.println(numeroUnarioPos ++ ); // saida 4 , após esse código passa a valer 5
            System.out.println(numeroUnarioPos); // valor 5
            System.out.println( ++ numeroUnarioPos); // valor 5 incrementado direto
            System.out.println(numeroUnarioPos); // valor 6

        // Operador Unário Decremento(--)
            int numeroUnarioNeg = 4;
            System.out.println(numeroUnarioNeg -- ); // saida 4 
            System.out.println(numeroUnarioNeg); // valor 2
            System.out.println( -- numeroUnarioNeg); // valor 3 incrementado direto - 1 = 2
            System.out.println(numeroUnarioNeg); // valor 2

        // Operador Unário Lógico de Negação(!)

            boolean variavel = true;

            variavel = !variavel; // sinal de ! na frente inverteu

            System.out.println(variavel);

        // classe Operadores.java
            int a, b;

            a = 6;
            b = 5;
        /*Exemplo de condição
            if(a==b)
            resultado = "verdadeiro";
            else
            resultado = "falso";
            */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
            String resultado = (a==b) ? "verdadeiro" : "false";
            int resultadoInt = (a==b) ? 1 : 0 ;

            System.out.println(resultado);
            System.out.println(resultadoInt);

        // Relacionais

        /*  

        == variável é IGUAL A outra. [para strings utilizar método "System.out.println(primeiraVariavel.equals(segundaVariavel))];"
        != variável é DIFERENTE da outra.
        >  variável é MAIOR QUE a outra.
        >= é MAIOR OU IGUAL a outra.
        <  variável é MENOR QUE outra.
        <= variável é MENOR OU IGUAL a outra.
         */
        
         // Operadores lógicos && e ||:
            boolean condicao1=true;

            boolean condicao2=false;

            /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
            expressões.
            */

            if(condicao1 && condicao2) // se a condição1 E a condição2 for verdadeira
                System.out.print("Os dois valores precisam ser verdadeiros");;

            
            if(condicao1 || condicao2) //Se condicao1 OU condicao2 for verdadeira, executar código.
                System.out.print("Um dos valores precisa ser verdadeiro");

    }
}