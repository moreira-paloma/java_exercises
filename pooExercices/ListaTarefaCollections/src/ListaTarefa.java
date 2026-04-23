import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    List<String> tarefas = new ArrayList<>();

    public void adicionarTarefa() {
        tarefas.add("Estudar");
        tarefas.add("Aplicar para vagas");
        tarefas.add("Organizar minhas coisas");
    }

    public void listarTarefa() {
        for (String tarefa : tarefas) {
            System.out.println("Tarefas diárias: " + tarefa);
        }
    }

    public void removerTarefa(String tarefa) {
        if (tarefas.remove(tarefa)) {
            System.out.println("Tarefa removida.");
        } else {
            System.out.println("Tarefa nao foi encontrada");
        }
    }

    public boolean existeTarefa(String tarefa) {
        return tarefas.contains(tarefa);
    }

}
