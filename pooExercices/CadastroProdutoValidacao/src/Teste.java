public class Teste {

    public static void main(String[] args) {
        try {
            // O main é o último nível antes da JVM.
            // Ele decide tratar a exceção que veio "subindo" a pilha.
            cadastrar();
        } catch (Exception e) {
            System.err.println("Tratado no main: " + e.getMessage());
        }
    }

    // O método cadastrar() não trata o erro, ele apenas diz:
    // "Se algo der errado aqui ou nos métodos que eu chamar, eu repasso adiante"
    public static void cadastrar() throws Exception {
        validar();
    }

    // O método validar() identifica o erro e o lança para fora
    public static void validar() throws Exception {
        boolean algoDeuErrado = true;

        if (algoDeuErrado) {
            throw new Exception("Falha detectada em validar()");
        }
    }
}