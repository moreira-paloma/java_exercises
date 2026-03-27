public class Lampada {

    private boolean ligada;
    private int intensidade;

    public Lampada(){
        this.ligada = false;
        this.intensidade = 0;
    }

    public void ligar(){
        this.ligada = true;
        this.intensidade = 100;
    }

    public void desligar(){
        this.ligada = false;
        this.intensidade = 0;
    }

    public void ajustarIntensidade(int valor){
        if(valor < 0 || valor > 100){
            System.out.println(" Valor inválido. ");
            return;
        }
        this.intensidade = valor;
    }

    public void status(){
        System.out.println("Ligada " + ligada);
        System.out.println("Intensidade " + intensidade);
    }
}
