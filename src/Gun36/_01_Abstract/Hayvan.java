package Gun36._01_Abstract;

public abstract class Hayvan {

    private String cinsi;  // Encapsulation
    private int yas;

    abstract void ses();

    public void yemek(){
        System.out.println("yemek yedi");
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

}
