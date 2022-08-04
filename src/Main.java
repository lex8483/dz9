public class Main {
    public static void main(String[] args) {
        Author name1 = new Author("Лев", "Толстой");
        Author name2 = new Author("Федор", "Достоевский");
        Book book1 = new Book(name1, "Анна Каренина", 1850);
        Book book2 = new Book(name2, "Преступление и наказание", 1870);
        book1.setPublisherYear(1875);
        book2.setPublisherYear(1866);
        System.out.println(book1);
        System.out.println(book2.getPublishingYear());
        System.out.println(book1.getName());
        System.out.println(book1.getAuthorName().getLastName());
        System.out.println(book2.getAuthorName().getFirstName());
        System.out.println(book2.getAuthorName().getAuthor());

    }
}