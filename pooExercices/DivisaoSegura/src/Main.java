public class Main {
    public static void main(String[] args) {

        Divisao divisao = new Divisao();

        try{
            double resultado = divisao.dividir(10,2);
            System.out.println("Resultado: " + resultado);
        } catch(Exception e){
            System.out.println("Erro na divisão válida: " + e.getMessage());
        }

        try{
            double resultado = divisao.dividir(10,0);
            System.out.println("Resultado: " + resultado);
        } catch(Exception e){
            System.out.println("Erro na divisão inválida: " + e.getMessage());
        }
    }
}
