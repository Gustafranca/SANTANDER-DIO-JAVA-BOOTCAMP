import apps.FacebookMesseger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.TelegramMesseger;

public class ComputadorPedrinho {
    public static void main(String[] args) throws Exception {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        }else if(appEscolhido.equals("fbm")){
            smi = new FacebookMesseger();
        }else if(appEscolhido.equals("tlg")){
            smi = new TelegramMesseger();
        }

        smi.enviarMensagem();
        smi.receberMensagem();



    }
}
