import java.util.ArrayList;

public class Library {
        String libraryName;
        ArrayList<Book>books = new ArrayList<>();

        public Library(String libraryName){
            this.libraryName = libraryName;
            this.books = new ArrayList<>();
        }

    public void addBook(Book book){

    }

    public ArrayList<Book> findAvailableBooks() {
     return null;
    }

    public Book findBookByTitle(String title){
    return null;
    }

    public void printAllBooks() {
        System.out.println("\n=== " + libraryName + " ===");
        System.out.println("Alle bøger:");
        for (Book book : books) {
            System.out.println("- " + book);
        }
    }


}
