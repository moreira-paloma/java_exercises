package exerciciosPoo;

public class Carro {
    private String modelo;
    private int velocidadeAtual;

    public Carro(String modelo){
        this.modelo = modelo;
        this.velocidadeAtual = 0;
    }

    public String getModelo() {

        return modelo;
    }

    public void setModelo(String modelo) {

        this.modelo = modelo;
    }

    public int getVelocidadeAtual() {

        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        if(velocidadeAtual < 0){
            System.out.println("A velocidade nao pode ser negativa " + velocidadeAtual);
            return;
        }
        if(velocidadeAtual > 200){
            System.out.println("A velocidade nao pode ser maior que 200 : " + velocidadeAtual);
            return;
        }
        this.velocidadeAtual = velocidadeAtual;
        System.out.println("A velocidade atual é de : " + velocidadeAtual);
      }


    public void acelerar(){
        setVelocidadeAtual(this.velocidadeAtual + 10);
    }

    public void status(){
        System.out.println("O modelo do carro é : " + this.modelo);
        System.out.println("A velocidade do carro é de : " + this.velocidadeAtual);
    }
}
