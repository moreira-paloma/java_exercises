public class Equipamentos {

    private String codigoPatrimonio;
    private String descricao;
    private boolean disponivel;
    private String responsavelAtual;

    public Equipamentos(String codigoPatrimonio, String descricao) {
        this.codigoPatrimonio = codigoPatrimonio;
        this.descricao = descricao;
        this.disponivel = true;
        this.responsavelAtual = null;
    }

    public void emprestar(String nomeResponsavel) {
        if (nomeResponsavel == null || nomeResponsavel.isBlank()) {
            System.out.println("Digite o seu nome corretamente.");
            return;
        }

        if (disponivel) {
            this.disponivel = false;
            this.responsavelAtual = nomeResponsavel;
            System.out.println("Equipamento emprestado no momento para " + nomeResponsavel);
        } else {
            System.out.println("Equipamento ja foi emprestado.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            this.disponivel = true;
            System.out.println("O equipamento foi devolvido pelo(a) " + this.responsavelAtual);
            this.responsavelAtual = null;

        } else {
            System.out.println("Este equipamento já esta disponivel.");
        }
    }

    public void mostrarSituacao() {
        System.out.println("Codigo do patrimonio " + codigoPatrimonio + " com a descricao " + descricao +
                " esta " + (disponivel ? " disponivel " : " indisponivel ") +
                " e foi emprestado para " + (responsavelAtual == null ? "ninguém. " : responsavelAtual));
    }
}
