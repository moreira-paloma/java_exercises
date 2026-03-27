public class TarefaSprint {

    private String titulo;
    private int pontos;
    private boolean concluida;

    public TarefaSprint(String titulo, int pontos) {
        this.titulo = titulo;
        this.pontos = pontos;
        this.concluida = false;
    }

    public void concluir() {
        concluida = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
    @Override
    public String toString() {
        return titulo + " (" + pontos + " pts) - " + (concluida ? "Concluída" : "Pendente");
    }
}


