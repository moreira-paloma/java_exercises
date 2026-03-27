public class SalaReuniao {

    private String nomeSala;
    private boolean isReservada;
    private String responsavelReserva;

    public SalaReuniao(String nomeSala) {
        this.nomeSala = nomeSala;
        this.isReservada = false;
        this.responsavelReserva = null;

    }
    public void reservar(String responsavel){
        if(responsavel.isBlank()){
            System.out.println("Erro: Coloque o seu nome.");
        }
        if(!isReservada){
            this.responsavelReserva = responsavel;
            System.out.println("Sala reservada com sucesso para " + responsavel);
        }
    }

    public void cancelarReserva(){
        if(isReservada){
            System.out.println("Erro: Nao existe reserva no nome de " + responsavelReserva);
            return;
        }
        System.out.println("Reserva cancelada por " +  responsavelReserva);

    }

    public void exibirSituacao() {
        if (isReservada) {
            System.out.println("Sala " + nomeSala + " esta reservada para " + responsavelReserva);
        } else {
            System.out.println("Sala " + nomeSala + " esta livre.");
        }

    }
}
