package defaultautodromo;

public class Autodromo {
    public static void main(String[] args) {
        
        Carro jeep = new Carro();
        jeep.setChassi("12312368713");
        jeep.ligar();

        Moto honda = new Moto();
        honda.setChassi("059283049283");
        honda.ligar();

    }
}
