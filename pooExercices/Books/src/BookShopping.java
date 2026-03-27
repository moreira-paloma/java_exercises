public class BookShopping {

    private String books;
    private String author;
    private boolean available;

    public BookShopping(String books, String author){
        this.books = books;
        this.author = author;
        this.available = true;
    }

    public void lendBook(){
        if(available){
            available = false;
            System.out.println("O livro foi emprestado! ");
        } else{
            System.out.println("O livro nao esta disponivel!");
        }
    }

    public void returnBook(){
        if(!available){
            available = true;
            System.out.println("O livro foi devolvido");
        } else{
            System.out.println("O livro nao foi devolvido");
        }
    }

    public void detailsInfo(){

        System.out.println("Name of the book is: " + books + ", author: " + author);
        System.out.println("Current situation: " + available);
    }
}
