public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

// MÉTODO PARA LIGAR A TV
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

//MÉTODO PARA AUMENTAR O VOLUME DA TV
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

// MÉTODO PARA MUDAR O CANAL
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
}
