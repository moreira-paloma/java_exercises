import java.util.ArrayList;
import java.util.List;

public class CadastroSimplesCollections {

    List<String> nomes = new ArrayList<>();

    public void adicionarNomes() {
        nomes.add("Paloma");
        nomes.add("Pedro");
        nomes.add("Joao");
        nomes.add("Maria");

    }

    public void listarNomes() {
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }
    }

}
