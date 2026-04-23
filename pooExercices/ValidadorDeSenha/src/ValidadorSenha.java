public class ValidadorSenha {

    public static void validarSenha(String senha){
        if(senha == null || senha.length() < 8){
            throw new IllegalArgumentException("A senha nao pode ser null e precisa ser maior que 8 caracteres.");
        }
        for (int i = 0; i <= 7; i++) {
            String seq = "" + i + (i+1) + (i+2);
        }

    }
}
