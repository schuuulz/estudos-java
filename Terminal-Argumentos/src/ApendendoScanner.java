import java.util.Locale;
import java.util.Scanner;

public class ApendendoScanner {
    public static void main(String[] args) throws Exception {
        // criar o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobreNome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("digite seu peso: ");
        double peso = scanner.nextDouble();

        //Imprimindo dados obtidos pelo usuario via terminal
        System.out.println("Olá me chamo "+ nome +" "+sobreNome +", Tenho " +idade +" anos "+", minha altura é "+altura + " e atualmente estou pesando "+ peso + " Kg");
        
        //Calcular IMC
        double imc = peso / (altura * altura);
        System.out.println("O seu IMC é " + imc);

        if (imc >= 24.9)
            System.out.println("Você não está Saudável, o seu IMC esta acima de 24,9!");
        else if (imc < 18.5)
            System.out.println("Você não está Saudável, o seu IMC esta abaixo de 18,5!");
        else     
            System.out.println("Você está Saudável, o seu IMC esta entre 18,5 e 24,9!");

    }
    
}
