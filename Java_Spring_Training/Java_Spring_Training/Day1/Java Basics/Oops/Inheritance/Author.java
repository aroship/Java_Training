

public class Author {
    String authorName = "Aroshi";
    int authorId;
    Author author;
    public Author() {

    }
    public Author(Author author) {
        this.author = author;
    }
    public Author(String authorName) {
        this.authorName = authorName;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public int getAuthorId() {
        return authorId;
    }
    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
    public void assign() {
        System.out.println("Author assigned successfully!");
    }

}

