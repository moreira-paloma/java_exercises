import java.util.Locale;
import java.util.Scanner;

public class CaixaMercado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale locale = new Locale("en", "US");
        scanner.useLocale(locale);

        System.out.println("Digite o valor das suas compras: ");

        double total = 0;
        double valor;

        do{
            valor = scanner.nextDouble();
            total= total+valor;
        }

        while(valor != 0);
        System.out.println("A soma das suas compras é de : " + total);

        }


    }
