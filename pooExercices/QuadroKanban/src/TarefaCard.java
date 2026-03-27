public class TarefaCard {

    private String titulo;
    private String status;

    public TarefaCard(String titulo){
        this.titulo = titulo;
        this.status = "A Fazer";
    }

    public void moverParaFrente(){
        if(status.equalsIgnoreCase("A Fazer")){
            this.status = "Em Andamento";
            System.out.println("A tarefa agora está em andamento.");
        }
        else if(status.equalsIgnoreCase("Em Andamento")){
            this.status = "Concluída";
            System.out.println("A tarefa foi concluída.");
        }
        else if(status.equalsIgnoreCase("Concluída")){
            System.out.println("A tarefa já está finalizada. ");

        } else{
            System.out.println("Tarefa nao existe.");
        }
    }

    public void voltarStatus(){
        if(status.equalsIgnoreCase("Concluída")){
            this.status = "Em Andamento";
            System.out.println("A tarefa voltou para em andamento.");
        }
        else if(status.equalsIgnoreCase("Em Andamento")){
            this.status = "A Fazer";
            System.out.println("A tarefa voltou para a fazer.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getStatus() {
        return status;
    }
}