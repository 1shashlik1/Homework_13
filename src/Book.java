public class Book {
    private String title;
    private int year;
    private Author author;

    public String getTitle() {
        return title;
    }

    public void setYear(int year) {
        this.year = year;
    } // Что-то я вообще не вдупляю как его использовать, хоть убей.

    public Author getAuthor() {
        return author;
    }

    public Book(String title, int year, Author author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String toString() {
        return "Книга: " + "\"" + getTitle() + "\"" +  "\nГод выпуска: " + year + "\nАвтор: " + getAuthor() + '.';
    }

}

