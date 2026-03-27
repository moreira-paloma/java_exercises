public class IngressoInteira implements Ingresso {

    private String movie;
    private double valorBase;

    public IngressoInteira(String movie, double valorBase){
        this.movie = movie;
        this.valorBase = valorBase;
    }
    @Override
    public double calcularValorFinal() {
        return valorBase;
    }

    public String getMovie(){
        return movie;
    }
}
