package ru.geekbrains.lesson2;

public class Lesson02 {
    int x1 = 20;
    int x2 = 13;

    public static boolean within10and20(int x1, int x2) {
        int sum = x1 + x2;
        if (sum > 10 && sum < 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void isPositiveOrNegative(int x1) {
        if (x1 >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
    public static boolean isNegative(int x2) {
        if (x2 > 0) {
            return true;
        }
        return false;
    }
    public static void printWordNTimes(String word, int times) {
        int times = 4;
        String word = "Привет";

        for ( int i = 0; i < times; ++i ) {
            System.out.println(word);
        }
    }
}
