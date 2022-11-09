package ru.java_qa.sendbox;

public class FirstProg {

    static Square s = new Square(5);
    static Rectangle r = new Rectangle(10,3);
    public static double area(Square s) {
        return s.l * s.l;
    }
    public static double area(Rectangle r) {
        return r.a * r.b;
    }

    public static void main(String[] args) {

        System.out.println("Done!");

        System.out.println(area(s));

        System.out.println(area(r));

    }
}