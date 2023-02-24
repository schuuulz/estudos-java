public class RetornarNome {
    public static void main(String[] args) {
        String primeiroNome = "Thiago";
        String sobreNome = "Schulz";
        String nomeSobrenome = retornarNomeCompleto(primeiroNome, sobreNome);
        System.out.println(nomeSobrenome); // escrever "sout" + enter == Escreve automatico o "System.out.println()"
    }
    
    public static String retornarNomeCompleto(String primeiroNome,String sobreNome){
        return "Seu nome e sobrenome é: " + primeiroNome + " " + sobreNome; // esqueci que aqui retorna a função ent mais cuidado com os "+" e as aspas
    }
}
