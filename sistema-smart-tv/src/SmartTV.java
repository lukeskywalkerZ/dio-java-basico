public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligarligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void mudarCanal(String tipo, int numCanal){
        if (tipo == "Aumentar"){
            canal++;
        }
        if (tipo == "Diminuir"){
            canal--;
        }
        if (tipo == "Canal"){
            canal = numCanal;
        }
    }

}
