public class MainBookShopping {
    public static void main(String[] args) {

        BookShopping bookingShopping = new BookShopping("The Alchemist","Paulo Coelho");

        bookingShopping.lendBook();
        bookingShopping.detailsInfo();
        bookingShopping.returnBook();
        bookingShopping.detailsInfo();

    }
}
