public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Александр", "Пушкин");

        Author author2 = new Author("Михаил", "Лермонтов");
        Author author3 = new Author("Михаил", "Лермонтов");

        Book book1 = new Book("Евгений Онегин", 1823, author1);
        Book book2 = new Book("Герой нашего времни", 1839, author2);

        System.out.println(author1.toString());
        System.out.println(book1.toString());

        System.out.println(author3 == author2);
        System.out.println(author2 == author3);
        System.out.println(author3.equals(author2));
        System.out.println(author2.equals(author3));

        System.out.println(author2.hashCode());
        System.out.println(author3.hashCode());
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());


    }
}