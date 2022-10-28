public class Usuário {
    public static void main(String[] args) throws Exception {

        SmartTV smartTV = new SmartTV();

        System.out.println("TV Ligada? " + smartTV.ligada);
        System.out.println("Canal Atual? " + smartTV.canal);
        System.out.println("Volume Atual? " + smartTV.volume);

        smartTV.ligar();

        System.out.println("Novo Status -> TV Ligada? " + smartTV.ligada);
        
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();

        System.out.println("Volume Atual? " + smartTV.volume);

        smartTV.mudarCanal("Aumentar", 0);
        System.out.println("Canal Atual? " + smartTV.canal);
        smartTV.mudarCanal("Diminuir", 0);
        System.out.println("Canal Atual? " + smartTV.canal);
        smartTV.mudarCanal("Canal", 58);
        System.out.println("Canal Atual? " + smartTV.canal);
    }

    
}
