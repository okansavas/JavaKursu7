package Gun11;

public class _08_JavaMath {
    public static void main(String[] args) {
        int a=12;
        int b=4;

        // 2 deger icin gecerli
        System.out.println("a ve b den büyük olani = " + Math.max(a,b) );
        System.out.println("a ve b den kucuk olani = " + Math.min(a,b) );
        System.out.println("2. nin 3. kuvvet = " + Math.pow(2,3));  // 3
        System.out.println("b nin karakökü " + Math.sqrt(b) );  // 4

        System.out.println("ceil 3.1 = " + Math.ceil(3.1));  // 4, bu rakamdan büyük en yakin tam sayi
        System.out.println("ceil 3.9 " + Math.ceil(3.9));  // 4, bu rakamdan büyük en yakin tam sayi

        System.out.println("floor 3.1 " + Math.floor(3.1));  // 3, bu rakamdan kücük en yakin tam sayi
        System.out.println("floor 3.9 " + Math.floor(3.9));  // 3, bu rakamdan kücük en yakin tam sayi





    }
}
