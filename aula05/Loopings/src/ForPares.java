import java.util.Scanner;

public class ForPares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número : ");
        int num = scanner.nextInt();

        for(int i = 1; i <= num; i++){
        if(i % 2 ==0) {
            System.out.println(i);
        }

        }
    }
}
