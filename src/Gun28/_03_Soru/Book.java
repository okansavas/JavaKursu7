package Gun28._03_Soru;

public class Book {
    String name;
    int publishYear;
    String author;


    public Book() {
        // this("",0,"");
    }

    public Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    public Book(String name) {
        // this.name = name;
        this(name,0,"");
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", author='" + author + '\'' +
                '}';
    }
}
