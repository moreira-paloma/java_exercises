package exerciciosPoo;

public class Retangulo extends Forma {

    private double altura;
    private double largura;


    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;

    }

    @Override
    public double calcularArea(){
        return altura * largura;

    }
    @Override
    public void exibir() {
        System.out.println("Retângulo:");
        System.out.println("Altura: " + this.altura);
        System.out.println("Largura: " + this.largura);
        System.out.println("Área: " + calcularArea());
    }



}
