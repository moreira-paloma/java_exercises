import java.util.LinkedList;

public class FilaSimples {

    LinkedList<String> fila = new LinkedList<>();

    public void inserirClientesFila(){
        fila.addLast("Paloma");
        fila.addLast("Pedro");
        fila.addLast("Joao");
        fila.addFirst("Marcia");
    }

    public void atendimento(){
        while(!fila.isEmpty()){
            String cliente = fila.removeFirst();
            System.out.println("Atendimento ao cliente " + cliente);

        }
    }
}
