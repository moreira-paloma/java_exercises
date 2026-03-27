public class Main {
    public static void main(String[] args) {

        Vagas vagas = new Vagas("0102");

        vagas.exibirStatus();
        vagas.ocupar("DDD 10");
        vagas.exibirStatus();
        vagas.liberar();
        vagas.exibirStatus();
    }
}
