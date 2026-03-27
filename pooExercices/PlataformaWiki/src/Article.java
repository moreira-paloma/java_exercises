public class Article {

    private String title;
    private String mainContent;
    private boolean lockForEdition;

    public Article(String title,String mainContent){
        this.title = title;
        this.mainContent = mainContent;
        this.lockForEdition = false;
    }

    public String getMainContent() {
        return mainContent;
    }

    public void setMainContent(String mainContent) {
        this.mainContent = mainContent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void applyRevision(Revision revision){
        if(lockForEdition){
            System.out.println("Artigo bloqueado para edicao : ");
            return;
        }
        this.mainContent = revision.getNewContent();
    }
}
