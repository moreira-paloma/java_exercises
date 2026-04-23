public class Main {

    public static void main(String[] args) {

        try {
            ValidadorSenha.validarSenha("35789478");
            System.out.println("Senha validada.");

        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }

        try {
            ValidadorSenha.validarSenha("123879");
            System.out.println("Senha validada.");

        } catch (Exception e) {
            System.out.println("Erro --- " + e.getMessage());
        }

    }
}
