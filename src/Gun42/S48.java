package Gun42;

import java.util.ArrayList;
import java.util.List;

public class S48 {
    public static void main(String[] args) {
        List colors=new ArrayList();

        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");

        colors.remove(2); // red gitti
        System.out.println("colors = " + colors);

        colors.add(3,"cyan"); // colors.add("cyan");
        // son siraya denk gelen indexe eklenebilir,
        // ama ondan daha büyük bir indexe eklenemez hata verir

        System.out.println("colors = " + colors);






    }



    }

