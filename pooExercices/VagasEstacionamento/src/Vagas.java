public class Vagas {

    private String numeroVaga;
    private boolean ocupada;
    private String placa;

    public Vagas(String numero) {
        this.numeroVaga = numero;
        this.ocupada = false;
        this.placa = null;
    }

    public void ocupar(String placa){
        if(placa == null || placa.isEmpty()){
            System.out.println("Digite uma placa válida");

        } else if(!ocupada){  // perguntar sobre logica invertida
           this.placa = placa;
            ocupada = true;
            System.out.println("Vaga " + numeroVaga + " reservada para a placa " + placa);

        }else{
            System.out.println("Esta vaga já esta ocupada!");
        }
    }

    public void liberar(){
        if(ocupada){
            ocupada = false;
            placa = null;
            System.out.println("Vaga liberada!");

        }else {
            System.out.println("Esta vaga já esta livre.");
        }
    }

    public void exibirStatus(){
        System.out.println("A situacao da vaga é " +  (ocupada ? "indisponivel" : "disponivel") + " " + numeroVaga + " com a placa " + placa);
    }
}
