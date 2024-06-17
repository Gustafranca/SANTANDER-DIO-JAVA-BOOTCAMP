public class ComputadorPedrinho {
    public static void main(String[] args) {
        System.out.println("MSN");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();
        System.out.println("FACEBOOK");
        FacebookMesseger fbc = new FacebookMesseger();
        fbc.enviarMensagem();
        fbc.receberMensagem();
        System.out.println("TELEGRAM");
        TelegramMesseger tel = new TelegramMesseger();
        tel.enviarMensagem();
        tel.receberMensagem();

    }

}
