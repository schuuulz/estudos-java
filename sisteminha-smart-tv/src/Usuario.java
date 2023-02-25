public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        

        System.out.println("Estado da TV : " + smartTv.ligada);
        System.out.println("Canal atual da TV : " + smartTv.canal);
        System.out.println("Volume da atual TV :  " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Estado da TV : " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Estado da TV : " + smartTv.ligada);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual da TV : " + smartTv.canal);


    }
}
