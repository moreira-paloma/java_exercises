public class Main {
    public static void main(String[] args) {

        try {
            ValidadorUsername.validarUsername("Paloma");

        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
        System.out.println("Username validado com sucesso.");

        try {
            ValidadorUsername.validarUsername("Ana");

        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
}
