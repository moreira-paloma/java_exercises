public class Main {
    public static void main(String[] args) {

        try {
            ProdutoCadastro produto = new ProdutoCadastro("Camiseta Hering", 50.00, 10);
            produto.exibirResumo();
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar produto: " + e.getMessage());
        }

        try {
            ProdutoCadastro produto2 = new ProdutoCadastro("Bola de Futebol", 0.0, 5);
            produto2.exibirResumo();
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar produto: " + e.getMessage());
        }

        try {
            ProdutoCadastro produto3 = new ProdutoCadastro("Mouse Gamer", 120.00, -3);
            produto3.exibirResumo();
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar produto: " + e.getMessage());
        }

        System.out.println("Cadastro finalizado.");
    }
}