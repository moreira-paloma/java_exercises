package exerciciosPoo;

public class Circulo extends Forma {
    private double raio;
    private double altura;
    private double largura;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * raio * raio;
    }


    @Override
    public void exibir() {
        System.out.println("Retângulo:");
        System.out.println("Altura: " + this.altura);
        System.out.println("Largura: " + this.largura);
        System.out.println("Área: " + calcularArea());

    }

    @Override
    public String toString() {
        return "Oi, eu agora nao mostro mais meu endereco de memoria";
    }
}
