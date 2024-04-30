import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
        public static void main(String[] args) {
            System.out.println("Processo Seletivo!");
            selecaoCandidatos();
        }
        static ArrayList<String> selecaoCandidatos(){
            String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
            ArrayList<String> candidadosAprovados = new ArrayList<>();
            int candidatosSelecionados = 0;
            int candidatoAtual = 0;
            double salarioBase = 2000.0;        
            while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
                String candidato = candidatos[candidatoAtual];
                double salarioPretendido = valorPretendido();
                
                System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
                if(salarioBase > salarioPretendido){
                    System.out.println("O candidato "+ candidato + " foi selecionado.");
                    candidadosAprovados.add(candidato);
                    candidatosSelecionados++;
                }
                candidatoAtual++;
            }
            System.out.println("Quantidade de selecionados " + candidatosSelecionados);
            System.out.println("Quantidade de vizualizados " + candidatoAtual);
            System.out.println("*********************************************************");
            System.out.println("Lista de candidados Aprovados: " + candidadosAprovados);
            System.out.println("*********************************************************");
            System.out.println("*** ENTRANDO EM CONTATO COM OS CANDIDATOS SELECIONADOS **");
            System.out.println("*********************************************************");

            for(String candidato : candidadosAprovados){
                ligar(candidato);
            }
            return candidadosAprovados;
        }

        static double valorPretendido(){
            return ThreadLocalRandom.current().nextDouble(1800,2200);
        }

        static void ligar(String candidato){
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;
                do{
                    atendeu = atender();
                    continuarTentando = !atendeu;
                    if(continuarTentando){
                        tentativasRealizadas++;
                    }
                }while(continuarTentando && tentativasRealizadas < 3);
                if(atendeu){
                    System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
                }else{
                    System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas");
                }
            }

        static boolean atender(){
            return new Random().nextInt(3)==1;
        }

    }

