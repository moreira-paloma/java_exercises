public class SenhaAtendimento {

    private int numero;
    private String setor;
    private boolean chamada;
    private boolean finalizada;
    private String guicheAtual;
    private static int proximaSenha = 1;

    public SenhaAtendimento(String setor) {
        this.numero = proximaSenha;
        proximaSenha++;
        this.setor = setor;
        this.chamada = false;
        this.finalizada = false;
        this.guicheAtual = null;

    }

    public void chamar(String guiche) {
        if (guiche == null || guiche.isBlank()) {
            throw new IllegalArgumentException("Digite o nome do guiche correto.");
        }
        if (!finalizada) {
            System.out.println("Chamado iniciado.");
            this.chamada = true;
            this.guicheAtual = guiche;
        }
    }

    public void finalizar() {
        if (chamada) {
            this.finalizada = true;
        }
    }

    public void exibirStatus(){
        if(!chamada && !finalizada){
            System.out.println("Aguardando chamada." + numero + setor);
        } else if(chamada && !finalizada){
            System.out.println("Senha: " + numero + " + " + " Setor: " + setor + " " + " +  Guiche: " + guicheAtual);

        }else{
            System.out.println("Senha: " + numero + " + " + " Setor: " + setor + " " + " +  Guiche: " + guicheAtual);

        }
    }
    public void exibirPainel() {
        System.out.println("Painel → Senha: " + numero
                + "  Setor: " + setor
                + "  Guiche: " + guicheAtual);

        exibirStatus();
    }

    public static void proximoNumeroDisponivel(){
        System.out.println("Proxima senha " + proximaSenha);

    }

    public static int getProximaSenha() {
        return proximaSenha;
    }
}
