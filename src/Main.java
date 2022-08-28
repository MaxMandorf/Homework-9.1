public class Main {
    public static void main(String[] args) {
        var author = new Author("Марк", "Лоуренс");
        var author2 = new Author("Марк", "Лоуренс");
        var author3 = new Author("Марк", "Лоуренс");
        var book1 = new Book("Принц Терний", author, 2012);
        var book2 = new Book("Король Терний", author, 2014);
        var book3 = new Book("Император Терний", author, 2014);
        System.out.println(author);
        System.out.println(book1);
        System.out.println(author2);
        System.out.println(book2);
        System.out.println(author3);
        System.out.println(book3);
    }
}