public class RegrasVariaveisMetodos {

    public static void main(String[] args) { // escrever "main" + enter == preenche automatico "public static void main(String[] args) {}"
        System.out.println("Olá meu nome é thiago e estou aprendendo JAVA!");
        
        
        // estrutura de variavel
        tipo NomeBemDefinido = Atribuição (opcional em alguns casos)
        // Exemplo:
        int idade = 23;
        double altura = 1.62;
        Dog spike; //observe que a variável não tem valor
        // prática:
        String meuNome = "Thiago Schulz";
        int anoFabricação = 2002;
        
        //boolean pode ser > Sim/Nao , Verdadeira/Falsa e Atribuição é Opcional
        boolean verdadeira = false;
        boolean false = true;
        
        //Podemos alterar a variavel a qualquer momento assim:
        anoFabricação = 2018;
        
        
        // nomeclatura válidas de variáveis (permitidos --> _ $)//

        int variavel = 1;
        int _variavel = 12;
        int variavel2 = 15;
        int variavel_3 = 19;
        int variavel$4 = 27;
        int variável4 = 90;
        int v6666666 = 666666666;

        // nomeclatura inválida de variáveis //

        int _variavel = 1;
        int 1variavel2 = 10;
        int minha variavel3 = 19;
        int 4variável4 = 18;
        int long = 666666666; // no caso a palavra "long" é uma palavra reservada da lingua //

    
    
    }
    
    
    //Declarando métodos:
    //Estrutura
    TipoRetorno NomeObjetivoNoInfinitivo Parametros(s)
    //Exemplo
    int somar (int numeroUm,int numeroDois)
    String formatarCep (long cep)
    //prática -> métodos sao declarados fora da "main"
    public static String nomeComplete(String primeiroNome,String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome); // .concat é == a usar o "+"
        
    }
    
}
