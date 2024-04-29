

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        VerificaDados.conta();
        String agencia = VerificaDados.agencia();
        String nomeCliente = VerificaDados.nomeCliente();
        double saldo = VerificaDados.saldo();
        VerificaDados.fecharScanner();
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " e seu saldo " + saldo + " já está disponivel para saque!");
    }
}
