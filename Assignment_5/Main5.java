    public class Main5 {
        public static void main(String[] args) {
            Library library = new Library("Københavns Bibliotek");

            // Tilføj bøger
            library.addBook(new Book("1984", "George Orwell"));
            library.addBook(new Book("Harry Potter", "J.K. Rowling"));
            library.addBook(new Book("Ringenes Herre", "J.R.R. Tolkien"));
            library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
            library.addBook(new Book("Pride and Prejudice", "Jane Austen"));
        }
    }
