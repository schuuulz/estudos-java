package estruturasdeloop;
import java.util.Scanner;

public class NomeIdadeWhile {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String nome ;
            int idade ;
            System.out.println("Nome:");
            nome = scan.next();
            System.out.println("Idade: ");
            idade = scan.nextInt();
            while(true){
                System.out.println("Nome:");
                nome = scan.next();
                if(nome.equals("0")) break;
                System.out.println("Idade:");
                idade = scan.nextInt();
            }
        }


    }
    
}
