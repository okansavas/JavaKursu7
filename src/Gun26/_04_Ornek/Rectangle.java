package Gun26._04_Ornek;

public class Rectangle {

    int width;
    int length;

    void Alan() {
        System.out.println("Alan = " + (this.width * this.length));
    }

    void Cevre() {
        System.out.println("Cevre = " + 2 * (this.width + this.length));

    }

    int Alan2() {
        return (this.width * this.length);
    }

    void degerAta(int width, int length) {
        this.width = width;
        this.length = length;

    }
}
