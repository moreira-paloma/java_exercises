public interface AccountInterface {

    void deposit(double value);
    boolean withdraw(double value);
    double getBalance();
    String getOwner();
    int getNumberAccount();
    String getDetails();

    // Método DEFAULT (Não é obrigatório implementar)
    //default String getDetails() {
       // return "Informações da conta não especificadas.";

}
