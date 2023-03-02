package estruturasdeloop;
import java.util.Scanner;

public class TabuadaForEDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada de : ");
        int n1 = scan.nextInt();

        System.out.println("Tabuada FOR: ");
        for(int i = 1; i <=10; i = i+1){
            System.out.println(n1 +" x "+ i + " = " + (n1*i));
        }

        int count = 1;

        System.out.println("Tabuada WHILE: ");
        do{
            System.out.println(n1 +" x "+ count + " = " + (n1*count));
            count++;
        }while (count < 10);
    }
}
