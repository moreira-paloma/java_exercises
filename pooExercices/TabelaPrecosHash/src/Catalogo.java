import java.util.HashMap;
import java.util.Map;

public class Catalogo {

    Map<String,Double> produtos = new HashMap<>();

    public void adicionarProduto(){
        produtos.put("Camiseta", 100.0);
        produtos.put("Calca", 150.0);
        produtos.put("Colar", 30.0);
        produtos.put("Biquini", 100.0);
    }

    public void procurarProduto(String nomeProduto){
        if(produtos.containsKey(nomeProduto)){
            System.out.println("Produto : " + produtos.get(nomeProduto));

        }else{
            System.out.println("O produto nao foi encontrado.");
        }

    }


}
