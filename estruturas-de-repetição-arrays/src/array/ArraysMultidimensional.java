package array;
import java.util.Random;

public class ArraysMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        //  int[linhas] [colunas]
        int[][] M = new int[4][4];

        // preencher linhas e colunas:

        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++)
                M[i][j] = random.nextInt(9);
        }
        System.out.println("Matriz : ");
        for (int[] linha : M) {
            for (int coluna : linha){
                System.out.println(coluna + " ");
            }
            
        }
    }
}
