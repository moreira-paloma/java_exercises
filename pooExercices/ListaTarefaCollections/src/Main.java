public class Main {
    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa();
        listaTarefa.listarTarefa();
        System.out.println("==========");
        listaTarefa.removerTarefa("Estudar");
        listaTarefa.listarTarefa();
    }
}
