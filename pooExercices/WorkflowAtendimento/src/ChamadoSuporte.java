public class ChamadoSuporte {

    private String protocolo;
    private String titulo;
    private StatusChamado status;

    public ChamadoSuporte(String protocolo, String titulo) {
        this.protocolo = protocolo;
        this.status = StatusChamado.ABERTO;
        this.titulo = titulo;
    }

    public void iniciarAtendimento(){
        if(status == StatusChamado.ABERTO){
            this.status = StatusChamado.EM_ATENDIMENTO;
            System.out.println("Atendimento iniciado.");

        }else{
            System.out.println("Atendimento invalido.");
        }
    }

    public void aguardarCliente(){
        if(status == StatusChamado.EM_ATENDIMENTO){
            this.status = StatusChamado.AGUARDANDO_CLIENTE;
            System.out.println("Aguardando cliente.");

        } else {
            System.out.println("Atendimento invalido.");
        }
    }

    public void retomarAtendimento(){
        if(status == StatusChamado.AGUARDANDO_CLIENTE){
            this.status = StatusChamado.EM_ATENDIMENTO;
            System.out.println("Em atendimento.");

        } else {
            System.out.println("Atendimento invalido.");
        }
    }

    public void resolver(){
        if(status == StatusChamado.EM_ATENDIMENTO){
            this.status = StatusChamado.RESOLVIDO;
            System.out.println("Atendimento finalizado.");

        } else {
            System.out.println("Atendimento invalido.");
        }
    }

    public void cancelar(){
        if(status != StatusChamado.RESOLVIDO && status != StatusChamado.CANCELADO){
            this.status = StatusChamado.CANCELADO;
            System.out.println("Atendimento cancelado.");

        }else {
            System.out.println("Atendimento invalido.");
        }
    }

    public void mostrarStatusAtual(){
        System.out.println("Protocolo número " + this.protocolo + " titulo " + this.titulo +
        " com status " + status);
    }
}
