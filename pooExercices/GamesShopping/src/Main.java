public class Main {
    public static void main(String[] args) {

        DigitalGame digitalGame = new DigitalGame("Retro Dash",10.0);
        DigitalGame digitalGame1 = new DigitalGame("Dragonspire", 5.0);
        DigitalGame digitalGame2 = new DigitalGame("Mystic Vale", 150);

        System.out.println(digitalGame.getTitle());
        System.out.println(digitalGame.getBasePrice());
        System.out.println(digitalGame.applyDiscount(10));

        System.out.println(digitalGame1.getTitle());
        System.out.println(digitalGame1.getBasePrice());
        System.out.println(digitalGame1.applyDiscount(5));

        System.out.println(digitalGame2.getTitle());
        System.out.println(digitalGame2.getBasePrice());
        System.out.println(digitalGame2.applyDiscount(200));
    }
}
