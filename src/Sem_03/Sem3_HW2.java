package Sem_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
 */
public class Sem3_HW2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 0; i <= 5; i++) {
            array.add(rnd.nextInt(100));
        }
        Collections.sort(array);
        System.out.println(array.toString());

        int min = array.get(0);
        int max = array.get(array.size() - 1);

        double sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }

        double arithmean = sum / array.size();
        System.out.printf("min: " + min);
        System.out.printf("\nmax: " + max);
        System.out.printf("\nСреднее арифметическое: " + arithmean);
    }
}