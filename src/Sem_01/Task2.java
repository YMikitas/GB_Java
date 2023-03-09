package Sem_01;/*
 * Дан массив nums = [3,2,2,3] и число val = 3.
 * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
 * Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
 */

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {3, 2, 2, 3, 2, 3, 4, 3, 2};
        swap(array, 2);
        System.out.println(Arrays.toString(array)); // [3, 3, 3, 4, 3, 2, 2, 2, 2]
    }

    private static int[] swap(int[] array, int val) {
        int count =0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] == val && array[j] != array[j + 1]) {
                    array[j] = array[j + 1];
                    array[j + 1] = val;
                }
            }
        }
        System.out.println(count);
        return array;
    }
}