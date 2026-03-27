public class Main {
    public static void main(String[] args) {

        TarefaCard tarefa = new TarefaCard("Estudar Java");


        tarefa.moverParaFrente();
        tarefa.moverParaFrente();
        tarefa.moverParaFrente();

        tarefa.voltarStatus();
        tarefa.voltarStatus();

    }
}