public class Bilheteria {

        public void processarVenda(Ingresso ingresso) {
            double finalValue = ingresso.calcularValorFinal();
            System.out.println("Final ticket price: $" + finalValue);
        }
    }

