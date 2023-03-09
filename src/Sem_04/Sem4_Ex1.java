package Sem_04;

/**
 * Засечь время, затрачиваемое ArrayList и LinkedList на заполнение массива.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Sem4_Ex1 {
    public static void main(String[] args) {

        Random rnd = new Random();
        int size = 10000000;

        long arrayListTime = 0;
        long linkedListTime = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();       // По умолчанию размер 10. При его переполнении он увеличивается в 2 раза. 10, 20, 40, 80, 160 и т.д. Частота увеличений уменьшается с каждым шагом.
        LinkedList<Integer> linkedList = new LinkedList<>();    // Просто записывает новый элемент в конец. Работает быстрее ArrayList`а на относительно небольшом диапазоне записей

        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arrayList.add(rnd.nextInt(100));
        }
        long end = System.currentTimeMillis();
        arrayListTime = end - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            linkedList.add(rnd.nextInt(100));
        }
        end = System.currentTimeMillis();
        linkedListTime = end - start;

        System.out.println("Время заполнения ArrayList: " + arrayListTime);
        System.out.println("Время заполнения LinkedList: " + linkedListTime);
    }
}
