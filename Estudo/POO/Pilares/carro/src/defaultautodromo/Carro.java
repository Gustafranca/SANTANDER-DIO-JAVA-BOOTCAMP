package defaultautodromo;

public class Carro extends Veiculo{
        public void ligar(){
            confereCambio();
            confereCombustivel();
            System.err.println("CARRO LIGAADO");
        }
        private void confereCambio(){
            System.out.println("Conferindo cambio");
        }
        private void confereCombustivel(){
            System.out.println("Confere combustivel");
        }
    }

