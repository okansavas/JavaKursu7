package Gun28._02_Soru;

public class Book {
    String name;
    int publishYear;
    String author;


    Book() { // bir tane parametreli yapici metod
        // eklendiginde parametresiz olani yazmak
        // ZORUNLUDUR
        this.name = "";
        this.publishYear = 0;
        this.author = "";
    }


    Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    Book(String name) {
        this.name = name;
        this.publishYear = 0;
        this.author = "";
    }

    void KitapYazdir(){
        System.out.println(this.name+""+this.publishYear+""+this.author);

    }
}
