public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка");
        Author author1 = new Author("Герберь", " Шильдт");
        Author author2 = new Author("Кэти", " Сьерра");

        Book book1 = new Book("Java. Полное руководство", author1, 2022);
        Book book2 = new Book("Изучаем Java", author2, 2012);
        book2.setPublicationYear(2022);
        System.out.println("Книга 1 " + book1.getTitle() + " Автор: " + author1.getFirstName() + " " + author1.getLastName() + ". Год издания " + book1.getPublicationYear());
        System.out.println("Книга 2 " + book2.getTitle() + " Автор: " + author2.getFirstName() + " " + author2.getLastName() + ". Год издания " + book2.getPublicationYear());
    }
}