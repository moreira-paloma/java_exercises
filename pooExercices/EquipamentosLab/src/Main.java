public class Main {
    public static void main(String[] args) {

        Equipamentos equipamentos = new Equipamentos("01", "Maquina de RaioX");
        Equipamentos equipamentos1 = new Equipamentos("02", "Maquina de Gesso");

        equipamentos.mostrarSituacao();
        equipamentos.emprestar("Talita");
        equipamentos.mostrarSituacao();
        equipamentos.devolver();
        equipamentos.mostrarSituacao();

        System.out.println("_____________________");

        equipamentos1.mostrarSituacao();
        equipamentos1.emprestar("Jorge");
        equipamentos1.mostrarSituacao();
        equipamentos1.devolver();
        equipamentos1.mostrarSituacao();
    }
}
