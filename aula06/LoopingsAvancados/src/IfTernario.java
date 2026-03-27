public class IfTernario {
    public static void main(String[] args) {

        int num = 14;                   //se               //se nao
        String resultado = (num % 2 == 0) ? "O número é par. " : "O número é impar.";

        System.out.println("O resultado é: " + resultado);

      /*  if(num % 2 == 0){
            System.out.println("O numero é par.");
        } else{
            System.out.println("O numero é impar.");
        }*/
    }
}
