package Gun26._03_Ornek;

public class Person {
    String name;
    String surName;
    int age;

    void BilgiYazdir() {
        System.out.println("cal1.name = " + this.name);
        System.out.println("cal1.surname = " + this.surName);
        System.out.println("cal1.age = " + this.age);
        // this yani kendisinin manasinda
    }

        void getBirthYear() {
            System.out.println("Birth Year = " + (2024-this.age));

        }
    }

