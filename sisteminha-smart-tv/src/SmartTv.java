public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    // Métodos ligar e desliga "void" nao retorna nada -> parecido com funções no python
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

    // Método Aumentar e Diminuir Volume
    public void aumentarVolume(){
        // volume = volume + 1; <<<<<< é a mesma coisa >>>>>>>
        volume ++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        // volume = volume - 1; <<<<<< é a mesma coisa >>>>>>>
        volume --;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    // Método mudar de canal
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
