public class Main {
    public static void D() {
        System.out.println("===========================================");
    }

    public static void main(String[] args) {

        Author a1 = new Author("Фёдор", "Достоевский");
        Author a2 = new Author("Джейн", "Остин");
        Author a3 = new Author("Джордж", "Оруэлл");
        Author a4 = new Author("Халед", " Хоссейни");
        Author a5 = new Author("Маргарет", " Митчелл");
        Author a6 = new Author("Антуан де", "Сент-Экзюпери");
        Author a7 = new Author("Лев", " Толстой");
        Author a8 = new Author("Джоан", " Роулинг");
        Author a9 = new Author("Лев", " Толстой");
        Author a10 = new Author("Олдос", " Хаксли");

        Book b1 = new Book("Преступление и наказание", 1866, a1);
        Book b2 = new Book("Гордость и предубеждение", 1813, a2);
        Book b3 = new Book("1984", 1949, a3);
        Book b4 = new Book("Тысяча сияющих солнц", 2007, a4);
        Book b5 = new Book("Унесенные ветром", 1936, a5);
        Book b6 = new Book("Маленький принц", 1943, a6);
        Book b7 = new Book("Анна Каренина", 1877, a7);
        Book b8 = new Book("Гарри Поттер и философский камень", 1997, a8);
        Book b9 = new Book("Война и мир", 1869, a9);
        Book b10 = new Book("О дивный новый мир", 1932, a10);

        D();
        System.out.println(b1);
        D();
        System.out.println(b2);
        D();
        System.out.println(b3);
        D();
        System.out.println(b4);
        D();
        System.out.println(b5);
        D();
        System.out.println(b6);
        D();
        System.out.println(b7);
        D();
        System.out.println(b8);
        D();
        System.out.println(b9);
        D();
        System.out.println(b10);
        D();

    }

}