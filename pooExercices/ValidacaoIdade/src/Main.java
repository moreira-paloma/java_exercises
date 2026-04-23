public class Main {
    public static void main(String[] args) {

        // chamada válida
        try {
            ValidadorIdade.validarIdade(18);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // chamada inválida
        try {
            ValidadorIdade.validarIdade(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Sistema continua executando normalmente.");
    }
}