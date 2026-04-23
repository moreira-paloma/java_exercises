public class Main {
    public static void main(String[] args) {

        SenhaAtendimentoAvancada senha = new SenhaAtendimentoAvancada(101, "Documentos");

        senha.exibirPainel();

        senha.chamar("Guiche 3");
        senha.exibirPainel();

        senha.iniciarAtendimento();
        senha.exibirPainel();

        senha.finalizar();
        senha.exibirPainel();
    }
}