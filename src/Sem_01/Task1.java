package Sem_01;/*
 * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
 */

public class Task1 {
    public static void main(String[] args) {

        print(new int[]{1, 1, 0, 1, 1, 1}); // 3
        print(new int[]{1, 1, 1, 1, 1, 1}); // 6
        print(new int[]{1, 1, 1, 1, 0, 0}); // 4
    }

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

    }
}
