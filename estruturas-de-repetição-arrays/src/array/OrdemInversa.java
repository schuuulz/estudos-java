package array;

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {-5, -6 , 24 ,15, 8, 4};
        System.out.println("Total de Vetores : ");
        System.out.println(vetor.length);
        
        System.out.println("Vetores Em Ordem crescente 'While': ");
        int count = 0;
        while(count < (vetor.length)){
            System.out.println(vetor[count] + " ");
            count++;
        }
        System.out.println("Vetores Em Ordem Decrescente 'For': ");
        for(int i = (vetor.length -1); i >= 0; i --){
            System.out.println(vetor[i] + " ");
        }
    }
}
