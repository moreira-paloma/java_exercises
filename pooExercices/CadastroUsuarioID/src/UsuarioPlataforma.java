public class UsuarioPlataforma {

    private int id;
    private String nome;
    private String email;
    private boolean isAtivo;
    private static int proximoId = 1;

    public UsuarioPlataforma(String nome, String email) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome nao pode estar vazio.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("O email nao pode estar vazio");
        }
        this.nome = nome;
        this.email = email;
        this.id = proximoId;
        proximoId++;
        this.isAtivo = true;

    }

    public void desativar() {
        if (isAtivo) {
            isAtivo = false;
            System.out.println("Usuario desativado.");
        } else {
            System.out.println("O usuario ja esta desativado.");
        }

    }

    public void reativar() {
        if (!isAtivo) {
            isAtivo = true;
            System.out.println("Usuario reativado.");
        } else {
            System.out.println("O usuario ja esta reativado.");
        }
    }

    public void exibirResumo() {
        System.out.println("ID " + id);
        System.out.println("Nome " + nome);
        System.out.println("E-mail " + email);
        System.out.println("Situacao atual " + isAtivo);
    }

    public static void exibirProximoId() {
        System.out.println("Próximo ID disponível: " + proximoId);
    }
}
