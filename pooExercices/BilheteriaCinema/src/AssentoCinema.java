public class AssentoCinema {

    private String nomeCliente;
    private String codigo;
    private boolean reservado;


    public AssentoCinema(String codigo) {
        this.nomeCliente = null;
        this.codigo = codigo;
        this.reservado = false;

    }

    public void reservar(String nome) {
        if (reservado) {
            System.out.println("Esse assento ja esta reservado.");


        } else {
            this.reservado = true;
            this.nomeCliente = nome;
            System.out.println("Voce realizou a sua reserva.");

        }
    }

    public void cancelarReserva() {
        if(reservado){
            this.reservado = false;
            nomeCliente = null;
            System.out.println("Reserva cancelada.");

        }else{
            System.out.println("Nao existe reserva para esse nome.");
        }
    }

    public void exibirStatus(){
        System.out.println("Reserva " + nomeCliente + " codigo " + codigo + " situacao " + (reservado ? "ocupado" : "livre"));
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean isReservado()
    {
        return reservado;
    }
}

