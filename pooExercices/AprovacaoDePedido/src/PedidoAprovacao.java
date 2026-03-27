public class PedidoAprovacao {

    private String numeroPedido;
    private double valor;
    private Status situacao;  // perguntar pro Mateus pq só o enum nao vai sozinho pro construtor.

    private enum Status {
        CRIADO,
        EM_ANALISE,
        APROVADO,
        REJEITADO,
        CANCELADO,
    }

    public PedidoAprovacao(String numeroPedido, double valor) {
        this.numeroPedido = numeroPedido;
        this.situacao = Status.CRIADO;
        this.valor = valor;
    }

    public void enviarAnalise() {// perguntar sobre o parametro
        if (situacao == Status.CRIADO) {
            this.situacao = Status.EM_ANALISE;
            System.out.println("O pedido foi para análise.");

        } else {
            throw new IllegalStateException("O pedido precisa ser criado");  //sugestao da ia, preciso aprender excessoes
        }
    }

    public void aprovar(){
        if(situacao == Status.EM_ANALISE){
            this.situacao = Status.APROVADO;
            System.out.println("O pedido foi aprovado.");

        } else{
            throw new IllegalStateException("O pedido nao foi aprovado");

        }
    }

    public void rejeitar(){
        if(situacao == Status.EM_ANALISE){
            this.situacao = Status.REJEITADO;
            System.out.println("O pedido foi rejeitado.");

        }else{
            throw new IllegalStateException("O pedido nao pode ser rejeitado.");
        }
    }

    public void cancelar(){
        if(situacao == Status.EM_ANALISE) {
            this.situacao = Status.CANCELADO;
            System.out.println("O pedido foi cancelado.");

        } else{
            throw new IllegalStateException("Voce nao tem pedidos para cancelar.");
        }
    }

    public void mostrarStatusAtual(){
        System.out.println("Pedido: " + numeroPedido + " | Valor: R$ " + valor + " | Status: " + situacao);
    }

}

