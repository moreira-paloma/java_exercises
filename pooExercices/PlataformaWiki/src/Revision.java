public class Revision {

    private Article article;
    private String newContent;

    public Revision(Article article, String newContent){
        this.article = article;
        this.newContent = newContent;
    }

    public Article getArticle() {
        return article;
    }

    public String getNewContent() {
        return newContent;
    }
}

