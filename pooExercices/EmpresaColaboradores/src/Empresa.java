import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nomeFantasia;
    private List<Colaborador> equipe;

    public Empresa(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
        this.equipe = new ArrayList<>();
    }

    public void contratar(Colaborador colaborador) {

        for (Colaborador c : equipe) {
            if (c.getId() == colaborador.getId()) {
                System.out.println("Erro: ID já existe na empresa.");
                return;
            }
        }

        equipe.add(colaborador);
        System.out.println("Colaborador contratado: " + colaborador.getNome());
    }

    // 2. REMOVER (versão simples com for-each + variável auxiliar)
    public void remover(int id) {
        Colaborador remover = null;

        for (Colaborador c : equipe) {
            if (c.getId() == id) {
                remover = c;
                break;
            }
        }

        if (remover != null) {
            equipe.remove(remover);
            System.out.println("Colaborador removido: " + remover.getNome());
        } else {
            System.out.println("Nenhum colaborador encontrado com ID: " + id);
        }
    }


    public void reajustarSalario(int id, double novoSalario) {

        for (Colaborador c : equipe) {
            if (c.getId() == id) {
                c.setSalarioBase(novoSalario);
                System.out.println("Salário reajustado para " + c.getNome());
                return;
            }
        }

        System.out.println("ID não encontrado para reajuste.");
    }

    public void listarColaboradores() {
        System.out.println("\n--- Lista de Colaboradores ---");

        for (Colaborador c : equipe) {
            System.out.println("ID: " + c.getId() + " | Nome: " + c.getNome());
        }
    }

    public double calcularFolhaTotal() {
        double total = 0;

        for (Colaborador c : equipe) {
            total += c.calcularPagamentoFinal();
        }

        return total;
    }

    public Colaborador buscarMaiorPagamento() {

        if (equipe.isEmpty()) {
            return null;
        }

        Colaborador maior = equipe.get(0);

        for (Colaborador c : equipe) {
            if (c.calcularPagamentoFinal() > maior.calcularPagamentoFinal()) {
                maior = c;
            }
        }

        return maior;
    }
}