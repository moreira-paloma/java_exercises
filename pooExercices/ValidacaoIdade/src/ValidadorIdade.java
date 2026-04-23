public class ValidadorIdade {


    public static void validarIdade(int idade){
        if( idade < 0 ){
            throw new IllegalArgumentException("A idade nao pode ser negativa.");
        }
        System.out.println("A idade é válida.");
    }
}
