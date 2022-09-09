package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 1");
        task1();
        System.out.println("\n" + " Задание 2");
        task2();
        System.out.println("\n" + " Задание 3");
        task3();
        System.out.println("\n" + " Задание 4");
        task4();
        System.out.println("\n" + " Задание 5");
        task5();
        System.out.println("\n" + " Задание 6");
        task6();
        System.out.println("\n" + " Задание 7");
        task7();
        System.out.println("\n" + " Задание 8");
        task8();
        System.out.println("\n" + " Задание 9");
        task9();
    }

    public static void task1() {
        for (int i = 1; i < 11; i++)
            System.out.print(i + " ");
    }

    public static void task2() {
        for (int i = 10; i >= 1; i--)
            System.out.print(i + " ");
    }

    public static void task3() {
        for (int i = 2; i < 17; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static void task4() {
        for (int i = 10; i >= -10; i--)
            System.out.print(i + " ");
    }

    public static void task5() {
        for (int i = 1904; i <= 2096; i += 4)
            System.out.println(i + " год является високосным");
    }

    public static void task6() {
        for (int i = 7; i <= 98; i += 7)
            System.out.print(i + " ");
    }

    public static void task7() {
        for (int i = 1; i <= 512; i *= 2)
            System.out.print(i + " ");
    }

    public static void task8() {
        int salary = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9() {
        int salary = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
}
