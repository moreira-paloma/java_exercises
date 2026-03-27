public class IngressoMeia implements Ingresso {

    private String movie;
    private double valorBase;

    public IngressoMeia(String movie, double valorBase){
        this.movie = movie;
        this.valorBase = valorBase;

    }

    @Override
    public double calcularValorFinal() {
        return valorBase / 2;
    }

    public String getMovie(){
        return movie;
    }
}
