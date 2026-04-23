import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nomeFantasia;
    private List<Funcionario> equipe;

    public Empresa(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
        this.equipe = new ArrayList<>();
    }

    public void contratar(Funcionario funcionario){
        equipe.add(funcionario);
        System.out.println("Funcionario contratado " + funcionario.getNome());
    }

    public void relatorioDeEquipe(){
        System.out.println("\n--- Quadro de Funcionários: " + nomeFantasia + " ---");
        for(Funcionario funcionario : equipe){
            System.out.println(funcionario.obterResumo());
        }
    }

    public void fecharFolhaPagamento(){
        double custoTotal = 0;
        System.out.println("\n--- Fechamento da Folha de Pagamento ---");

        for(Funcionario funcionario : equipe){
            double salario = funcionario.calcularSalarioFinal();
            custoTotal += salario;
            System.out.println(funcionario.getNome() + " receberá: R$ " + String.format("%.2f", salario));
        }
        System.out.println("----------------------------------------");
        System.out.println("Custo Total da Empresa: R$ " + String.format("%.2f", custoTotal));
    }
}
