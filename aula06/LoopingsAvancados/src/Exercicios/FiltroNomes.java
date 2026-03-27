package Exercicios;

public class FiltroNomes {
    public static void main(String[] args) {

        String[] convidados = {"Ana", "Marcos", "Alice", "Beto", "Adriana"};
        System.out.println("Os convidados sao: ");

        for(String convidado : convidados){
            if(convidado.startsWith("A")){
               // System.out.println("Os convidados sao: ");
                System.out.println(convidado);
            }
        }
    }
}
