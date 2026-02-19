package Assignment_5;

    public class Book {
        String title;
        String author;
        boolean available;

        public Book(String title, String author){
            this.title = title;
            this.author = author;
        }

        public void borrow(){
            if (available){
                System.out.println("Du har lånt: " + title);
                available = false;
            } else {
                System.out.println(title + " er ikke tilgængelig");
            }
        }

        public void returnBook(){
            available = true;
            System.out.println("Retunret: " + title);
        }

        public String toString(){
            return null;
        }


    }
