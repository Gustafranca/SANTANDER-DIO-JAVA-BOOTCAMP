import java.util.Scanner; 

public class VerificadorNumeroConta { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        String numeroConta = scanner.nextLine();
        try {
            verificarNumeroConta(numeroConta);
                System.out.println("Numero de conta valido."); 
        } catch (IllegalAccessException e){
        System.out.println("Erro: " + e.getMessage()); 
    }finally {
            scanner.close();
        }
    }
// Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) throws IllegalAccessException{ 
        if(numeroConta.length() != 8){
            throw new IllegalAccessException(" Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}

