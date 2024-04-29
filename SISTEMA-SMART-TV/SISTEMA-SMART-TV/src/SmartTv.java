import java.util.Scanner;

public class SmartTv {

        boolean ligada=false;
        int canal=1;
        int volume=25;
    public static boolean tvStatus(){
        boolean ligada=false;
        System.out.println("Quer ligar a TV (S/N)");   
        Scanner sc = new Scanner(System.in);    
        char c = sc.next().charAt(0);
        if(c == 'S'){
            ligada = true;
        }else if(c == 'N'){
            ligada = false;
            System.exit(0);
        }   
        return ligada;
    }   

    public static int mudarVolume(){
        int volume=25;
        System.out.println("Deseja modificar o volume? (S/N)");
        Scanner sc = new Scanner(System.in);    
        char c = sc.next().charAt(0);
        if(c == 'S'){
            System.out.println("Novo volume: ");
            volume = sc.nextInt();
        }else if(c == 'N'){
            System.out.println("Ok");
        }   
        return volume;
    }


    public static int mudarCanal(){
        int canal=1;
        System.out.println("Deseja modificar o canal? (S/N)");
        Scanner sc = new Scanner(System.in);    
        char c = sc.next().charAt(0);
        if(c == 'S'){
            System.out.println("Novo canal: ");
            canal = sc.nextInt();
        }else if(c == 'N'){
            System.out.println("Ok");
        }   
        return canal;
    }
}
