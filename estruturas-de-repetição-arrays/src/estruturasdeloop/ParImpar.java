package estruturasdeloop;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

        int numerosPares = 0;
        int numerosImpares =0;
        
        System.out.println("Digite quantos numeros voce quer digitar: ");
        int numeros = scan.nextInt();
        
        int count=0;
        do{
            System.out.println("Número que deseja armazenar: ");
            numeros = scan.nextInt();

            if ( numeros % 2 == 0 ) numerosPares++;
            else numerosImpares++;

            count++;
        }while(count < numeros);

        System.out.println("Pares: "+ numerosPares);
        System.out.println("Impares: "+ numerosImpares);
    }
}
