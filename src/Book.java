import java.util.Objects;

public class Book {
    private final Author authorName;
    private int publishingYear;
    private final String name;

    public Book(Author authorName, String name, int publishingYear) {
        this.authorName = authorName;
        this.name = name;
        this.publishingYear = publishingYear;
    }

    public Author getAuthorName() {

        return authorName;
    }

    public String getName() {

        return this.name;
    }

    public int getPublishingYear() {

        return this.publishingYear;
    }

    public void setPublisherYear(int years) {

        this.publishingYear = years;
    }

    @Override
    public String toString() {
        return authorName.getAuthor() + " - " + name + " - " + publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && authorName.equals(book.authorName) && name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, publishingYear, name);
    }

}
