public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);



        smartTv.ligar();
        System.out.println("Novo status -> TV ligada: " + smartTv.ligada);


        smartTv.aumentarVolume();
        System.out.println("Novo volume -> Volume atual: " + smartTv.volume);
        smartTv.diminuitVolume();
        System.out.println("Novo volume -> Volume atual: " + smartTv.volume);


        System.out.println("Canal Atual -> Canal: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Novo canal -> Canal: "+ smartTv.canal);


        smartTv.desligar();
        System.out.println("Novo status -> TV ligada: " + smartTv.ligada);
    }
}
