package exerciciosPoo;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

public Funcionario(String nome, String cpf, double salario){
    this.nome = nome;
    this.cpf = cpf;
    this.salario = salario;

}

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setSalario(double novoSalario) {
     if(novoSalario > this.salario){
         this.salario = novoSalario;
     }
     else{
         System.out.println("Nao é possivel reduzir o salário !" );
     }

    }
    public double getSalario() {
        return salario;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salario: " + salario);

    }
}
