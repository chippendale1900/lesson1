package lesson1;

public class lesson01 {
    public static void main (String [] args) {
        printThreeWords();
        checkSumsign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords () {
        System.out.println ("Orange");
        System.out.println ("Banana");
        System.out.println ("Apple");
    }
    public static void checkSumsign() {
        int a = -3;
        int b = -9;
        int c = a + b;
        if (c>=0) {
            System.out.println ("Сумма положительная");
        }
        else {
            System.out.println ("Сумма отрицательная");
        }

    }
    public static void printColor () {
        int value = 0;
        if (value <= 0) {
            System.out.println ("Красный");
        }
        if (value>0 && value<=100) {
            System.out.println ("Желтый");
        }
        if (value>100) {
            System.out.println ("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 13;
        int b = 17;
        if (a>=b) {
            System.out.println ("a>=b");
        }
        else {
            System.out.print ("a<b");
        }
    }
}
