package Lesson_01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        print(new int[]{1, 1, 0, 1, 1, 1}); // 3
        print(new int[]{1, 1, 1, 1, 1, 1}); // 6
        print(new int[]{1, 1, 1, 1, 0, 0}); // 4
    }

    /**
     * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
     */
    private static void print(int[] array) {
        int counter = 0;
        int maxCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                counter++;
            }
            else {
                if (maxCounter < counter) {
                    maxCounter = counter;
                }
                counter = 0;
            }
        }
        if (maxCounter < counter) {
            maxCounter = counter;
        }
        System.out.println(maxCounter);






        /*
        int[] arr = new int[] {1, 2, 3, 4, 5};
        arr[3] = 15;
        System.out.println(arr[3]);

        int [] [] array = new int[3] [5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d ", array[i] [j]);
            }
            System.out.println();
        }

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
*/


    }
}




/*
Многострочные
комментарии
 */

