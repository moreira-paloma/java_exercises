import java.util.Scanner;

public class ConversorTempo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os segundos: ex 135");
        String seg = scanner.nextLine();
        int convertendo = Integer.parseInt(seg);
        int minutos = convertendo / 60;
        int segundos = convertendo % 60;

        System.out.println(minutos + " " + "minuto" + " " + segundos + " " + "segundos");





        }
    }
