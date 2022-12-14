package hu.petrik.sokszogoop;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Haromszog h = new Haromszog();
            System.out.println(h);
        }
        for (int i = 0; i < 5; i++) {
            double a = Math.random() * 10 + 5;
            double b = Math.random() * 10 + 5;
            System.out.println(new Teglalap(a, b));
        }
        for (int i = 0; i < 5; i++) {
            double a = Math.random() * 10 + 5;
            double b = Math.random() * 10 + 5;
            double alfa = Math.random() * 178 + 1;
            System.out.println(new Paralelogramma(a, b, alfa));
        }
        for (int i = 0; i < 2; i++) {
            double atlo = 0;
            double a = Math.random() * 10 + 5;
            atlo = a * Math.sqrt(2);
            System.out.println(new Negyzet(a, atlo));
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(new Sokszogek().kiir(i));
        }
        System.out.println(Sokszogek.sokszogAdatok());
    }
}
