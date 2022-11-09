package ru.java_qa.sendbox;

public class FirstProg {

    static Square s = new Square(5);
    static Rectangle r = new Rectangle(10,3);
    
    public static void main(String[] args) {

        System.out.println("Done!");

        System.out.println(s.area());

        System.out.println(r.area());

    }
}