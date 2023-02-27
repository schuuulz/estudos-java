
/* Decisao : if, if-else, if-else-if, switch e operador ternário
        * Estrutura:
             *if(condição){
             *'se verdadeiro ira executar aqui'
             * }
             *
             * if(condição) {se verdadeiro
             * }else { se falso
             * }
             * 
             * if(condição){se verdadeiro 
             * }else if(condição){ se verdadeiro
             * }else{ se falso 
             * }
             * 
         * Operador Ternário:
             * condição ? true : false;
             * ex:
             * ligado ? desligar : ligar;
             * emMovimento ? freia : null;
         * Estrutura Switch: [Dados permitidos => byte , short , char , int , Enum e String] 
             * switch (variável){
             * case 1:
             *  break;
             * case 2:
             *  break;
             * case ...:
             *  break;
             * default:
             *  break;
             * }
             */
public class EstruturasDeFluxo {
    public static void main(String[] args) {
        ifSemFlecha();
        ifFerias();
        switchFerias();
    }
    private static void ifSemFlecha(){
        int mes = 5;
        if ( mes== 1) {
            System.out.println("Janeiro");
        }else if ( mes == 2) {
            System.out.println("Fevereiro");
        }else if ( mes == 3) {
            System.out.println("Março");
        }else if ( mes == 4) {
            System.out.println("Abril");
        }else if ( mes == 5) {
            System.out.println("Maio");
        }else if ( mes == 6) {
            System.out.println("Junho");
        }else if ( mes == 7) {
            System.out.println("Julho");
        }else if ( mes == 8) {
            System.out.println("Agosto");
        }else if ( mes == 9) {
            System.out.println("Setembro");
        }else if ( mes == 10) {
            System.out.println("Outubro");
        }else if ( mes == 11) {
            System.out.println("Novembro");
        }else if ( mes == 12) {
            System.out.println("Dezembro");
        }else{
            System.out.println("Mês inválido!");
        }
    }
    private static void ifFerias(){
        String mes = "junho";
        if (  mes == "julho" || mes == "dezembro" || mes == "janeiro"){
            System.out.println("Férias");
        }else {
            System.out.println("Mais um mês de trabalho");
        }
    }
    private static void switchFerias(){
        String mes = "dezembro";
        switch (mes){
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Mês de Férias!");
                break;
            default:
                System.out.println("Mês de trabalho AAgh que chato");
                break;
        }
    }
}
    
