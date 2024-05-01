import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();

        for(int i = 0; i < limiteDiario; i++){
            double saque = scanner.nextDouble();
            limiteDiario -= saque;
            if(saque > limiteDiario){
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            }else if(saque == 0){
                System.out.println("Transacoes encerradas.");
                System.exit(0);
            }
            else{
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
        }
            scanner.close(); 
    }
}

// Fechamos o Scanner para evitar vazamento de recursos: