package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int a = 16;
        int b = 66;

//        int[] numbers = randomArray(20);
//        int[] numbers = {0, 5, 7, 1, 8, 4, 8, 3, 1, 5, 0, 1  6, 2, 9};
//        System.out.println(Arrays.toString(numbers));
//        bubbleSort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        isPrimeNamber(a);
//        primeFactorization(b);
//        System.out.println(calculator("63+1"));
//        calculator("3+1");
    }


    public static int calculator(String expression) {
        int c = 0;
        if (expression.contains("-")) {
            String values[] = expression.split("-");
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            c = a - b;
        } else if (expression.contains("/")) {
            String values[] = expression.split("/");
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            c = a / b;
        } else if (expression.contains("*")) {
            String values[] = expression.split("\\*");
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            c = a * b;
        } else if (expression.contains("+")) {
            String values[] = expression.split("\\+");
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            c = a + b;
        }
        return c;
    }

    public static void bubbleSort(int[] myArray) {
        for (int i = 1; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length - i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int n = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = n;
                }
            }
        }
    }

    public static int[] randomArray(int lenth) {
        int[] myArray = new int[lenth];
        for (int i = 0; i < myArray.length; i++) {
            Random random = new Random();
            myArray[i] = random.nextInt(101);
        }
        return myArray;
    }

    public static boolean isPrimeNamber(int a) {
        for (int i = 2; i < a / i; i++) {
            if (a % i == 0) {
                System.out.println("Число составное");
                return false;
            }
        }
        System.out.println("Число простое");
        return true;
    }

//разложение числа на простые множители
    public static void primeFactorization(int b) {
        for (int i = 2; b > 1; ) {
            if (b % i == 0) {
                System.out.print(i + ",");
                b = b / i;
            } else {
                i++;
            }
        }
    }
}
