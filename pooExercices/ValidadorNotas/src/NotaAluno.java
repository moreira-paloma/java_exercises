public class NotaAluno {

    public static double validarNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("A nota esta fora do intervalo de 0 a 10");
        }
        System.out.println("A nota esta dentro do intervalo.");
        return nota;
    }
}
