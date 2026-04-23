public class Main {
    public static void main(String[] args) {

        ContaSimples conta = new ContaSimples(2000);
        ContaSimples conta1 = new ContaSimples(1000);
        ContaSimples conta2 = new ContaSimples(5000);
        
        try {
            conta.sacar(2500);

        } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());


            }


    }
}
