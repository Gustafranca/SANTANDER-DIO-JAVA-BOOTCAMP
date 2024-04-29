public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        boolean ligada = SmartTv.tvStatus();

        int volume = SmartTv.mudarVolume();

        int canal = SmartTv.mudarCanal();

        System.out.println("Novo status -> Status: "+ ligada);
        System.out.println("Novo volume -> Volume: "+ volume);
        System.out.println("Novo canal -> Canal: "+ canal);

    }
}
