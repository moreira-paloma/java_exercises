package exerciciosPoo;

public class FormaRun {
    public static void main(String[] args) {

        Forma forma1 = new Retangulo(5, 10);
        Forma circulo = new Circulo(3);


        forma1.exibir();
        System.out.println(circulo);
    }
}
