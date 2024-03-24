

public class Book extends Author {
    public Book(String authorName) {
        super(authorName);
    }
    public void assign() {
        super.assign();
        System.out.println("Book assigned successfully!");
    }
    public static void main(String[] args) {
        Book book = new Book("Aroshi");
        System.out.println(book.authorName);
        book.assign();
    }
}

