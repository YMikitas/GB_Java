package Lesson_01;

import java.util.Arrays;

public class third {
    public static void main(String[] args) {
        int[] array = {3, 2, 2, 3};
        swap(array, 3);
        System.out.println(Arrays.toString(array)); // [2, 2, 3, 3]
    }
    private static void swap(int[] array, int val) {
        int count = 1;
        for (int i = 0; i < array.length; i++) {

            int temp=0;
            if (array[i]==val && array.length-count>i){

                while (array[array.length-count]==val ){

                    count++;
                }
                temp=array[array.length-count];
                array[array.length-count]=array[i];
                count++;
                array[i]=temp;
                }
            }
        }
    }



    /**
     * Дан массив nums = [3,2,2,3] и число val = 3.
     * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
     * Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
     **/