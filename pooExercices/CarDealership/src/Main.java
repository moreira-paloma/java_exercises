public class Main {
    public static void main(String[] args) {

        Financiable motocycle = new Motocycle(1000, 70000.0, "BMW Motorcycle");
        Financiable motocycle2 = new Motocycle(250, 2000.00, "Honda CG");

        double[] installments1 = motocycle.simulateInstallments(24, 0.015);
        double[] installments2 = motocycle2.simulateInstallments(36, 0.015);

        System.out.println("BMW installments:");
        for (int i = 0; i < installments1.length; i++) {
            System.out.printf("Month %d: %.2f%n", i + 1, installments1[i]);
        }

        System.out.println("\nCG installments:");
        for (int i = 0; i < installments2.length; i++) {
            System.out.printf("Month %d: %.2f%n", i + 1, installments2[i]);
        }
    }
}