import java.util.ArrayList;

public class Sprint {

    private ArrayList<TarefaSprint> tarefas = new ArrayList<>();

    public void adicionarTarefa(TarefaSprint tarefa) {
        tarefas.add(tarefa);
    }

    public void listarConcluidas() {
        System.out.println("Listar tarefas concluídas:");
        for (TarefaSprint tarefa : tarefas) {
            if (tarefa.isConcluida()) {
                System.out.println(tarefa);
            }
        }
    }

    public void listarPendentes() {
        System.out.println("Listar tarefas pendentes:");
        for (TarefaSprint tarefa : tarefas) {
            if (!tarefa.isConcluida()) {
                System.out.println(tarefa);
            }
        }
    }

    public int calcularTotalPontos() {
        int total = 0;
        for (TarefaSprint tarefa : tarefas) {
            total += tarefa.getPontos();
        }
        return total;
    }

    public int calcularPontosConcluidos() {
        int total = 0;
        for (TarefaSprint tarefa : tarefas) {
            if (tarefa.isConcluida()) {
                total += tarefa.getPontos();
            }
        }
        return total;
    }

    public double calcularPercentualConclusao() {
        if (tarefas.isEmpty()) return 0;
        return (calcularPontosConcluidos() * 100.0) / calcularTotalPontos();
    }

    public TarefaSprint buscarTarefaComMaiorPontuacao() {
        if (tarefas.isEmpty()) return null;

        TarefaSprint maior = tarefas.get(0);

        for (TarefaSprint tarefa : tarefas) {
            if (tarefa.getPontos() > maior.getPontos()) {
                maior = tarefa;
            }
        }
        return maior;
    }
}