public class Main {
    public static void main(String[] args) {

        UsuarioPlataforma usuario1 = new UsuarioPlataforma("Paloma","teste@teste.com");
        UsuarioPlataforma usuario2 = new UsuarioPlataforma("Pedro", "testepedro@teste.com");

        usuario1.exibirResumo();
        System.out.println("____________");
        usuario2.exibirResumo();

        System.out.println("______________");
        UsuarioPlataforma.exibirProximoId();
        System.out.println("______________");

        usuario1.desativar();
        usuario1.desativar();
        usuario1.reativar();
    }
}
