package estruturasdeloop;
import java.util.Scanner;
public class FatorialFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual numero que voce quer Fatorializar? ");
        int fatorial = scan.nextInt();
        int multiplicação = 1;
        System.out.println("Fatorando o numero "+ fatorial + " temos :");

        for(int i = fatorial ; i >= 1 ; i = i - 1){
            multiplicação = multiplicação * i;
        }
        System.out.println(fatorial + "! = " + multiplicação);
    }
}
