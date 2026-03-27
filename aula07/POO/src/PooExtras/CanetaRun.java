package PooExtras;

public class CanetaRun {
    public static void main(String[] args) {

    Caneta c1 = new Caneta("BIC","Amarelo", 0.5f);
    c1.status();
    System.out.println("________________________");
    Caneta c2 = new Caneta("FaberCastell","Vermelho",0.10f);
    c2.status();
    System.out.println("_____________________");
    Caneta c3 = new Caneta("Mabel", "Preta",0.5f);
    c3.status();
}
}