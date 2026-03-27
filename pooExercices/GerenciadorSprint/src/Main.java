public class Main {
    public static void main(String[] args) {

        Sprint sprint = new Sprint();

        TarefaSprint t1 = new TarefaSprint("Implementar login", 10);
        TarefaSprint t2 = new TarefaSprint("Criar página inicial", 8);

        sprint.adicionarTarefa(t1);
        sprint.adicionarTarefa(t2);


        t1.concluir();
        t2.concluir();

        sprint.listarConcluidas();
        sprint.listarPendentes();

        System.out.println("Total de pontos: " + sprint.calcularTotalPontos());
        System.out.println("Pontos concluídos: " + sprint.calcularPontosConcluidos());
        System.out.println("Percentual concluído: " + sprint.calcularPercentualConclusao() + "%");

        TarefaSprint maior = sprint.buscarTarefaComMaiorPontuacao();
        System.out.println("Tarefa com maior pontuação: " + maior.getTitulo());
    }
}