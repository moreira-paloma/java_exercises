public class Main {
    public static void main(String[] args) {

        try{
            NotaAluno.validarNota(9);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try{
            NotaAluno.validarNota(15);
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }

        try{
            NotaAluno.validarNota(-5);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
