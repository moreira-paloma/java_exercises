public class Main {
    public static void main(String[] args) {

        System.out.println("=== FLUXO 1 ===");
        ChamadoSuporte c1 = new ChamadoSuporte("PROTO-001", "Erro no sistema");
        c1.mostrarStatusAtual();
        c1.iniciarAtendimento();
        c1.aguardarCliente();
        c1.retomarAtendimento();
        c1.resolver();
        c1.mostrarStatusAtual();

        System.out.println("\n=== FLUXO 2 ===");
        ChamadoSuporte c2 = new ChamadoSuporte("PROTO-002", "Problema na impressora");
        c2.resolver();
        c2.retomarAtendimento();
        c2.aguardarCliente();
        c2.mostrarStatusAtual();

        System.out.println("\n=== FLUXO 3 ===");
        ChamadoSuporte c3 = new ChamadoSuporte("PROTO-003", "Lentidão");
        c3.iniciarAtendimento();
        c3.cancelar();
        c3.mostrarStatusAtual();

        System.out.println("\n=== FLUXO 4 ===");
        ChamadoSuporte c4 = new ChamadoSuporte("PROTO-004", "Erro de login");
        c4.iniciarAtendimento();
        c4.resolver();
        c4.cancelar();
        c4.mostrarStatusAtual();
    }
}