public class SenhaAtendimentoAvancada {

    private final int numero;
    private String setor;
    private StatusSenha status;
    private String guicheAtual;

    public SenhaAtendimentoAvancada(int numero, String setor) {

        if (setor == null || setor.isBlank()) {
            throw new IllegalArgumentException("Setor é obrigatório.");
        }

        this.numero = numero;
        this.setor = setor;
        this.status = StatusSenha.AGUARDANDO;
    }

    public int getNumero() {
        return numero;
    }

    public String getSetor() {
        return setor;
    }

    public StatusSenha getStatus() {
        return status;
    }

    public String getGuicheAtual() {
        return guicheAtual;
    }

    public void chamar(String guiche) {

        if (status != StatusSenha.AGUARDANDO) {
            System.out.println("Não é possível chamar. Estado atual: " + status);
            return;
        }

        this.guicheAtual = guiche;
        this.status = StatusSenha.CHAMADA;
    }

    public void iniciarAtendimento() {

        if (status != StatusSenha.CHAMADA) {
            System.out.println("Não é possível iniciar atendimento. Estado atual: " + status);
            return;
        }

        this.status = StatusSenha.EM_ATENDIMENTO;
    }

    public void finalizar() {

        if (status != StatusSenha.EM_ATENDIMENTO) {
            System.out.println("Não é possível finalizar. Estado atual: " + status);
            return;
        }

        this.status = StatusSenha.FINALIZADA;
    }

    public void exibirPainel() {
        System.out.println("Senha: " + numero +
                " | Setor: " + setor +
                " | Status: " + status +
                " | Guichê: " + guicheAtual);
    }
}