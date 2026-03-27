public class Main {
    public static void main(String[] args) {

        Article article = new Article("Meu Primeiro Artigo Sobre Java","Aprender programação exige prática e paciência");
        System.out.println(article.getTitle());
        System.out.println(article.getMainContent());
        System.out.println("__________________");

        Revision revision = new Revision(article,"O Java é bem complexo. Exige paciencia.");
        System.out.println(revision.getNewContent());

    }
}
