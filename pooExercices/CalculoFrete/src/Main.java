public class Main {
    public static void main(String[] args) {

        FretePadrao fretePadrao = new FretePadrao();
        FreteExpresso freteExpresso = new FreteExpresso();
        FreteGratis freteGratis = new FreteGratis();

        ResumoEntrega resumoEntrega = new ResumoEntrega(7,149,freteExpresso);
        ResumoEntrega resumoEntrega1 = new ResumoEntrega(10,150,fretePadrao);
        ResumoEntrega resumoEntrega2 = new ResumoEntrega(15,155,freteGratis);

        resumoEntrega.mostrarResumo();
        System.out.println("______________");
        resumoEntrega1.mostrarResumo();
        System.out.println("_______________");
        resumoEntrega2.mostrarResumo();
    }
}
