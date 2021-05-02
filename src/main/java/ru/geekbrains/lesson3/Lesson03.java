package ru.geekbrains.lesson3;

public class Lesson03 {
    public static void main (String [] args){
        FirstArray();
        SecondArray();
        ThirdArray();
        ForthArray();
        FifthArray(10,100);

    }
    // Задание 1
    public static void FirstArray() {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print (arr[i] + "\t");
        }
    System.out.println("");
        for (int i = 0; i < arr.length; i++ ) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print (arr[i] + "\t");
        }
        System.out.println("");
    }

    //Задание 2

    public static void SecondArray() {
        int [] array = new int [100];
        for (int i=0; i < array.length; i++) {
            array[i]= i + 1;
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    //Задание 3

    public static void ThirdArray() {
        int[] massive = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int a=0; a < massive.length; a++){
            System.out.print (massive[a] + "\t");
        }
       System.out.println("");
        for (int a = 0; a < massive.length; a++ ) {
            if (massive[a]<6) {
                massive[a] = massive[a] * 2;
           }
        }
        for(int a=0; a < massive.length; a++){
            System.out.print (massive[a] + "\t");
        }
        System.out.println("");
    }

    // Задание 4

    public static void ForthArray() {
        int [][] table = new int [4][4];
        for (int i = 0; i < table.length; i++) {
            for(int j=0; j < table[i].length; j++) {
                if (i == j || (j+i)==3) table[i][j] = 1;
                else table[i][j] = 0;
                System.out.print(table[i][j] + " ");
            }
        }

    }
    //Задание 5
    public static int FifthArray (int len, int initValue) {
        int[] testArray = new int[len];
        for (int i =0; i < testArray.length; i++) {
            testArray[i] = initValue;
        }
        return testArray;
    }
}

