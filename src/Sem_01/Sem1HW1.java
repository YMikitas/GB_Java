package Sem_01;

import java.util.Random;

public class Sem1HW1 {
    public static void main(String[] args) {
        /*
         * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
         * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
        System.out.println("\nTask 1");
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
            System.out.print(arr[i] + "; ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                arr[i] = 1;}
            else arr[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "; ");
        }

        /*
        2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */
        System.out.println("\nTask 2");
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] = array[i] * 2;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }

        /*
         * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
         */
        System.out.println("\nTask 3");
        int[][] arr3 = new int[5][5];
        for (int i = 0; i < arr3.length; i++) {
            System.out.println();
            for (int j = 0; j < arr3.length; j++) {
                if (arr3[i] == arr3[j]) arr3[i][j] = 1;
                System.out.print(arr3[i][j] + "\t");
            }
        }

        /*
         * 4. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
         */
        System.out.println("\nTask 4");
        int[] arr4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = arr4[0];
        int max = arr4[0];
        for (Integer i : arr4) {
            if (i < min) min = i;
            if (i > max)
                max = i;
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);


        System.out.println("Находится ли сумма чисел между 10 и 20");
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false

        System.out.println("Положительное ли число?");
        System.out.println(isPositive(5));

        System.out.println("напечатать строку source repeat раз");
        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println("является ли год високосным");
        System.out.println(isLeapYear(2020)); //true

//        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
//        int x = array[2][3];
//
//        String[] stringArray = {"aaa", "aab", "aa"};
//        System.out.println(findCommonPrefix(stringArray)); // aa
//        String[] stringArray2 = {"abc", "bca", "cda"};
//        System.out.println(findCommonPrefix(stringArray2)); // ""
    }

    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        int summ = a + b;
        if (summ >= 10 && summ <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x > 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        StringBuilder multi = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            multi.append(source);
        }
        System.out.println(multi);
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        if ( ( ( year % 4 == 0 ) && ( year % 100 != 0 ) ) || ( year % 400 == 0 ) ){
            return true;
        } else {
            return false;
        }
    }

    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int [] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initalValue;
        }
        return array;
    }

    private static String findCommonPrefix(String[] source) {
        /** Найти общий префикс среди слов из одного массива.
         * ["aaa", "aab", "aa"] -> "aa", ["abc", "bca", "cda"] -> ""
         */
        return null;
    }

/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * 4. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
 */
}
