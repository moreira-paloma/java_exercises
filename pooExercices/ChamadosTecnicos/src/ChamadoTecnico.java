public class ChamadoTecnico {

    private String codigo;
    private String descricao;
    private String responsavelAtual;
    private StatusChamado status;

    public ChamadoTecnico(String codigo, String descricao, String responsavelAtual) {

        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Codigo obrigatorio.");
        }
        this.codigo = codigo;

        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException("Digite uma descricao valida. ");
        }
        this.descricao = descricao;
        this.responsavelAtual = responsavelAtual;
        this.status = StatusChamado.ABERTO;

    }

    public void iniciarAtendimento(String nomeResponsavel) {

        if (nomeResponsavel == null || nomeResponsavel.isBlank()) {
            throw new IllegalArgumentException("Digite o seu nome.");
        }

        if (status != StatusChamado.ABERTO) {
            throw new IllegalArgumentException("O status precisa estar em aberto.");
        }

        this.responsavelAtual = nomeResponsavel;
        this.status = StatusChamado.EM_ATENDIMENTO;

    }

    public void resolver() {
        if (status != StatusChamado.EM_ATENDIMENTO) {
            throw new IllegalArgumentException("O status precisa estar em atendimento.");
        }
        this.status = StatusChamado.RESOLVIDO;
    }

    public void cancelar() {
        if (status == StatusChamado.RESOLVIDO || status == StatusChamado.CANCELADO) {
            throw new IllegalArgumentException("O status precisa estar em aberto.");
        }
        this.status = StatusChamado.CANCELADO;
    }

    public void exibirDetalhes() {
        System.out.println("Codido de Atendimento: " + codigo);
        System.out.println("Descricao de Atendimento: " + descricao);
        System.out.println("Responsavel: " + responsavelAtual);
        System.out.println("Status: " + status);
    }
}


