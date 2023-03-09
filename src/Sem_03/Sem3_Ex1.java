package Sem_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Sem3_Ex1 {
    public static void main(String[] args) {
        // Создать список рандомных целых чисел от 0 до 100. Отсортировать список и вывести его на экран.
        Random rnd = new Random();
        int listSize = 20;
        ArrayList<Integer> myList = new ArrayList<>(listSize);
        for (int i = 0; i < listSize; i++) {
            myList.add(rnd.nextInt(101));
        }
        System.out.println("Исходный список: \n" + myList.toString());
        Collections.sort(myList);
        System.out.println("Отсортированный список: \n" + myList.toString());
    }
}
