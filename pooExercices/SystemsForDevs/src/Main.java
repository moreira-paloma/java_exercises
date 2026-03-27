public class Main {

        public static void main(String[] args) {

            DevEvaluation dev = new DevEvaluation("Carlos");

            dev.setEvaluateJava(8.5);
            dev.setEvaluateLogic(6.5);

            dev.finalizarAvaliacao();
            dev.exibirResultado();

        }
    }
