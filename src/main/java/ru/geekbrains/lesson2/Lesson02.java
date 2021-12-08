package ru.geekbrains.lesson2;

public class Lesson02 {
    public static void main (String[] args) {
        if (within10and20(3, 15)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        isPositiveOrNegative(12);
        if (isNegative(-3)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        printWordNTimes("Hope",2);
    }
        public static boolean within10and20(int x1, int x2) {
            return (x1+x2) > 10 && (x1+x2) < 20;
        }
        public static void isPositiveOrNegative (int x) {
            if (x >= 0) {
                System.out.println("positive");
            } else {
                System.out.println("negative");
            }
        }
        public static boolean isNegative (int x2) {
            return x2 > 0;
        }
        public static void printWordNTimes (String word, int times) {
            for ( int i = 0; i < times; i++ ) {
                System.out.println(word);
            }
        }
}
