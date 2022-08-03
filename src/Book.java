public class Book {
    private Author authorName;
    private int publishingYear;
    private final String name;

    public Book(Author authorName, String name, int publishingYear) {
        this.authorName = authorName;
        this.name = name;
        this.publishingYear = publishingYear;
    }

    public Author getAuthorName() {
        return this.authorName;
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
}

