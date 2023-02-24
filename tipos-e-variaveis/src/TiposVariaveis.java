public class TiposVariaveis {
    public static void main(String[] args) {
            // TIPOS PRIMITIVOS
            
                String meuNome = "Thiago";
                byte idade = 127; // limite: até 128 (8bits)
                short ano = 2023; // limite: 32767 (16bits)
                char tipoChar = 'C'; // caractere
                int cep = 70293000;// limite: 2.147.483.647 (32bits) e se começar com zero, provavelmente o java nao armazene com o tipo "int" -> usar string
                long cpf = 98765432109l; // limite: 9.223.372.036.854.770.000 (64bits) o "L" no final é para definir um numero do tipo "long" (Longo), se começar com zero, provavelmente o java nao armazene com o tipo "long" -> usar string
                float pi = 3.14f; // o "F" é obrigatório estar no final de algum numero do tipo float
                double salario = 1316.69; //use ponto invés de vírgula
                boolean tipoBoolean =  false ; // [false/true] ou [falso/verdadeiro]
        
            // Variáveis e Constantes
    
                // As variáveis podem mudar de valor
    
                    int numeroVariavel = 10;
                    
                    // vamos dizer que agora eu quero que o valor dela seja 15
                    numeroVariavel = 15;
                    // - > o valor da variavel agora é 15
    
                // Já as Constantes precisam da expressão "final" na frente(antes do tipo) e a convenção de nome deve ser MAIÚSCULO
    
                    final double VALOR_DE_PI = 3.14;
    
                    // mesmo se tentar altera-lá, não conseguirá
                    VALOR_DE_PI = 10.54;
                    // a IDE vai acusar para vc excluir
             
            // Casting - adaptação de valor.
                // exemplo: se vc quer passar um variavel com um numero maior para uma menor, crie uma adaptação antes de passar
                    short numeroCurto = 1;
                    int numeroNormal = numeroCurto;
                    short numeroCurto2 = (short) numeroNormal; //aqui o exemplo é o parâmetro '(short)' antes de tranformar em short denovo.
    
    }
}
