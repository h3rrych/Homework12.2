public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка");
        Author author1 = new Author("Герберт", " Шильдт");
        Author author2 = new Author("Кэти", " Сьерра");

        Book book1 = new Book("Java. Полное руководство", author1, 2022);
        Book book2 = new Book("Изучаем Java", author2, 2012);
        book2.setPublicationYear(2022);
        System.out.println(book1);
        System.out.println(book2);
    }
}