public class TesteException {


    // 1. Método que testa a regra e LANÇA a bomba (throw)
    public static void validarIdade(int idade) {
        if (idade < 0) {
            // throw new: Interrompe tudo e joga o erro para quem chamou
            throw new IllegalArgumentException("Erro: A idade não pode ser menor que zero!");
        }
        System.out.println("Idade de " + idade + " anos validada com sucesso.");
    }

    // 2. Método principal que TENTA e CAPTURA (try / catch)
    public static void main(String[] args) {

        System.out.println("--- Iniciando o sistema ---");

      //  try {
            // Caminho feliz
            validarIdade(25);

            // O erro acontece aqui! O código aborta esta linha e pula pro 'catch'
            validarIdade(-5);

            System.out.println("Esta linha nunca será impressa.");

//        } catch (IllegalArgumentException e) {
//            // Tratamento do erro (captura a bomba antes do sistema quebrar)
//            System.out.println("Alerta capturado: " + e.getMessage());
//        }

        System.out.println("--- Sistema continua rodando normalmente ---");
    }
}
