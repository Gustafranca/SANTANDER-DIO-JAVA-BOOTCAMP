public class MSNMessenger extends ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem() {
        System.out.println("Eviando mensagem pelo MSN");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");
    }
}