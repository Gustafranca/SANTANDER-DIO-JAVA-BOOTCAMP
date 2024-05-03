import java.util.Scanner;

public class Banco {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in); 
         double saldo = 0;
         double saque = 0; 
         scanner.close();
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 
            
            int opcao = scanner.nextInt(); 
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            switch(opcao){
                case 1:
                //depositar
                    saldo = scanner.nextInt();
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                //sacar
                    saque = scanner.nextInt();
                    if(saque <= saldo){
                        saldo = saldo - saque;
                        System.out.println("Saldo atual: " + saldo);
                    }else{
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                //consultar saldo
                    System.out.println("Saldo atual: "+ saldo);
                    break;
                case 0:
                //encerrar:
                    System.out.println("Programa encerrado.");
                    System.exit(0);
        // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }
        }
        
    }
}
