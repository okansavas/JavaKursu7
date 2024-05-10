package Gun42;

public class MyField {

        int x;
        int y;

        public void doStuff(int x, int y) {
            x=x;
            y=this.y;
        }
        public void display() {
            System.out.println(x + "" + y + ":");
        }

    public static void main(String[] args) {
        MyField m1=new MyField();
        m1.x=100;               // olmasi gereken : this.x=x;
        m1.y=200;               // olmasi gereken:  this.y=y;

        MyField m2=new MyField();
        m2.doStuff(m1.x, m1.y);

        m1.display();  // 100, 200
        m2.display();  // 0, 0



    }
}
