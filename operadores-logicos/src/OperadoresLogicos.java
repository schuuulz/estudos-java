public class OperadoresLogicos {
    public static void main(String[] args) throws Exception {
        
        // BOOLEANS

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        // a expressao && representa "e" (quando as duas forem verdadeiras)
        System.out.println("b1 && b2 : " + (b1 && b2));
        System.out.println("b1 && b3 : " + (b1 && b3));
        // a expressao || representa "ou" 
        System.out.println("b2 || b3 : " + (b2 || b3));
        System.out.println("b2 || b4 : " + (b2 || b4));
        // a expressao ^ representa "xor",  quando IGUAIS = "false" e quando DIFERENTES = "true" 
        System.out.println("b1 ^ b3 : " + (b1 ^ b3));
        System.out.println("b4 ^ b1 : " + (b4 ^ b1));
        // a expressao ! representa a negação (inverte a variavel)
        System.out.println(!b1);
        System.out.println(!b2);
        System.out.println(!b3);
        System.out.println(!b4);

        // LÓGICOS + RELACIONAIS 
        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("[5 é menor que 20? Sim 'e' o resultado é 'verdadeiro'? Sim ] : "+ ((i1 + i2) < (f2 - f1) && true));
        System.out.println("[10 é menor que 5 == SIM 'OU' 50 é menor que 20 == SIM]: " + ((i1 > i2) || (f2 < f1) ));


    }
}
