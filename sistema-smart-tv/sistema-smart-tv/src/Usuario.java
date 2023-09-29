public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume da TV: "+ smartTv.volume);


        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume da TV: "+ smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo status - TV Ligada? " + smartTv.ligada);



    }
}
