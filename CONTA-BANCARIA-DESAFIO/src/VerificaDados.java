import java.util.Locale;
import java.util.Scanner;

public class VerificaDados {
    private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    public static int conta(){
        System.out.println("Digite o numero da sua conta: ");
        int conta = sc.nextInt();
        return conta;
    }

    public static String agencia(){
        System.out.println("Digite o numero da sua agência: ");
        String agencia = sc.next();
        sc.nextLine();
        return agencia;
    }

    public static String nomeCliente(){
        System.out.println("Digite o nome do Cliente: ");
        String cliente = sc.next();
        sc.nextLine();
        return cliente;
    }
    public static double saldo(){
        System.out.println("Saldo em conta: ");
        double saldo = sc.nextDouble();
        return saldo;
    }
    public static void fecharScanner(){
        sc.close();
    }
}
