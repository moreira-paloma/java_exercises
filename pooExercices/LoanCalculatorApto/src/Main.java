public class Main {
    public static void main(String[] args) {

        House house = new House("St Paul",250000);
        Apartment apartment = new Apartment("St Ruth", 300000,500);

        System.out.println(STR."House address: \{house.getAddress()}");
        System.out.printf("House first installment: %.2f%n", house.calculateFirstInstallment(360));
        System.out.println(STR."House total value: \{house.getTotalValue()}");

        System.out.println("____________________________");

        System.out.println(STR."Apartment address: \{apartment.getAddress()}");
        System.out.printf("Apartment first installment: %.2f%n", house.calculateFirstInstallment(360));
        System.out.println(STR."Apartment total value: \{apartment.getTotalValue()}");
    }
}
