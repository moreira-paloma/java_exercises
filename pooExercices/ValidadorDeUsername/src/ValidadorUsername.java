public class ValidadorUsername {

    public static void validarUsername(String username){

        if(username == null || username.isBlank()) {
            throw new IllegalArgumentException(" " + "username nao pode ser null ou vazio.");
        }

        if(username.length() < 4){
            throw new IllegalArgumentException("O username nao pode ter menos que 4 caracteres.");
        }
    }

}

