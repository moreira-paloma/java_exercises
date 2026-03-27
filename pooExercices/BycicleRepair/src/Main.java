public class Main {
    public static void main(String[] args) {

        Motocycle moto = new Motocycle("BMW");
        Motocycle moto2 = new Motocycle("Kawazaki");

        //add pecas
        moto.addParts(new BikeParts("Tires", 1000));
        moto.addParts(new BikeParts("Break", 900));
        System.out.println("______________________________");

        moto2.addParts(new BikeParts("Tires", 5000));
        moto2.addParts(new BikeParts("Break", 10000));

        moto.registerTravel(500);
        moto.registerTravel(1500);
        moto2.registerTravel(10000);
        moto2.registerTravel(14000);

        moto.partsForReplace();
        moto2.partsForReplace();
    }
}
