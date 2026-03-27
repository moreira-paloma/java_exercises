import java.util.Locale;

public class SistemaIdioma {
    public static void main(String[] args) {

        Locale locale = Locale.getDefault();

        String idioma = locale.getLanguage();   // ex: "pt", "de", "en"
        String pais = locale.getCountry();      // ex: "BR", "DE", "US"
        String completo = locale.toString();    // ex: "pt_BR", "de_DE"

        System.out.println("Idioma: " + idioma);
        System.out.println("País: " + pais);
        System.out.println("Locale completo: " + completo);
    }
}