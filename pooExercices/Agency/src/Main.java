import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<DigitalContent> contents = new ArrayList<>();

        contents.add(new ShortVideo(10000000, "Aprendendo Java"));
        contents.add(new LongVideo(50000L, "Curso Completo de Java",20000L));

        for (DigitalContent content : contents) {
            System.out.println(content.getTitle() + " → Receita: " + content.calculateRevenue());
        }
    }
}