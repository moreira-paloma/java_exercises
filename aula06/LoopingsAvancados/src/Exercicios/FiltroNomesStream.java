package Exercicios;
import java.util.Arrays;

public class FiltroNomesStream {
    public static void main(String[] args) {

        //usando Stream - mais elegante, stream é um fluxo de dados que pega a info de uma lista, array, banco e permite que vc faca operacoes como filtrar, ordenar, imprimi, reduzir, contar e etc.

        String[] convidados = {"Ana", "Marcos", "Alice", "Beto", "Adriana"};

        System.out.println("Convidados que começam com A:");

        Arrays.stream(convidados)
                        .filter(nome -> nome.startsWith("A"))
                        .forEach(System.out::println);
            }
        }

