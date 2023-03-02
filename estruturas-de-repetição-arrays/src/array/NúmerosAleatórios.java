package array;

import java.util.Random;

public class NúmerosAleatórios {
    public static void main(String[] args) {
        
        //Classe "Random" ja existe dentro do java, porem no vs code vc precisa importar
        Random random = new Random();

        int[] numerosAleatrios = new int[20];
        
        for(int i = 0; i < numerosAleatrios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatrios[i] = numero;
        }

        System.out.println("Numeros Aleatórios: ");
        for ( int numero : numerosAleatrios) {
            System.out.println(numero + " ");
        }

        System.out.println("Numeros Sucessores: ");
        for ( int numero : numerosAleatrios) {
            System.out.println((numero+1) + " ");
        }
        System.out.println("Numeros Antecessores: ");
        for ( int numero : numerosAleatrios) {
            System.out.println((numero-1) + " ");
        }
    }
}
