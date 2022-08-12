package com.company;

public class Main {

    public static void main(String[] args) {
        Programmer programmer = new Programmer("Burulai", "programmer", "Google DeepMind");
        Dancer dancer = new Dancer("Jon", "dancer", "Boys");
        Singer singer = new Singer("Aiu", "singer", "bests");

        System.out.println(programmer);
        System.out.println(dancer);
        System.out.println(singer);

        programmer.coding();
        programmer.walk();
        programmer.eat();

        dancer.dancing();
        dancer.eat();
        dancer.walk();
        singer.singing();
        singer.walk();
        singer.eat();
    }
}
