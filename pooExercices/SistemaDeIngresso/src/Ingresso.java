public class Ingresso {

    private String evento;
    private double precoBase;

    public Ingresso(String evento, double precoBase) {

        if(evento.isBlank()){
            throw new IllegalArgumentException("Evento obrigatorio.");
        }
        this.evento = evento;

        if(precoBase < 0){
            throw new IllegalArgumentException("Preco base deve ser maior que 0.");
        }
        this.precoBase = precoBase;
    }

    public double calcularPrecoFinal(){
        return precoBase;
    }

    public String getEvento() {
        return evento;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public void exibirResumo(){
            System.out.println("Evento: " + getEvento());
            System.out.println("Preço Base: € " + String.format("%.2f", getPrecoBase()));
            System.out.println("Preço Final: € " + String.format("%.2f", calcularPrecoFinal()));
        }
    }

