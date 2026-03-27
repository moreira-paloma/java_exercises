package comPoo;

public class Produto {

   private String nome;
   private double preco;
   private int quantidade;

   public Produto(String nome){

   }

    public Produto(String nome,double preco,int quantidade){

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public double calcularValorTotal(String senha){
        if(senha == "123"){
            double valorTotal = preco * quantidade;
            System.out.println("O valor total é : " + valorTotal);
            return valorTotal;
        }
        System.out.println("Senha errada!");
        return 0;
    }

   // public void exibirRelatorio(){
     //   System.out.println("Produto: " + nome + " | Total em Estoque: R$ " + calcularValorTotal());
    //}

   public double getPreco(){
       return preco;
   }

   public void setPreco(double preco){
       this.preco = preco;
   }
}
