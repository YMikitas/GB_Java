package Sem_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * 1. Дан произвольный список целых чисел. Удалить из него четные числа.
 */
public class Sem3_HW1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> rndList = new ArrayList<Integer>();
        ArrayList<Integer> resultList = new ArrayList<Integer>();

        for (int i = 0; i <= 10; i++) {
            rndList.add(rnd.nextInt(10));
        }
        System.out.println("Исходный список: " + rndList.toString());

        for (Iterator<Integer> iterator = rndList.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
            else {
                resultList.add(number);
            }
        }
        System.out.println("      Результат: " + resultList.toString());
    }
}

